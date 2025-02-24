package com.github.ummo93.framework;

import lombok.Getter;
import lombok.Setter;
import org.bytedeco.javacpp.FloatPointer;
import org.bytedeco.javacpp.IntPointer;

import java.util.*;
import java.util.function.Predicate;

import static com.github.ummo93.utils.RaylibUtils.loadShaderResource;
import static com.github.ummo93.utils.RaylibUtils.vector4;
import static com.raylib.Colors.RAYWHITE;
import static com.raylib.Jaylib.*;
import static com.raylib.Raylib.*;


public abstract class Scene {
    private static final Vector4 DEFAULT_AMBIENT_LEVEL = vector4(0.8f, 0.8f, 0.8f, 1.0f);
    private Shader shader;
    private final List<Actor> actors = new ArrayList<>();
    private final List<Light> lightSources = new ArrayList<>();
    private final Queue<Actor> actorToDestroyQueue = new ArrayDeque<>();
    @Getter
    @Setter
    private Vector4 ambientLevel = DEFAULT_AMBIENT_LEVEL;
    @Getter
    private Camera3D camera3D;
    @Getter
    private Camera2D camera2D;

    public void reload() {
        if (!actors.isEmpty()) {
            actors.forEach(this::remove);
            lightSources.forEach(this::remove);
        }
        onEndFrame();
        actors.clear();
        lightSources.clear();
        actorToDestroyQueue.clear();
        camera3D = null;
        camera2D = null;
        this.onInit();
    }

    public void onInit() {

    }
    public void onUpdate(float dt) {

    }
    public void onDraw() {

    }
    public void onDestroy() {

    }
    public void beforeDraw() {

    }

    public void onEndFrame() {
        if (actorToDestroyQueue.isEmpty()) return;
        var actor = actorToDestroyQueue.remove();
        actor.onDestroy();
        actor.setScene(null);
        if (actor instanceof Light l) {
            lightSources.remove(l);
        } else {
            actors.remove(actor);
        }
    }

    public void drawHierarchy() {
        lightSources.forEach(Light::onDraw);
        actors.forEach(Actor::onDraw);
    }

    public void updateHierarchy(float dt) {
        lightSources.forEach((actor) -> actor.onBeforeUpdatePhysic(dt));
        actors.forEach((actor) -> actor.onBeforeUpdatePhysic(dt));
        lightSources.forEach((actor) -> actor.onUpdate(dt));
        actors.forEach((actor) -> actor.onUpdate(dt));
        lightSources.forEach((actor) -> actor.onUpdatePhysic(dt));
        actors.forEach((actor) -> actor.onUpdatePhysic(dt));
        if (hasLightSources()) {
            updateLightSources();
        }
    }

    private void updateLightSources() {
        // Update lights
        for (int i = 0; i < lightSources.size(); i++) {
            Light light = lightSources.get(i);
            int enabledLoc = getShaderLocation(shader, "lights["+i+"].enabled");
            int typeLoc = getShaderLocation(shader, "lights["+i+"].type");
            int positionLoc = getShaderLocation(shader, "lights["+i+"].position");
            int targetLoc = getShaderLocation(shader, "lights["+i+"].target");
            int colorLoc = getShaderLocation(shader, "lights["+i+"].color");
            if (enabledLoc == -1 || typeLoc == -1 || positionLoc == -1 || targetLoc == -1 || colorLoc == -1) {
                traceLog(LOG_ERROR, "Failed to get shader location for light properties");
                continue;
            }

            // Send to shader light enabled state and type
            final IntPointer lightEnabled = new IntPointer(1).put(1);
            final IntPointer lightType = new IntPointer(1).put(light.getLightType()); // 0 - dir, 1 - point

            setShaderValue(shader, enabledLoc, lightEnabled, SHADER_UNIFORM_INT);
            setShaderValue(shader, typeLoc, lightType, SHADER_UNIFORM_INT);

            final FloatPointer lightPos = new FloatPointer(3).put(light.position.x(), light.position.y(), light.position.z());
            // Send to shader light position values
            setShaderValue(shader, positionLoc, lightPos, SHADER_UNIFORM_VEC3);

            // Send to shader light target position values
            final FloatPointer target = new FloatPointer(3).put(light.rotation.x(), light.rotation.y(), light.rotation.z());
            setShaderValue(shader, targetLoc, target, SHADER_UNIFORM_VEC3);

            // Send to shader light color values
            Color lightColor = light.getColor();
            final FloatPointer color = new FloatPointer(4).put((lightColor.r() & 0xFF)/255f, (lightColor.g() & 0xFF)/255f, (lightColor.b()& 0xFF)/255f, (lightColor.a()& 0xFF) /255f);
            setShaderValue(shader, colorLoc, color, SHADER_UNIFORM_VEC4);
        }

        // Update shader point of view
        var camera = getCamera3D();
        if (camera != null) {
            var cameraPosPtr = new FloatPointer(3).put(camera._position().x(), camera._position().y(), camera._position().z());
            setShaderValue(shader, shader.locs().get(SHADER_LOC_VECTOR_VIEW), cameraPosPtr, SHADER_UNIFORM_VEC3);
        }
    }

    public Optional<Actor> findOne(Predicate<Actor> pred) {
        for (Actor actor : actors) {
            if (pred.test(actor)) {
                return Optional.of(actor);
            }
        }
        for (Actor actor : lightSources) {
            if (pred.test(actor)) {
                return Optional.of(actor);
            }
        }
        return Optional.empty();
    }

    public int raycast(CollisionInfo[] ref, Ray ray, Actor self) {
        if (ref.length == 0) return 0;
        int n = 0;
        for (var it : actors) {
            if (self != null && self.getId() == it.getId()) {
                continue;
            }
            var otherCollider = it.getCollider();
            if (otherCollider == null) continue;
            var collision = getRayCollisionBox(ray, otherCollider);
            if (collision.hit()) {
                ref[n] = new CollisionInfo();
                ref[n].setCollision(collision);
                ref[n].setOther(it);
                n++;
                if (n == ref.length) {
                    break;
                }
            }
        }
        return n;
    }

    public Optional<CollisionInfo> raycastOne(Ray ray, float hitDistance, Actor self) {
        CollisionInfo[] collisions = new CollisionInfo[1];
        if (raycast(collisions, ray, self) > 0 && collisions[0].collision.distance() < hitDistance) {
            CollisionInfo result = collisions[0];
            return Optional.of(result);
        }
        return Optional.empty();
    }

    public Color getBackgroundColor() {
        return RAYWHITE;
    }

    public Vector4 getDefaultAmbientLevel() {
        return ambientLevel;
    }

    public void spawn(Actor actor) {
        if (actor instanceof Light) {
            traceLog(LOG_ERROR, "Light should be added via the \"addLightSource\" method");
            return;
        }
        actors.add(actor);
        actor.setScene(this);
        actor.onInit();
    }

    public void remove(Actor actor) {
        actorToDestroyQueue.add(actor);
    }
    public void addLightSource(Light light) {
        lightSources.add(light);
        if (shader == null) {
            loadLightShader();
        }
    }
    public void addCamera(Camera3D camera3D) {
        this.camera3D = camera3D;
    }
    public void addCamera(Camera2D camera2D) {
        this.camera2D = camera2D;
    }

    public boolean hasLightSources() {
        return shader != null && !lightSources.isEmpty();
    }

    protected void loadLightShader() {
        // Load basic lighting shader
        shader = loadShaderResource("shader/lighting.vs", "shader/lighting.fs");
        if (shader == null) {
            traceLog(LOG_ERROR, "Failed to load light shader");
            return;
        }

        // Get some required shader locations
        shader.locs().put(SHADER_LOC_VECTOR_VIEW, getShaderLocation(shader, "viewPos"));
        if (shader.locs().get(SHADER_LOC_VECTOR_VIEW) == -1) {
            traceLog(LOG_ERROR, "Failed to get shader location for viewPos");
            return;
        }

        // Ambient light level (some basic lighting)
        int ambientLoc = getShaderLocation(shader, "ambient");
        if (ambientLoc == -1) {
            traceLog(LOG_ERROR, "Failed to get shader location for ambient");
            return;
        }

        var ambientLevel = getDefaultAmbientLevel();
        var val = new FloatPointer(4).put(ambientLevel.x(), ambientLevel.y(), ambientLevel.z(), ambientLevel.w());
        setShaderValue(shader, ambientLoc, val, SHADER_UNIFORM_VEC4);
    }

    protected Shader getLightShader() {
        return shader;
    }
}

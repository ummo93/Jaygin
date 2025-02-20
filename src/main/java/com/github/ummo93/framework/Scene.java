package com.github.ummo93.framework;

import lombok.Getter;

import java.util.*;
import java.util.function.Predicate;

import static com.raylib.Colors.RAYWHITE;
import static com.raylib.Raylib.*;


public abstract class Scene {
    private final List<Actor> actors = new ArrayList<>();
    private final Queue<Actor> actorToDestroyQueue = new ArrayDeque<>();

    @Getter
    private Camera3D camera3D;
    @Getter
    private Camera2D camera2D;

    public void onInit() {

    }
    public void onUpdate() {

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
        actors.remove(actor);
    }

    public void drawHierarchy() {
        actors.forEach(Actor::onDraw);
    }

    public void updateHierarchy() {
        actors.forEach(Actor::onBeforeUpdatePhysic);
        actors.forEach(Actor::onUpdate);
        actors.forEach(Actor::onUpdatePhysic);
    }

    public Optional<Actor> findOne(Predicate<Actor> pred) {
        for (Actor actor : actors) {
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
            var collision = GetRayCollisionBox(ray, otherCollider);
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

    public void spawn(Actor actor) {
        actors.add(actor);
        actor.setScene(this);
        actor.onInit();
    }
    public void remove(Actor actor) {
        actorToDestroyQueue.add(actor);
    }

    public void addCamera(Camera3D camera3D) {
        this.camera3D = camera3D;
    }
    public void addCamera(Camera2D camera2D) {
        this.camera2D = camera2D;
    }
}

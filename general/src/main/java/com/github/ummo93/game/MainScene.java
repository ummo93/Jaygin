package com.github.ummo93.game;

import static com.raylib.Colors.*;
import static com.raylib.Jaylib.*;
import static com.github.ummo93.utils.RaylibUtils.*;
import static com.raylib.Raylib.*;

import com.github.ummo93.framework.GameContext;
import com.github.ummo93.framework.Light;
import com.github.ummo93.framework.Scene;
import com.github.ummo93.framework.Skybox;
import com.github.ummo93.framework.service.TaskQueueService;
import com.google.inject.Inject;
import org.bytedeco.javacpp.FloatPointer;


public class MainScene extends Scene {
    private static final Vector4 DEFAULT_AMBIENT_LEVEL = vector4(0.025f, 0.025f, 0.025f, 0f);
    private static final Vector3 SUN_OFFSET_POS = vector3(-100, 1, -40);
    private CelestialBody station;
    private Light lightSource;
    private Skybox skybox;
    @Inject
    private GameContext ctx;
    @Inject
    private TaskQueueService taskService;

    @Override
    public void reload() {
        super.reload();
    }

    @Override
    public void onInit() {
        ctx.setCursorVisibility(false);

        lightSource = new Light(Light.LIGHT_TYPE_POINT, color(255, 255, 255, 255), VECTOR_3_ZERO, VECTOR_3_ZERO, 1f);
        addLightSource(lightSource);

        Image img = loadImageResource("skybox.png");
        skybox = new Skybox(img, CUBEMAP_LAYOUT_AUTO_DETECT, VECTOR_3_ZERO, VECTOR_3_ZERO, 500f);
        station = new CelestialBody(loadModelResource("model/station.glb"), VECTOR_3_ZERO);
        spawn(skybox);
        spawn(station);

        Vector3 cameraStartPos = vector3(-60f, -25, 13f);

        var camera = new Camera3D()
            ._position(cameraStartPos)
            .target(vector3(0.0f, 0.0f, 0.0f))
            .up(VECTOR_3_UP)
            .fovy(45)
            .projection(CAMERA_PERSPECTIVE);

        addCamera(camera);
    }

    @Override
    public void onUpdate(float dt) {
        var camera = getCamera3D();
        updateCamera(camera, CAMERA_FREE);
        lightSource.setPosition(vector3Add(camera._position(), SUN_OFFSET_POS));
        skybox.setPosition(camera._position());
    }

    @Override
    public void onDraw() {
        drawText("WASD to move", 20, ctx.getWindowHeight() - 40, 20, YELLOW);
        drawText("Vel: 200m/s", ctx.getWindowWidth() - 150, 20, 20, GREEN);
        drawFPS(ctx.getWindowWidth() - 100, ctx.getWindowHeight() - 30);
        guiProgressBar(rectangle(24, 24, 120, 20), "", "FUEL", new FloatPointer(90f), 0f, 100f);
    }

    @Override
    public Color getBackgroundColor() {
        return BLACK;
    }

    @Override
    public Vector4 getDefaultAmbientLevel() {
        return DEFAULT_AMBIENT_LEVEL;
    }
}

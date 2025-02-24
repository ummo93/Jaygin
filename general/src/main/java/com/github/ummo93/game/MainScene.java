package com.github.ummo93.game;

import static com.github.ummo93.utils.CameraUtils.*;
import static com.raylib.Colors.*;
import static com.raylib.Jaylib.*;
import static com.github.ummo93.utils.RaylibUtils.*;
import static com.raylib.Raylib.*;

import com.github.ummo93.framework.GameContext;
import com.github.ummo93.framework.Light;
import com.github.ummo93.framework.Scene;
import com.github.ummo93.framework.Skybox;
import com.github.ummo93.framework.service.TaskQueueService;
import com.github.ummo93.utils.RaylibUtils;
import com.google.inject.Inject;

import java.text.DecimalFormat;


public class MainScene extends Scene {
    private static final DecimalFormat FORMATTER = new DecimalFormat("#.#");
    private static final Vector4 DEFAULT_AMBIENT_LEVEL = vector4(0.025f, 0.025f, 0.025f, 0f);
    private static final Vector3 SUN_OFFSET_POS = vector3(-100, 1, -40);
    private CelestialBody station;
    private Light lightSource;
    private Skybox skybox;
    private Vector3 velocity = RaylibUtils.clone(VECTOR_3_ZERO);
    private Vector3 angularVelocity = RaylibUtils.clone(VECTOR_3_ZERO);
    @Inject
    private GameContext ctx;
    @Inject
    private TaskQueueService taskService;

    @Override
    public void onInit() {
        ctx.setCursorVisibility(false);

        lightSource = new Light(Light.LIGHT_TYPE_POINT, color(255, 255, 255, 255),
            RaylibUtils.clone(VECTOR_3_ZERO), RaylibUtils.clone(VECTOR_3_ZERO), 1f);
        skybox = new Skybox(loadImageResource("skybox.png"), CUBEMAP_LAYOUT_AUTO_DETECT,
            RaylibUtils.clone(VECTOR_3_ZERO), RaylibUtils.clone(VECTOR_3_ZERO), 500f);
        station = new CelestialBody(loadModelResource("model/station.glb"), RaylibUtils.clone(VECTOR_3_ZERO));

        addLightSource(lightSource);
        spawn(skybox);
        spawn(station);

        Vector3 cameraStartPos = vector3(-60f, -25, 13f);

        var camera = new Camera3D()
            ._position(cameraStartPos)
            .target(VECTOR_3_ZERO)
            .up(VECTOR_3_UP)
            .fovy(45)
            .projection(CAMERA_PERSPECTIVE);

        addCamera(camera);
    }

    @Override
    public void onUpdate(float dt) {
        var camera = getCamera3D();
        angularVelocity = updateFreeFlyCameraRotation(camera, angularVelocity, 0.0001f, 0.01f, dt);
        velocity = updateFreeFlyCameraVelocity(camera, velocity, 0.05f, 0.01f, dt);
        lightSource.setPosition(vector3Add(camera._position(), SUN_OFFSET_POS));
        skybox.setPosition(camera._position());
    }

    @Override
    public void onDraw() {
        var velocityText = String.format("Vel: %s m/s", FORMATTER.format(vector3Length(velocity)*10));
        drawText("WASD to move", 20, ctx.getWindowHeight() - 40, 20, YELLOW);
        drawText(velocityText, ctx.getWindowWidth() - 150, 20, 20, GREEN);
        drawFPS(ctx.getWindowWidth() - 100, ctx.getWindowHeight() - 30);
        drawText("<>", ctx.getWindowWidth()/2 - 10, ctx.getWindowHeight()/2 - 10, 25, GREEN);
//        guiProgressBar(rectangle(24, 24, 120, 20), "", "FUEL", new FloatPointer(90f), 0f, 100f);
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

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
    private Texture progradeTexture;
    private Texture retrogradeTexture;
    private Texture dockingWindowTexture;
    private Light lightSource;
    private Skybox skybox;
    private Vector3 velocity = RaylibUtils.clone(VECTOR_3_ZERO);
    private Vector3 angularVelocity = RaylibUtils.clone(VECTOR_3_ZERO);
    private Vector3 targetDockingRingPos = vector3(-13.257257f, -6.262537f, 2.335709f);
    private boolean killRot = false;
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
        progradeTexture = loadTextureResource("prograde_indicator.png");
        retrogradeTexture = loadTextureResource("retrograde_indicator.png");
        dockingWindowTexture = loadTextureResource("bigdiv.png");

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
        velocity = updateFreeFlyCameraVelocity(camera, velocity, 0.025f, 0.001f, dt);
        lightSource.setPosition(vector3Add(camera._position(), SUN_OFFSET_POS));
        skybox.setPosition(camera._position());
        killRot = isKeyDown(KEY_LEFT_SHIFT);
        if (killRot) {
            angularVelocity = vector3Scale(angularVelocity, 0.95f);
        }
    }

    @Override
    public void onDraw() {
        var camera = getCamera3D();
        var velocityText = String.format("Vel: %s m/s", FORMATTER.format(vector3Length(velocity)*100));
        drawText("WASD to move", 20, ctx.getWindowHeight() - 40, 20, YELLOW);
        drawText("LSHIFT to kill rot", 20, ctx.getWindowHeight() - 65, 20, YELLOW);
        drawText(velocityText, ctx.getWindowWidth() - 150, 20, 20, GREEN);
        drawFPS(ctx.getWindowWidth() - 100, ctx.getWindowHeight() - 30);
        drawText("+", ctx.getWindowWidth()/2 - 8, ctx.getWindowHeight()/2 - 12, 30, GREEN);
        var progradePos = getWorldToScreen(vector3Add(camera._position(), velocity), camera);
        var velIndicatorTexture = vector3Angle(getCameraForward(camera), velocity) > 1 ? retrogradeTexture: progradeTexture;
        drawTextureInCenterEx(velIndicatorTexture, vector2(progradePos.x(), progradePos.y()), 0, 0.22f, GREEN);
//        guiProgressBar(rectangle(24, 24, 120, 20), "", "FUEL", new FloatPointer(90f), 0f, 100f);
        if (killRot)
            drawText("KILL ROT", ctx.getWindowWidth()/2 - 10, ctx.getWindowHeight() - 30, 20, ORANGE);
        if (vector3Angle(getCameraForward(camera), targetDockingRingPos) > 1) {
            drawTextureInCenterEx(dockingWindowTexture, getWorldToScreen(targetDockingRingPos, camera), 0, 0.25f, GREEN);
        }
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

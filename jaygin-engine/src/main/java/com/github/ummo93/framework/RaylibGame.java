package com.github.ummo93.framework;

import com.github.ummo93.framework.config.RaylibSettings;
import com.github.ummo93.framework.service.GameClient;
import com.github.ummo93.framework.service.GameServer;
import com.github.ummo93.framework.service.TaskQueueService;
import com.google.inject.Inject;


import static com.raylib.Jaylib.*;


public class RaylibGame {
    @Inject
    private RaylibSettings settings;
    @Inject
    GameContext ctx;
    @Inject
    private Scene scene;
    @Inject
    private TaskQueueService taskService;
    @Inject(optional=true)
    private GameServer server;
    @Inject(optional=true)
    private GameClient client;

    private void refreshContext() {
        ctx.windowWidth = getScreenWidth();
        ctx.windowHeight = getScreenHeight();
        ctx.fps = getFPS();
        ctx.delta = getFrameTime();
    }

    public RaylibGame init() {
        initWindow(settings.getWindow().getWidth(), settings.getWindow().getHeight(), settings.getTitle());
        setWindowState(settings.getWindow().getWindowStateFlags());
        setTargetFPS(settings.getTargetFps());
        refreshContext();
        initAudioDevice();
        return this;
    }

    public void startGameLoop() {
        scene.onInit();

        while (!windowShouldClose()) {
            var camera2D = scene.getCamera();
            var isCameraMode = camera2D != null;

            refreshContext();
            scene.updateHierarchy(ctx.delta);
            scene.onUpdate(ctx.delta);

            beginDrawing();
            clearBackground(scene.getBackgroundColor());
            scene.drawOnBackground();

            if (isCameraMode) {
                beginMode2D(camera2D);
            }

            scene.beforeDraw();
            scene.drawHierarchy();

            if (isCameraMode) {
                endMode2D();
            }

            scene.onDraw();
            endDrawing();

            taskService.dequeSuitable();
            scene.onEndFrame();
        }

        scene.onDestroy();

        closeWindow();
        closeAudioDevice();
        if (settings.isMultiplayer()) {
            client.disconnect();
            server.stop();
        }
    }
}

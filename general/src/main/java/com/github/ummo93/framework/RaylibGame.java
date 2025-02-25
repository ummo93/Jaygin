package com.github.ummo93.framework;

import com.github.ummo93.config.RaylibSettings;
import com.github.ummo93.framework.service.GameClient;
import com.github.ummo93.framework.service.GameServer;
import com.github.ummo93.framework.service.TaskQueueService;
import com.google.inject.Inject;
import com.google.inject.Singleton;


import static com.raylib.Jaylib.*;


@Singleton
public class RaylibGame {
    @Inject
    private RaylibSettings settings;
    @Inject
    GameContext ctx;
    @Inject
    private Scene scene;
    @Inject
    private TaskQueueService taskService;
    @Inject
    private GameServer server;
    @Inject
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
            var camera2D = scene.getCamera2D();
            var camera3D = scene.getCamera3D();

            refreshContext();
            scene.updateHierarchy(ctx.delta);
            scene.onUpdate(ctx.delta);

            beginDrawing();
            clearBackground(scene.getBackgroundColor());

            if (camera3D != null) {
                beginMode3D(camera3D);
                scene.beforeDraw();
                scene.drawHierarchy();
                endMode3D();
            } else if (camera2D != null) {
                beginMode2D(camera2D);
                scene.beforeDraw();
                scene.drawHierarchy();
                endMode2D();
            } else {
                scene.beforeDraw();
                scene.drawHierarchy();
            }
            scene.onDraw();
            endDrawing();

            taskService.dequeSuitable();
            scene.onEndFrame();
        }

        scene.onDestroy();

        closeWindow();
        closeAudioDevice();
        client.disconnect();
        server.stop();
    }
}

package com.github.ummo93.framework;

import com.github.ummo93.config.RaylibSettings;
import com.github.ummo93.framework.service.TaskQueueService;
import com.google.inject.Inject;
import lombok.NoArgsConstructor;


import static com.raylib.Raylib.*;


@NoArgsConstructor
public class RaylibGame {

    @Inject
    private RaylibSettings settings;
    @Inject
    GameContext ctx;
    @Inject
    private Scene scene;
    @Inject
    private TaskQueueService taskService;

    private void refreshContext() {
        ctx.setWindowWidth(GetScreenWidth());
        ctx.setWindowHeight(GetScreenHeight());
    }

    public RaylibGame init() {
        InitWindow(settings.getWindow().getWidth(), settings.getWindow().getHeight(), settings.getTitle());
        SetWindowState(settings.getWindow().getWindowStateFlags());
        SetTargetFPS(settings.getTargetFps());
        refreshContext();
        return this;
    }

    public void startGameLoop() {
        scene.onInit();

        var camera2D = scene.getCamera2D();
        var camera3D = scene.getCamera3D();

        while (!WindowShouldClose()) {
            refreshContext();
            scene.updateHierarchy();
            scene.onUpdate();

            BeginDrawing();
            ClearBackground(scene.getBackgroundColor());

            if (camera3D != null) {
                BeginMode3D(camera3D);
                scene.beforeDraw();
                scene.drawHierarchy();
                EndMode3D();
            } else if (camera2D != null) {
                BeginMode2D(camera2D);
                scene.beforeDraw();
                scene.drawHierarchy();
                EndMode2D();
            } else {
                scene.beforeDraw();
                scene.drawHierarchy();
            }
            scene.onDraw();
            EndDrawing();

            taskService.dequeSuitable();
            scene.onEndFrame();
        }

        scene.onDestroy();

        CloseWindow();
    }
}

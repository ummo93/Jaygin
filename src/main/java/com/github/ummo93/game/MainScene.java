package com.github.ummo93.game;

import static com.raylib.Colors.*;
import static com.raylib.Raylib.*;
import static com.github.ummo93.utils.RaylibUtils.*;

import com.github.ummo93.framework.AnimatedTexture;
import com.github.ummo93.framework.GameContext;
import com.github.ummo93.framework.Scene;
import com.github.ummo93.utils.ResourceUtils;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import lombok.NoArgsConstructor;

@Singleton
@NoArgsConstructor
public class MainScene extends Scene {
    private AnimatedTexture starAnimation;
    private Texture background;
    private FighterShip player;
    @Inject
    private GameContext ctx;

    @Override
    public void onInit() {
        background = LoadTexture(ResourceUtils.getAssetPath("background.png"));
        starAnimation = new AnimatedTexture(
            LoadTexture(ResourceUtils.getAssetPath("star-spritesheet.png")),
            512, 512,
            0,
            10*10,
            10,
            1
        );
        player = new FighterShip(new Vector3(), new Vector3(), LoadTexture(ResourceUtils.getAssetPath("fighter.png")));
        var camera2D = new Camera2D().target(vector2(player.getPosition())).zoom(1.5f);

        spawn(player);
        addCamera(camera2D);
    }

    @Override
    public void onUpdate() {
        var camera2D = getCamera2D();
        camera2D.zoom(Clamp(camera2D.zoom() + GetMouseWheelMove() * .1f, 1f, 2.5f));
        camera2D.target(vector2(player.getPosition().x(), player.getPosition().y()));
        camera2D.offset(vector2(ctx.getWindowWidth() / 2.f, ctx.getWindowHeight() / 2.f));

        if (IsKeyDown(KEY_W)) {
            player.moveForward();
        } else if (IsKeyDown(KEY_S)) {
            player.moveBackward();
        } else {
            player.stopMove();
        }

        if (IsKeyDown(KEY_A)) {
            player.rotateCounterClockwise();
        } else if (IsKeyDown(KEY_D)) {
            player.rotateClockwise();
        } else {
            player.stopRotate();
        }

        if (IsKeyPressed(KEY_SPACE)) {
            player.shoot();
        } else {
            player.stopShoot();
        }
    }

    @Override
    public void beforeDraw() {
        drawTextureInCenterRepeat(background, new Vector2(), 1024, 0, WHITE);
        starAnimation.drawAnimation(50, 50);
    }

    @Override
    public void onDraw() {
        DrawText("Player", ctx.getWindowWidth()/2 - 20, ctx.getWindowHeight()/2 - 40 - (20 * (int)getCamera2D().zoom()), 14, GREEN);
        DrawText("WASD to move", 20, ctx.getWindowHeight() - 40, 20, YELLOW);
        DrawText("SPACE to shoot", 20, ctx.getWindowHeight() - 65, 20, YELLOW);
        DrawFPS(20, 20);
    }

    @Override
    public Color getBackgroundColor() {
        return BLACK;
    }
}

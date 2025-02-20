package com.github.ummo93.game;

import static com.raylib.Colors.*;
import static com.raylib.Raylib.*;
import static com.github.ummo93.utils.RaylibUtils.*;

import com.github.ummo93.framework.AnimatedTexture;
import com.github.ummo93.framework.GameContext;
import com.github.ummo93.framework.Scene;
import com.github.ummo93.framework.Timer;
import com.github.ummo93.utils.ResourceUtils;
import com.google.inject.Inject;
import org.bytedeco.javacpp.FloatPointer;


public class MainScene extends Scene {
    private FloatPointer playerHpPtr;
    private AnimatedTexture starAnimation;
    private Texture background;
    private FighterShip player;
    private FighterShip enemy;
    private Timer enemyShootTimer;
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
        enemy = new FighterShip(new Vector3().x(50).y(25), new Vector3(), LoadTexture(ResourceUtils.getAssetPath("enemy.png")));
        var camera2D = new Camera2D().target(vector2(player.getPosition())).zoom(1.5f);

        spawn(player);
        spawn(enemy);
        addCamera(camera2D);
        playerHpPtr = new FloatPointer((float) player.getHp());
    }

    @Override
    public void onUpdate() {
        enemyTurn();
        playerTurn();
    }

    @Override
    public void beforeDraw() {
        drawTextureInCenterRepeat(background, new Vector2(), 1024, 0, WHITE);
        starAnimation.drawAnimation(50, 50);
    }

    @Override
    public void onDraw() {
        DrawText("WASD to move", 20, ctx.getWindowHeight() - 40, 20, YELLOW);
        DrawText("SPACE to shoot", 20, ctx.getWindowHeight() - 65, 20, YELLOW);
        DrawFPS(ctx.getWindowWidth() - 100, ctx.getWindowHeight() - 30);
        if (player.isDestructed()) {
            DrawText("GAME OVER", ctx.getWindowWidth()/2 - 100, ctx.getWindowHeight()/2 - 20, 30, RED);
        } else {
            GuiProgressBar(rectangle(24, 24, 120, 20), "", "HP", playerHpPtr, 0.0f, (float)player.getMaxHp());
        }
    }

    @Override
    public Color getBackgroundColor() {
        return BLACK;
    }

    private void refreshEnemyShootingTimer() {
        if (enemyShootTimer == null) {
            enemyShootTimer = Timer.start(2);
        }
    }

    private void enemyTurn() {
        if (enemy.isDestructed())
            return;

        refreshEnemyShootingTimer();

        enemy.rotateCounterClockwise();

        if (!enemyShootTimer.isDone())
            return;

        Ray rayOnPlayer = ray(enemy.getPosition(), vector3(Vector2Scale(enemy.getForward2D(), 50)));
        var collisionInfo = raycastOne(rayOnPlayer, 50, enemy);
        if (collisionInfo.isPresent() && collisionInfo.get().getOther() instanceof Damagable) {
            enemy.shoot();
            enemyShootTimer = null;
            enemy.moveBackward();
        }
    }

    private void playerTurn() {
        if (player.isDestructed()) return;
        playerHpPtr.put((float) player.getHp());
        var camera2D = getCamera2D();
        camera2D.zoom(Clamp(camera2D.zoom() + GetMouseWheelMove() * .1f, 1f, 2.5f));
        camera2D.target(vector2(player.getPosition().x(), player.getPosition().y()));
        camera2D.offset(vector2(ctx.getWindowWidth() / 2.f, ctx.getWindowHeight() / 2.f));

        if (IsKeyDown(KEY_W)) {
            player.moveForward();
        }
        if (IsKeyDown(KEY_S)) {
            player.moveBackward();
        }

        if (IsKeyDown(KEY_A)) {
            player.rotateCounterClockwise();
        }
        if (IsKeyDown(KEY_D)) {
            player.rotateClockwise();
        }

        if (IsKeyPressed(KEY_SPACE)) {
            player.shoot();
        }
    }
}

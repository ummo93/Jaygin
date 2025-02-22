package com.github.ummo93.game;

import static com.raylib.Colors.*;
import static com.raylib.Jaylib.*;
import static com.github.ummo93.utils.RaylibUtils.*;
import static com.raylib.Jaylib.guiButton;
import static com.raylib.Raylib.*;

import com.github.ummo93.framework.AnimatedTexture;
import com.github.ummo93.framework.GameContext;
import com.github.ummo93.framework.Scene;
import com.github.ummo93.framework.service.TaskQueueService;
import com.github.ummo93.game.ai.AiBehaviourStrategy;
import com.google.inject.Inject;
import org.bytedeco.javacpp.FloatPointer;


public class MainScene extends Scene {
    private FloatPointer playerHpPtr;
    private AnimatedTexture starAnimation;
    private Texture background;
    private FighterShip player;
    private FighterShip enemy;
    private int killedEnemiesCounter = 0;
    private Texture enemyTexture;
    private Texture playerTexture;
    private Sound playerEngineSound;

    @Inject
    private AiBehaviourStrategy ai;
    @Inject
    private GameContext ctx;
    @Inject
    private TaskQueueService taskService;

    @Override
    public void reload() {
        killedEnemiesCounter = 0;
        super.reload();
    }

    @Override
    public void onInit() {
        preloadResources();

        player = new FighterShip(new Vector3(), new Vector3(), playerTexture);

        var camera2D = new Camera2D()
            .target(vector2(player.getPosition()))
            .zoom(1.5f);

        spawn(player);
        spawnEnemy(vector3(500f, 250f, 0f));
        addCamera(camera2D);

        if (playerHpPtr == null)
            playerHpPtr = new FloatPointer((float) player.getHp());
    }

    @Override
    public void onUpdate(float dt) {
        if (enemy != null) enemyTurn();
        if (player != null) playerTurn();
    }

    @Override
    public void beforeDraw() {
        drawTextureInCenterRepeat(background, new Vector2(), 1024, 0, WHITE);
        starAnimation.drawAnimation(50, 50);
    }

    @Override
    public void onDraw() {
        drawText("WASD to move", 20, ctx.getWindowHeight() - 40, 20, YELLOW);
        drawText("SPACE to shoot", 20, ctx.getWindowHeight() - 65, 20, YELLOW);
        drawText("SCORE: " + killedEnemiesCounter, ctx.getWindowWidth() - 120, 20, 20, GREEN);
        drawFPS(ctx.getWindowWidth() - 100, ctx.getWindowHeight() - 30);
        if (player == null || player.isDestructed()) {
            drawText("GAME OVER", ctx.getWindowWidth()/2 - 100, ctx.getWindowHeight()/2 - 20, 30, RED);
            if (guiButton(rectangle(ctx.getWindowWidth()/2f - 100, ctx.getWindowHeight()/2f + 130, 200, 30), "RESTART") != 0) {
                this.reload();
            }
        } else {
            guiProgressBar(rectangle(24, 24, 120, 20), "", "HP", playerHpPtr, 0.0f, (float)player.getMaxHp());
        }
    }

    @Override
    public Color getBackgroundColor() {
        return BLACK;
    }

    private void preloadResources() {
        if (starAnimation == null) {
            var starTexture = loadTextureResource("star-spritesheet.png");
            starAnimation = new AnimatedTexture(starTexture, 512, 512, 0, 10*10, 10, 1);
        }
        if (playerEngineSound == null) {
            playerEngineSound = loadSoundResource("engine.wav");
        }
        if (playerTexture == null) {
            playerTexture = loadTextureResource("fighter.png");
        }
        if (enemyTexture == null) {
            enemyTexture = loadTextureResource("enemy.png");
        }
        if (background == null) {
            background = loadTextureResource("background.png");
        }
    }

    private void spawnEnemy(Vector3 spawnPoint) {
        enemy = new FighterShip(spawnPoint, new Vector3(), enemyTexture);
        enemy.setVelocity(vector2Scale(VECTOR_RIGHT, 20));
        spawn(enemy);
    }

    private void onEnemyKilled() {
        killedEnemiesCounter++;
        final int offset = 1000;
        var playerPos = player.getPosition();
        var randomX = getRandomValue((int)playerPos.x() - offset, (int)playerPos.x() + offset);
        var randomY = getRandomValue((int)playerPos.y() - offset, (int)playerPos.y() + offset);
        spawnEnemy(vector3(randomX, randomY, 0f));
    }

    private void enemyTurn() {
        if (enemy.isDestructed()) {
            enemy = null;
            onEnemyKilled();
            return;
        }
        ai.turn(enemy, player, this);
    }

    private void playerTurn() {
        if (player.isDestructed()) {
            player = null;
            return;
        }
        playerHpPtr.put((float) player.getHp());
        var camera2D = getCamera2D();
        camera2D.zoom(clamp(camera2D.zoom() + getMouseWheelMove() * .1f, 1f, 2.5f));
        camera2D.target(vector2(player.getPosition().x(), player.getPosition().y()));
        camera2D.offset(vector2(ctx.getWindowWidth() / 2.f, ctx.getWindowHeight() / 2.f));

        if (isKeyDown(KEY_W)) {
            player.moveForward();
            if (!isSoundPlaying(playerEngineSound))
                playSound(playerEngineSound);
        }
        if (isKeyDown(KEY_S)) {
            player.moveBackward();
            if (!isSoundPlaying(playerEngineSound))
                playSound(playerEngineSound);
        }

        if (isKeyDown(KEY_A)) {
            player.rotateCounterClockwise();
        }
        if (isKeyDown(KEY_D)) {
            player.rotateClockwise();
        }

        if (isKeyPressed(KEY_SPACE)) {
            player.shoot();
        }
    }
}

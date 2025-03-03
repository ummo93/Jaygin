package com.github.ummo93.game;

import static com.raylib.Colors.*;
import static com.raylib.Jaylib.*;
import static com.github.ummo93.utils.RaylibUtils.*;
import static com.raylib.Jaylib.guiButton;
import static com.raylib.Raylib.*;

import com.github.ummo93.config.RaylibSettings;
import com.github.ummo93.framework.AnimatedTexture;
import com.github.ummo93.framework.GameContext;
import com.github.ummo93.framework.Scene;
import com.github.ummo93.framework.service.GameClient;
import com.github.ummo93.framework.service.GameServer;
import com.github.ummo93.framework.service.TaskQueueService;
import com.github.ummo93.game.ai.AiBehaviourStrategy;
import com.google.inject.Inject;
import org.bytedeco.javacpp.FloatPointer;

import java.io.IOException;
import java.util.Arrays;


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
    private RaylibSettings settings;
    @Inject(optional=true)
    private GameServer server;
    @Inject(optional=true)
    private GameClient client;
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
        var playerStartPos = new Vector3();
        var enemyStartPos = vector3(500f, 250f, 0f);
        var playerTextureTemp = playerTexture;
        var enemyTextureTemp = enemyTexture;

        if (settings.isMultiplayer()) {
            if (settings.isServer()) {
                setUpServer();
            } else {
                setUpClient();
                playerTexture = enemyTextureTemp;
                enemyTexture = playerTextureTemp;
                playerStartPos = vector3(500f, 250f, 0f);
                enemyStartPos = new Vector3();
            }
        }

        player = new FighterShip(playerStartPos, new Vector3(), playerTexture);

        var camera2D = new Camera2D()
            .target(vector2(player.getPosition()))
            .zoom(1.5f);

        spawn(player);
        spawnEnemy(enemyStartPos);
        addCamera(camera2D);

        if (playerHpPtr == null)
            playerHpPtr = new FloatPointer((float) player.getHp());
    }

    @Override
    public void onUpdate(float dt) {
        if (player != null) playerTurn();
        if (settings.isMultiplayer()) {
            return;
        }
        if (enemy != null) enemyTurn();
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
            if (!settings.isMultiplayer() && guiButton(rectangle(ctx.getWindowWidth()/2f - 100, ctx.getWindowHeight()/2f + 130, 200, 30), "RESTART") != 0) {
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

    private String[] serializePlayerData() {
        if (player == null) return new String[7];
        var bullets = player.getBullets().toArray();
        var lastBullet = bullets.length > 0 ? (Bullet)bullets[bullets.length - 1]: null;
        var data = new Float[] {
            player.getVelocity().x(),
            player.getVelocity().y(),
            player.getPosition().x(),
            player.getPosition().y(),
            player.getRotation().y(),
            player.isForwardEngineActive ? 1f: -1f,
            player.isBackwardEngineActive ? 1f: -1f,
            (float)bullets.length,
            lastBullet != null ? lastBullet.pos.x(): 0,
            lastBullet != null ? lastBullet.pos.y(): 0,
            lastBullet != null ? lastBullet.fwd.x(): 0,
            lastBullet != null ? lastBullet.fwd.y(): 0,

        };
        return Arrays.stream(data).map(String::valueOf).toArray(String[]::new);
    }

    private void deserializeEnemyData(String[] data) {
        if (enemy == null) return;
        try {
            var enemyVelX = Float.parseFloat(data[0]);
            var enemyVelY = Float.parseFloat(data[1]);
            var enemyPosX = Float.parseFloat(data[2]);
            var enemyPosY = Float.parseFloat(data[3]);
            var enemyRot = Float.parseFloat(data[4]);
            var isForwardEngineActive = Float.parseFloat(data[5]) > 0;
            var isBackwardEngineActive = Float.parseFloat(data[6]) > 0;
            var bulletCount = (int)Float.parseFloat(data[7]);
            var bulletPosX = Float.parseFloat(data[8]);
            var bulletPosY = Float.parseFloat(data[9]);
            var bulletFwdX = Float.parseFloat(data[10]);
            var bulletFwdY = Float.parseFloat(data[11]);
            if (isForwardEngineActive) {
                enemy.moveForward();
            }
            if (isBackwardEngineActive) {
                enemy.moveBackward();
            }
            enemy.setVelocity(vector2(enemyVelX, enemyVelY));
            enemy.setPosition(vector3(enemyPosX, enemyPosY, 0f));
            enemy.setRotation(vector3(0f, enemyRot, 0f));
            if (bulletCount > 0 && bulletCount > enemy.getBullets().size()) {
                enemy.emitBullet();
                var bullets = enemy.getBullets().toArray();
                var bullet = bullets.length == 0 ? null: (Bullet)bullets[bullets.length - 1];
                if (bullet == null) return;
                bullet.pos = vector2(bulletPosX, bulletPosY);
                bullet.fwd = vector2(bulletFwdX, bulletFwdY);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setUpServer() {
        server.setOnMessageHandler(this::deserializeEnemyData);
        server.setOnResponseHandler(this::serializePlayerData);
        try {
            server.start(settings.getServerPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setUpClient() {
        client.setRequestHandler(this::serializePlayerData);
        client.setOnResponseHandler(this::deserializeEnemyData);
        client.connect(settings.getServerHost(), settings.getServerPort(), 33); //33ms it's ~ 30fps
    }

    private void preloadResources() {
        loadGuiStyleResource("styles/terminal/style_terminal.rgs");
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

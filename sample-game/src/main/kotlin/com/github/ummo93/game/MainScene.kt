package com.github.ummo93.game

import com.github.ummo93.framework.AnimatedTexture
import com.github.ummo93.framework.GameContext
import com.github.ummo93.framework.Scene
import com.github.ummo93.framework.config.RaylibSettings
import com.github.ummo93.framework.service.GameClient
import com.github.ummo93.framework.service.GameServer
import com.github.ummo93.framework.service.TaskQueueService
import com.github.ummo93.framework.utils.RaylibUtils
import com.github.ummo93.game.ai.AiBehaviourStrategy
import com.google.inject.Inject
import com.raylib.Colors
import com.raylib.Jaylib.*
import com.raylib.Raylib.*
import org.bytedeco.javacpp.FloatPointer
import java.io.IOException

class MainScene : Scene() {
    private var playerHpPtr: FloatPointer? = null
    private var starAnimation: AnimatedTexture? = null
    private var background: Texture? = null
    private var player: FighterShip? = null
    private var enemy: FighterShip? = null
    private var killedEnemiesCounter = 0
    private var enemyTexture: Texture? = null
    private var playerTexture: Texture? = null
    private var playerEngineSound: Sound? = null

    @Inject
    private val ai: AiBehaviourStrategy? = null

    @Inject
    private val ctx: GameContext? = null

    @Inject
    private val settings: RaylibSettings? = null

    @Inject(optional = true)
    private val server: GameServer? = null

    @Inject(optional = true)
    private val client: GameClient? = null

    @Inject
    private val taskService: TaskQueueService? = null

    override fun reload() {
        killedEnemiesCounter = 0
        super.reload()
    }

    override fun onInit() {
        preloadResources()
        var playerStartPos: Vector2? = Vector2()
        var enemyStartPos = RaylibUtils.vector2(500f, 250f)
        val playerTextureTemp = playerTexture
        val enemyTextureTemp = enemyTexture

        if (settings!!.isMultiplayer) {
            if (settings.isServer) {
                setUpServer()
            } else {
                setUpClient()
                playerTexture = enemyTextureTemp
                enemyTexture = playerTextureTemp
                playerStartPos = RaylibUtils.vector2(500f, 250f)
                enemyStartPos = Vector2()
            }
        }

        player = FighterShip(playerStartPos, Vector2(), playerTexture)

        val camera2D = Camera2D()
            .target(player!!.position)
            .zoom(1.5f)

        spawn(player)
        spawnEnemy(enemyStartPos)
        addCamera(camera2D)

        if (playerHpPtr == null) playerHpPtr = FloatPointer(player!!.hp.toFloat())
    }

    override fun onUpdate(dt: Float) {
        if (player != null) playerTurn()
        if (settings!!.isMultiplayer) {
            return
        }
        if (enemy != null) enemyTurn()
    }

    override fun beforeDraw() {
        RaylibUtils.drawTextureInCenterRepeat(background, Vector2(), 1024f, 0f, Colors.WHITE)
        starAnimation!!.drawAnimation(50, 50)
    }

    override fun onDraw() {
        drawText("WASD to move", 20, ctx!!.windowHeight - 40, 20, Colors.YELLOW)
        drawText("SPACE to shoot", 20, ctx.windowHeight - 65, 20, Colors.YELLOW)
        drawText("SCORE: $killedEnemiesCounter", ctx.windowWidth - 120, 20, 20, Colors.GREEN)
        drawFPS(ctx.windowWidth - 100, ctx.windowHeight - 30)
        if (player == null || player!!.isDestructed) {
            drawText("GAME OVER", ctx.windowWidth / 2 - 100, ctx.windowHeight / 2 - 20, 30, Colors.RED)
            if (!settings!!.isMultiplayer && guiButton(
                    RaylibUtils.rectangle(
                        ctx.windowWidth / 2f - 100,
                        ctx.windowHeight / 2f + 130,
                        200f,
                        30f
                    ), "RESTART"
                ) != 0
            ) {
                this.reload()
            }
        } else {
            guiProgressBar(
                RaylibUtils.rectangle(24f, 24f, 120f, 20f),
                "",
                "HP",
                playerHpPtr,
                0.0f,
                player!!.maxHp
            )
        }
    }

    override fun getBackgroundColor(): Color {
        return Colors.BLACK
    }

    private fun serializePlayerData(): Array<String?> {
        if (player == null) return arrayOfNulls(7)
        val bullets = player!!.bullets
        val lastBullet = bullets.lastOrNull()
        val data = arrayOf<String?>(
            player!!.velocity.x().toString(),
            player!!.velocity.y().toString(),
            player!!.position.x().toString(),
            player!!.position.y().toString(),
            player!!.rotation.y().toString(),
            if (player!!.isForwardEngineActive) "1" else "-1",
            if (player!!.isBackwardEngineActive) "1" else "-1",
            bullets.size.toString(),
            if (lastBullet != null) lastBullet.pos!!.x().toString() else "0",
            if (lastBullet != null) lastBullet.pos!!.y().toString() else "0",
            if (lastBullet != null) lastBullet.fwd!!.x().toString() else "0",
            if (lastBullet != null) lastBullet.fwd!!.y().toString() else "0",
        )
        return data
    }

    private fun deserializeEnemyData(data: Array<String?>) {
        if (enemy == null) return
        try {
            val enemyVelX = if (data.size == 0) null else data[0]?.toFloatOrNull()
            val enemyVelY = if (data.size < 2) null else data[1]?.toFloatOrNull()
            val enemyPosX = if (data.size < 3) null else data[2]?.toFloatOrNull()
            val enemyPosY = if (data.size < 4) null else data[3]?.toFloatOrNull()
            val enemyRot = if (data.size < 5) null else data[4]?.toFloatOrNull()
            val isForwardEngineActive = if (data.size < 6 || data[5] == "null") false else data[5]!!.toFloat() > 0
            val isBackwardEngineActive = if (data.size < 7 || data[6] == "null") false else data[6]!!.toFloat() > 0
            val bulletCount = if (data.size < 8) null else data[7]?.toFloatOrNull()?.toInt()
            val bulletPosX = if (data.size < 9) null else data[8]?.toFloatOrNull()
            val bulletPosY = if (data.size < 10) null else data[9]?.toFloatOrNull()
            val bulletFwdX = if (data.size < 11) null else data[10]?.toFloatOrNull()
            val bulletFwdY = if (data.size < 12) null else data[11]?.toFloatOrNull()
            if (isForwardEngineActive) {
                enemy!!.moveForward()
            }
            if (isBackwardEngineActive) {
                enemy!!.moveBackward()
            }
            if (enemyVelX != null) enemy!!.velocity = (RaylibUtils.vector2(enemyVelX, enemyVelY!!))
            if (enemyPosX != null) enemy!!.position = RaylibUtils.vector2(enemyPosX, enemyPosY!!)
            if (enemyRot != null) enemy!!.rotation = RaylibUtils.vector2(0f, enemyRot)
            if (bulletCount != null && bulletPosX != null && bulletFwdX != null && bulletPosY != null && bulletFwdY != null &&
                bulletCount > 0 && bulletCount > enemy!!.bullets.size) {
                enemy!!.emitBullet()
                val bullets = enemy!!.bullets
                val bullet = bullets.lastOrNull() ?: return
                bullet.pos = RaylibUtils.vector2(bulletPosX, bulletPosY)
                bullet.fwd = RaylibUtils.vector2(bulletFwdX, bulletFwdY)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun setUpServer() {
        server?.setOnMessageHandler(this::deserializeEnemyData)
        server?.setOnResponseHandler(this::serializePlayerData)
        try {
            server?.start(settings!!.serverPort)
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun setUpClient() {
        client?.setRequestHandler(this::serializePlayerData)
        client?.setOnResponseHandler(this::deserializeEnemyData)
        client?.connect(settings!!.serverHost, settings.serverPort, 33) //33ms it's ~ 30fps
    }

    private fun preloadResources() {
        RaylibUtils.loadGuiStyleResource("styles/terminal/style_terminal.rgs")
        if (starAnimation == null) {
            val starTexture = RaylibUtils.loadTextureResource("star-spritesheet.png")
            starAnimation = AnimatedTexture(starTexture, 512, 512, 0, 10 * 10, 10, 1f)
        }
        if (playerEngineSound == null) {
            playerEngineSound = RaylibUtils.loadSoundResource("engine.wav")
        }
        if (playerTexture == null) {
            playerTexture = RaylibUtils.loadTextureResource("fighter.png")
        }
        if (enemyTexture == null) {
            enemyTexture = RaylibUtils.loadTextureResource("enemy.png")
        }
        if (background == null) {
            background = RaylibUtils.loadTextureResource("background.png")
        }
    }

    private fun spawnEnemy(spawnPoint: Vector2) {
        enemy = FighterShip(spawnPoint, Vector2(), enemyTexture)
        spawn(enemy)
    }

    private fun onEnemyKilled() {
        killedEnemiesCounter++
        val offset = 1000
        val playerPos = player!!.position
        val randomX = getRandomValue(playerPos.x().toInt() - offset, playerPos.x().toInt() + offset)
        val randomY = getRandomValue(playerPos.y().toInt() - offset, playerPos.y().toInt() + offset)
        spawnEnemy(RaylibUtils.vector2(randomX.toFloat(), randomY.toFloat()))
    }

    private fun enemyTurn() {
        if (enemy!!.isDestructed) {
            enemy = null
            onEnemyKilled()
            return
        }
        ai!!.turn(enemy, player, this)
    }

    private fun playerTurn() {
        if (player!!.isDestructed) {
            player = null
            return
        }
        playerHpPtr!!.put(player!!.hp.toFloat())
        val camera2D = camera
        camera2D.zoom(clamp(camera2D.zoom() + getMouseWheelMove() * .1f, 1f, 2.5f))
        camera2D.target(RaylibUtils.vector2(player!!.position.x(), player!!.position.y()))
        camera2D.offset(RaylibUtils.vector2(ctx!!.windowWidth / 2f, ctx.windowHeight / 2f))

        if (isKeyDown(KEY_W)) {
            player!!.moveForward()
            if (!isSoundPlaying(playerEngineSound)) playSound(playerEngineSound)
        }
        if (isKeyDown(KEY_S)) {
            player!!.moveBackward()
            if (!isSoundPlaying(playerEngineSound)) playSound(playerEngineSound)
        }

        if (isKeyDown(KEY_A)) {
            player!!.rotateCounterClockwise()
        }
        if (isKeyDown(KEY_D)) {
            player!!.rotateClockwise()
        }

        if (isKeyPressed(KEY_SPACE)) {
            player!!.shoot()
        }
    }
}
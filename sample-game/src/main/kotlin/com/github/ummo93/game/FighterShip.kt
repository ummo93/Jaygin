package com.github.ummo93.game

import com.github.ummo93.framework.AnimatedTexture
import com.github.ummo93.framework.actors.AnimatedActor
import com.github.ummo93.framework.actors.TexturedActor
import com.github.ummo93.framework.service.TaskQueueService
import com.github.ummo93.framework.utils.RaylibUtils
import com.raylib.Colors
import com.raylib.Jaylib
import com.raylib.Raylib.*
import java.util.*
import kotlin.math.abs

class FighterShip : TexturedActor, Controllable, Damagable {
    private val controlSignals: MutableSet<ControlSignal2D> = HashSet()
    private var explosionAnimation: AnimatedTexture? = null

    val bullets: Queue<Bullet> = ArrayDeque()

    var velocity: Vector2 = Jaylib.vector2Zero()

    var rotationVelocity = 0f

    val speed = .1f

    val maxSpeed = 50f

    val damage = 25f

    override var hp: Double = 100.0

    val maxHp: Float = 100.0f

    val maxBullets = 10

    val bulletSpeed = 15f

    val distanceToBulletDestroy = 800f

    var isForwardEngineActive: Boolean = false

    var isBackwardEngineActive: Boolean = false

    private var killSound: Sound? = null
    private var shootSound: Sound? = null
    private var explosionTexture: Texture? = null

    fun addCollider() {
        val collider = BoundingBox()
            .max(RaylibUtils.vector3(position.x() + texture.width() / 2f, position.y() + texture.height() / 2f, 0f))
            .min(RaylibUtils.vector3(position.x() - texture.width() / 2f, position.y() - texture.height() / 2f, 0f))
        setCollider(collider)
    }

    constructor(position: Vector2?, rotation: Vector2?, texture: Texture?) : super(position, rotation, texture) {
        addCollider()
    }

    constructor(texture: Texture?) : super(texture) {
        addCollider()
    }

    override fun moveForward() {
        controlSignals.add(ControlSignal2D.MOVE_FORWARD)
    }

    override fun moveBackward() {
        controlSignals.add(ControlSignal2D.MOVE_BACKWARD)
    }

    override fun rotateClockwise() {
        controlSignals.add(ControlSignal2D.ROTATE_CLOCKWISE)
    }

    override fun rotateCounterClockwise() {
        controlSignals.add(ControlSignal2D.ROTATE_COUNTERCLOCKWISE)
    }

    override fun shoot() {
        controlSignals.add(ControlSignal2D.SHOOT)
        Jaylib.playSound(shootSound)
    }

    override fun addDamage(damage: Double) {
        hp = Math.clamp(hp - damage, 0.0, maxHp.toDouble())
        if (hp == 0.0) {
            getScene().remove(this)
        }
    }

    override fun onInit() {
        explosionTexture = RaylibUtils.loadTextureResource("explosion-1.png")
        explosionAnimation = AnimatedTexture(explosionTexture!!, 32, 32, 0, 7, 7, 1f)
        killSound = RaylibUtils.loadSoundResource("blast.wav")
        shootSound = RaylibUtils.loadSoundResource("lazer.wav")
        super.onInit()
    }

    override fun onUpdate(dt: Float) {
        val newRotation = calculateRotation()
        val currentRotation = getRotation()
        setRotation(RaylibUtils.vector2(currentRotation.x(), currentRotation.y() + (dt * 45f * newRotation)))
        velocity = calculateVelocity()
        val newTranslatedPos = RaylibUtils.translate2D(position, Jaylib.vector2Scale(velocity, dt * 75f * speed), 1f)
        setPosition(newTranslatedPos)

        if (controlSignals.contains(ControlSignal2D.SHOOT)) {
            emitBullet()
        }

        refreshBulletsState(dt)
        controlSignals.clear()
    }

    override fun onDraw() {
        if (isForwardEngineActive) {
            drawForwardExhaust(position, forward)
        }
        if (isBackwardEngineActive) {
            drawBackwardExhaust(position, forward)
        }

        drawBullets()
        drawHeadingVector()
        super.onDraw()
    }

    override fun onDestroy() {
        val explosionPoint = Jaylib.vector2SubtractValue(position, explosionAnimation!!.frameWidth / 2f)
        val explosion = AnimatedActor(explosionPoint, rotation, explosionAnimation)
        val scene = getScene()
        scene.spawn(explosion)
        TaskQueueService.getInstance().enqueue({
            scene.remove(explosion)
            Jaylib.unloadTexture(explosionTexture)
            Jaylib.unloadSound(killSound)
        }, 1.0)
        Jaylib.unloadSound(shootSound)
        Jaylib.playSound(killSound)
        super.onDestroy()
    }

    fun emitBullet() {
        if (bullets.size > maxBullets - 1) {
            bullets.remove()
        }
        bullets.add(Bullet(position, forward))
    }

    protected fun drawBullets() {
        for (bullet in bullets) {
            Jaylib.drawLineEx(
                bullet.pos,
                Jaylib.vector2Add(bullet.pos, Jaylib.vector2Scale(bullet.fwd, 8f)),
                2f,
                Colors.RED
            )
        }
    }

    protected fun refreshBulletsState(dt: Float) {
        if (bullets.isEmpty()) return
        for (bullet in bullets) {
            bullet.pos = RaylibUtils.translate2D(bullet.pos, Jaylib.vector2Scale(bullet.fwd, dt * 800f), 1f)
            if (Jaylib.vector2Distance(bullet.pos, position) > distanceToBulletDestroy) {
                bullets.remove(bullet)
                break
            }
            val ray = RaylibUtils.ray(bullet.pos, bullet.fwd)
            val infoOpt = getScene().raycastOne(ray, 10f, this)
            if (infoOpt.isPresent) {
                val info = infoOpt.get()
                val other = info.other
                bullets.remove(bullet)
                if (other is Damagable) {
                    other.addDamage(damage.toDouble())
                }
                break
            }
        }
    }

    private fun drawHeadingVector() {
        val endPos = RaylibUtils.translate2D(position, velocity, 1f)
        Jaylib.drawText("<>", (endPos.x()).toInt() - 5, (endPos.y()).toInt() - 5, 14, Colors.DARKGREEN)
    }

    private fun drawForwardExhaust(origin: Vector2, fwd: Vector2) {
        val backward = Jaylib.vector2Negate(fwd)
        val endPosBezier = RaylibUtils.translate2D(origin, backward, Jaylib.getRandomValue(15, 25).toFloat())
        val endPosBezier2 = RaylibUtils.translate2D(origin, backward, Jaylib.getRandomValue(20, 30).toFloat())
        Jaylib.drawLineEx(endPosBezier, origin, 6f, RaylibUtils.color(112, 31, 126, 150))
        Jaylib.drawLineEx(endPosBezier2, origin, 2f, RaylibUtils.color(0, 121, 241, 200))
    }

    private fun drawBackwardExhaust(origin: Vector2, fwd: Vector2) {
        val endPosBezier = RaylibUtils.translate2D(origin, fwd, Jaylib.getRandomValue(8, 13).toFloat())
        val endPosBezier2 = RaylibUtils.translate2D(origin, fwd, 13f)
        Jaylib.drawLineEx(endPosBezier, origin, 18f, RaylibUtils.color(0, 121, 241, 150))
        Jaylib.drawLineEx(endPosBezier2, origin, 14f, Colors.BLACK)
    }

    private fun calculateRotation(): Float {
        val rotationSpeed = 0.5f
        val rotationMaxSpeed = 4f
        if (controlSignals.contains(ControlSignal2D.ROTATE_COUNTERCLOCKWISE)) {
            rotationVelocity = Jaylib.clamp(rotationVelocity - rotationSpeed, -rotationMaxSpeed, rotationMaxSpeed)
        } else if (controlSignals.contains(ControlSignal2D.ROTATE_CLOCKWISE)) {
            rotationVelocity = Jaylib.clamp(rotationVelocity + rotationSpeed, -rotationMaxSpeed, rotationMaxSpeed)
        } else {
            if (abs(rotationVelocity.toDouble()) > 0.05f) {
                rotationVelocity = if (rotationVelocity > 0) {
                    Jaylib.clamp(rotationVelocity - 0.1f, -rotationMaxSpeed, rotationMaxSpeed)
                } else {
                    Jaylib.clamp(rotationVelocity + 0.1f, -rotationMaxSpeed, rotationMaxSpeed)
                }
            }
        }
        return rotationVelocity
    }

    private fun calculateVelocity(): Vector2 {
        val fwd = forward
        var newVelocity = velocity
        if (controlSignals.contains(ControlSignal2D.MOVE_FORWARD)) {
            isForwardEngineActive = true
            isBackwardEngineActive = false
            newVelocity = Jaylib.vector2Add(newVelocity, fwd)
            if (Jaylib.vector2Length(newVelocity) > maxSpeed) {
                newVelocity = Jaylib.vector2Scale(Jaylib.vector2Normalize(newVelocity), maxSpeed)
            }
        } else if (controlSignals.contains(ControlSignal2D.MOVE_BACKWARD)) {
            isForwardEngineActive = false
            isBackwardEngineActive = true
            newVelocity = Jaylib.vector2Add(newVelocity, Jaylib.vector2Negate(fwd))
            if (Jaylib.vector2Length(newVelocity) > maxSpeed) {
                newVelocity = Jaylib.vector2Scale(Jaylib.vector2Normalize(newVelocity), maxSpeed)
            }
        } else {
            isForwardEngineActive = false
            isBackwardEngineActive = false
            newVelocity = if (Jaylib.vector2Length(newVelocity) > 0.25f) {
                Jaylib.vector2Scale(newVelocity, 0.996f)
            } else {
                RaylibUtils.vector2(0f, 0f)
            }
        }
        return newVelocity
    }
}

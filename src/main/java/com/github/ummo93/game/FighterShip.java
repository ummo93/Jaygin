package com.github.ummo93.game;

import com.github.ummo93.framework.ActorAnimated2D;
import com.github.ummo93.framework.ActorTexture2D;
import com.github.ummo93.framework.AnimatedTexture;
import com.github.ummo93.framework.service.TaskQueueService;
import com.github.ummo93.utils.ResourceUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

import static com.github.ummo93.game.ControlSignal2D.*;
import static com.github.ummo93.utils.RaylibUtils.*;
import static com.github.ummo93.utils.RaylibUtils.vector2;
import static com.raylib.Colors.*;
import static com.raylib.RaylibWrapper.*;
import static com.raylib.Raylib.Vector2;
import static com.raylib.Raylib.Vector3;
import static com.raylib.Raylib.BoundingBox;
import static com.raylib.Raylib.Texture;
import static com.raylib.Raylib.Ray;


public class FighterShip extends ActorTexture2D implements Controllable2D, Damagable {

    private final Set<ControlSignal2D> controlSignals = new HashSet<>();
    private AnimatedTexture explosionAnimation;
    @Getter
    private final Queue<Bullet> bullets = new ArrayDeque<>();

    @Getter
    @Setter
    private Vector2 velocity = vector2Zero();
    @Getter
    @Setter
    private float rotationVelocity = 0;
    @Getter
    private final float speed = .1f;
    @Getter
    private final float maxSpeed = 50.f;
    @Getter
    private final float damage = 45.f;
    @Getter
    private double hp = 100.0;
    @Getter
    private final double maxHp = 100.0;
    @Getter
    private final int maxBullets = 10;
    @Getter
    private final float bulletSpeed = 15.f;
    @Getter
    private final float distanceToBulletDestroy = 800.f;
    @Getter
    boolean isForwardEngineActive = false;
    @Getter
    boolean isBackwardEngineActive = false;

    public void addCollider() {
        var collider = new BoundingBox()
            .max(vector3(position.x() + texture.width()/2.f, position.y() + texture.height()/2.f, 0.f))
            .min(vector3(position.x() - texture.width()/2.f, position.y() - texture.height()/2.f, 0.f));
        setCollider(collider);
    }

    public FighterShip(Vector3 position, Vector3 rotation, Texture texture) {
        super(position, rotation, texture);
        addCollider();
    }
    public FighterShip(Texture texture) {
        super(texture);
        addCollider();
    }

    @Override
    public void moveForward() {
        controlSignals.add(MOVE_FORWARD);
    }

    @Override
    public void moveBackward() {
        controlSignals.add(MOVE_BACKWARD);
    }

    @Override
    public void rotateClockwise() {
        controlSignals.add(ROTATE_CLOCKWISE);
    }

    @Override
    public void rotateCounterClockwise() {
        controlSignals.add(ROTATE_COUNTERCLOCKWISE);
    }

    @Override
    public void shoot() {
        controlSignals.add(SHOOT);
    }

    @Override
    public void addDamage(double damage) {
        hp = Math.clamp(hp - damage, 0f, maxHp);
        if (hp == 0) {
            getScene().remove(this);
        }
    }

    @Override
    protected void onInit() {
        explosionAnimation = new AnimatedTexture(loadTexture(ResourceUtils.getAssetPath("explosion-1.png")),
            32, 32, 0, 7, 7, 1);
        super.onInit();
    }

    @Override
    protected void onUpdate() {
        var newRotation = calculateRotation();
        var currentRotation = getRotation();
        setRotation(vector3(currentRotation.x(), currentRotation.y() + newRotation, currentRotation.z()));
        setVelocity(calculateVelocity());
        var newTranslatedPos = translate2D(vector2(position), vector2Scale(velocity, speed), 1.f);
        setPosition(vector3(newTranslatedPos));

        if (controlSignals.contains(SHOOT)) {
            emitBullet();
        }

        refreshBulletsState();
        controlSignals.clear();
    }

    @Override
    protected void onDraw() {
        if (isForwardEngineActive) {
            drawForwardExhaust(vector2(position), getForward2D());
        }
        if (isBackwardEngineActive) {
            drawBackwardExhaust(vector2(position), getForward2D());
        }

        drawBullets();
        drawHeadingVector();
        super.onDraw();
    }

    @Override
    protected void onDestroy() {
        var explosion = new ActorAnimated2D(vector3SubtractValue(position, explosionAnimation.getFrameWidth()/2), rotation, explosionAnimation);
        var scene = getScene();
        scene.spawn(explosion);
        TaskQueueService.getInstance().enqueue(() -> scene.remove(explosion), 1);

        super.onDestroy();
    }

    protected void emitBullet() {
        if (bullets.size() > maxBullets - 1) {
            bullets.remove();
        }
        bullets.add(new Bullet(vector2(position), getForward2D()));
    }

    protected void drawBullets() {
        for (var bullet : bullets) {
            bullet.pos = translate2D(vector2(bullet.pos.x(), bullet.pos.y()), vector2Scale(bullet.fwd, 10), 1.f);
            drawLineEx(bullet.pos, vector2Add(bullet.pos, vector2Scale(bullet.fwd, 8)), 2, RED);
        }
    }

    protected void refreshBulletsState() {
        if (bullets.isEmpty()) return;
        for (var bullet : bullets) {
            if (vector2Distance(bullet.pos, vector2(position)) > distanceToBulletDestroy) {
                bullets.remove(bullet);
                break;
            }
            Ray ray = ray(bullet.pos, bullet.fwd);
            var infoOpt = getScene().raycastOne(ray, 10, this);
            if (infoOpt.isPresent()) {
                var info = infoOpt.get();
                var other = info.getOther();
                bullets.remove(bullet);
                if (other instanceof Damagable damagable) {
                    damagable.addDamage(damage);
                }
                break;
            }
        }

    }

    private void drawHeadingVector() {
        var endPos = translate2D(vector2(position), velocity, 1);
        drawText("<>", (int)(endPos.x()) - 5, (int)(endPos.y() ) - 5, 14, DARKGREEN);
    }

    private void drawForwardExhaust(Vector2 origin, Vector2 fwd) {
        var backward = vector2Negate(fwd);
        var endPosBezier = translate2D(origin, backward, getRandomValue(15, 25));
        var endPosBezier2 = translate2D(origin, backward, getRandomValue(20, 30));
        drawLineEx(endPosBezier, origin, 6.f, color(112, 31, 126, 150));
        drawLineEx(endPosBezier2, origin, 2.f, color(0, 121, 241, 200));
    }

    private void drawBackwardExhaust(Vector2 origin, Vector2 fwd) {
        var endPosBezier = translate2D(origin, fwd, getRandomValue(8, 13));
        var endPosBezier2 = translate2D(origin, fwd, 13);
        drawLineEx(endPosBezier, origin, 18.f, color(0, 121, 241, 150));
        drawLineEx(endPosBezier2, origin, 14.f, BLACK);
    }

    private float calculateRotation() {
        final float rotationSpeed = 0.5f;
        final float rotationMaxSpeed = 4.f;
        if (controlSignals.contains(ROTATE_COUNTERCLOCKWISE)) {
            rotationVelocity = clamp(rotationVelocity - rotationSpeed, -rotationMaxSpeed, rotationMaxSpeed);
        } else if (controlSignals.contains(ROTATE_CLOCKWISE)) {
            rotationVelocity = clamp(rotationVelocity + rotationSpeed, -rotationMaxSpeed, rotationMaxSpeed);
        } else {
            if (Math.abs(rotationVelocity) > 0.05f) {
                if (rotationVelocity > 0) {
                    rotationVelocity = clamp(rotationVelocity - 0.1f, -rotationMaxSpeed, rotationMaxSpeed);
                } else {
                    rotationVelocity = clamp(rotationVelocity + 0.1f, -rotationMaxSpeed, rotationMaxSpeed);
                }
            }
        }
        return rotationVelocity;
    }

    private Vector2 calculateVelocity() {
        var fwd = getForward2D();
        var newVelocity = velocity;
        if (controlSignals.contains(MOVE_FORWARD)) {
            isForwardEngineActive = true;
            isBackwardEngineActive = false;
            newVelocity = vector2Add(newVelocity, fwd);
            if (vector2Length(newVelocity) > maxSpeed) {
                newVelocity = vector2Scale(vector2Normalize(newVelocity), maxSpeed);
            }
        } else if (controlSignals.contains(MOVE_BACKWARD)) {
            isForwardEngineActive = false;
            isBackwardEngineActive = true;
            newVelocity = vector2Add(newVelocity, vector2Negate(fwd));
            if (vector2Length(newVelocity) > maxSpeed) {
                newVelocity = vector2Scale(vector2Normalize(newVelocity), maxSpeed);
            }
        } else {
            isForwardEngineActive = false;
            isBackwardEngineActive = false;
            if (vector2Length(newVelocity) > 0.25f) {
                newVelocity = vector2Scale(newVelocity, 0.996f);
            } else {
                newVelocity = vector2(0, 0);
            }
        }
        return newVelocity;
    }
}

package com.github.ummo93.game;

import com.github.ummo93.framework.ActorTexture2D;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import static com.github.ummo93.game.ControlSignal2D.*;
import static com.github.ummo93.utils.RaylibUtils.*;
import static com.github.ummo93.utils.RaylibUtils.vector2;
import static com.raylib.Colors.BLACK;
import static com.raylib.Colors.RED;
import static com.raylib.Raylib.*;
import static com.raylib.Raylib.Vector2Scale;

@Getter
public class FighterShip extends ActorTexture2D implements Controllable2D {

    private final Queue<Bullet> bullets = new ArrayDeque<>();

    @Setter
    private Vector2 velocity = Vector2Zero();
    @Setter
    private float rotationVelocity = 0;
    private final float speed = .1f;
    private final float maxSpeed = 50.f;
    private final double hp = 100.0;
    private final double maxHp = 100.0;
    private final int maxBullets = 10;
    private final float bulletSpeed = 15.f;
    private final float distanceToBulletDestroy = 800.f;
    boolean isForwardEngineActive = false;
    boolean isBackwardEngineActive = false;

    public FighterShip(Vector3 position, Vector3 rotation, Texture texture) {
        super(position, rotation, texture);
    }
    public FighterShip(Texture texture) {
        super(texture);
    }

    public void emitBullet() {
        if (bullets.size() > maxBullets - 1) {
            bullets.remove();
        }
        bullets.add(new Bullet(vector2(position), getForward2D()));
    }

    private float calculateRotation() {
        final float rotationSpeed = 0.5f;
        final float rotationMaxSpeed = 4.f;
        if (CONTROL_SIGNALS.contains(ROTATE_COUNTERCLOCKWISE)) {
            rotationVelocity = Clamp(rotationVelocity - rotationSpeed, -rotationMaxSpeed, rotationMaxSpeed);
        } else if (CONTROL_SIGNALS.contains(ROTATE_CLOCKWISE)) {
            rotationVelocity = Clamp(rotationVelocity + rotationSpeed, -rotationMaxSpeed, rotationMaxSpeed);
        } else {
            if (Math.abs(rotationVelocity) > 0.05f) {
                if (rotationVelocity > 0) {
                    rotationVelocity = Clamp(rotationVelocity - 0.1f, -rotationMaxSpeed, rotationMaxSpeed);
                } else {
                    rotationVelocity = Clamp(rotationVelocity + 0.1f, -rotationMaxSpeed, rotationMaxSpeed);
                }
            }
        }
        return rotationVelocity;
    }

    private Vector2 calculateVelocity() {
        var fwd = getForward2D();
        var newVelocity = velocity;
        if (CONTROL_SIGNALS.contains(MOVE_FORWARD)) {
            isForwardEngineActive = true;
            isBackwardEngineActive = false;
            newVelocity = Vector2Add(newVelocity, fwd);
            if (Vector2Length(newVelocity) > maxSpeed) {
                newVelocity = Vector2Scale(Vector2Normalize(newVelocity), maxSpeed);
            }
        } else if (CONTROL_SIGNALS.contains(MOVE_BACKWARD)) {
            isForwardEngineActive = false;
            isBackwardEngineActive = true;
            newVelocity = Vector2Add(newVelocity, Vector2Negate(fwd));
            if (Vector2Length(newVelocity) > maxSpeed) {
                newVelocity = Vector2Scale(Vector2Normalize(newVelocity), maxSpeed);
            }
        } else {
            isForwardEngineActive = false;
            isBackwardEngineActive = false;
            if (Vector2Length(newVelocity) > 0.25f) {
                newVelocity = Vector2Scale(newVelocity, 0.996f);
            } else {
                newVelocity = vector2(0, 0);
            }
        }
        return newVelocity;
    }

    private void drawForwardExhaust(Vector2 origin, Vector2 fwd) {
        var backward = Vector2Negate(fwd);
        var endPosBezier = translate2D(vector2(origin.x(), origin.y()), backward, GetRandomValue(15, 25));
        var endPosBezier2 = translate2D(vector2(origin.x(), origin.y()), backward, GetRandomValue(20, 30));
        DrawLineEx(endPosBezier, vector2(origin.x(), origin.y()), 6.f, color(112, 31, 126, 150));
        DrawLineEx(endPosBezier2, vector2(origin.x(), origin.y()), 2.f, color(0, 121, 241, 200));
    }

    private void drawBackwardExhaust(Vector2 origin, Vector2 fwd) {
        var endPosBezier = translate2D(vector2( origin.x(), origin.y()), fwd, GetRandomValue(8, 13));
        var endPosBezier2 = translate2D(vector2( origin.x(), origin.y()), fwd, 13);
        DrawLineEx(endPosBezier, vector2( origin.x(), origin.y()), 18.f, color(0, 121, 241, 150));
        DrawLineEx(endPosBezier2, vector2( origin.x(), origin.y()), 14.f, BLACK);
    }

    @Override
    protected void onUpdate() {
        var newRotation = calculateRotation();
        var currentRotation = getRotation();
        setRotation(vector3(currentRotation.x(), currentRotation.y() + newRotation, currentRotation.z()));
        setVelocity(calculateVelocity());
        var newTranslatedPos = translate2D(vector2(position), Vector2Scale(velocity, speed), 1.f);
        setPosition(vector3(newTranslatedPos));

        if (CONTROL_SIGNALS.contains(SHOOT)) {
            emitBullet();
        }

        if (!bullets.isEmpty()) {
            for (var bullet : bullets) {
                var bulletPos = bullet.pos;
//                var bulletFwd = bullet.fwd;
                if (Vector2Distance(bulletPos, vector2(position)) > distanceToBulletDestroy) {
                    bullets.remove(bullet);
                    break;
                }
//                Ray ray = { {bulletPos.x, bulletPos.y, 0 }, {bulletFwd.x, bulletFwd.y, 0 } };
//                if (auto info = Director::RaycastFirstByDist(ray, 10, this)) {
//                    bullets.erase(it);
//                    if (auto other = info->other.lock()) {
//                        if (auto damagable = std::dynamic_pointer_cast<IDamagable>(other)) {
//                            damagable->AddDamage(damage);
//                        }
//                    }
//                    break;
//                }
            }
        }
    }

    @Override
    protected void onDraw() {
        if (isForwardEngineActive) {
            drawForwardExhaust(vector2(position), getForward2D());
        }
        if (isBackwardEngineActive) {
            drawBackwardExhaust(vector2(position), getForward2D());
        }
        super.onDraw();

        for (var bullet : bullets) {
            bullet.pos = translate2D(vector2(bullet.pos.x(), bullet.pos.y()), Vector2Scale(bullet.fwd, 10), 1.f);
            DrawLineEx(bullet.pos, Vector2Add(bullet.pos, Vector2Scale(bullet.fwd, 8)), 2, RED);
        }
    }
}

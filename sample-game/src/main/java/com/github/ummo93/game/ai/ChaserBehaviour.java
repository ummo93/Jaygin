package com.github.ummo93.game.ai;

import com.github.ummo93.framework.Actor;
import com.github.ummo93.framework.Scene;
import com.github.ummo93.framework.Timer;
import com.github.ummo93.game.Controllable;
import com.github.ummo93.game.Damagable;
import com.raylib.Raylib;
import lombok.NoArgsConstructor;

import static com.raylib.Jaylib.*;
import static com.github.ummo93.framework.utils.RaylibUtils.*;

@NoArgsConstructor
public class ChaserBehaviour implements AiBehaviourStrategy {
    private static final float DISTANCE_TO_CONTACT = 70;
    private static final float HIT_DISTANCE = 20;
    private Timer shootTimer;

    private boolean isTargetObjectClockwise(Actor subject, Actor target) {
        var selfPos = subject.getPosition();
        var targetPos = target.getPosition();
        var selfFwd = subject.getForward();
        var toTargetX = targetPos.x() - selfPos.x();
        var toTargetY = targetPos.y() - selfPos.y();
        return (selfFwd.x() * toTargetY - selfFwd.y() * toTargetX) < 0;
    }

    private void refreshEnemyShootingTimer() {
        if (shootTimer == null) {
            shootTimer = Timer.start(0.5);
        }
    }

    @Override
    public <T extends Actor & Controllable> void turn(T subject, Actor target, Scene scene) {
        if (subject == null || target == null) return;
        refreshEnemyShootingTimer();

        if (isTargetObjectClockwise(subject, target)) {
            subject.rotateCounterClockwise();
        } else {
            subject.rotateClockwise();
        }

        if (vector2Distance(subject.getPosition(), target.getPosition()) > DISTANCE_TO_CONTACT) {
            subject.moveForward();
        }

        Raylib.Ray rayOnTarget = ray(subject.getPosition(), vector2Scale(subject.getForward(), HIT_DISTANCE));
        var collisionInfo = scene.raycastOne(rayOnTarget, HIT_DISTANCE, subject);
        var subjectAlignedToTarget = collisionInfo.isPresent() && collisionInfo.get().getOther() instanceof Damagable;

        if (!shootTimer.isDone())
            return;

        if (subjectAlignedToTarget) {
            subject.shoot();
            shootTimer = null;
        }
    }
}

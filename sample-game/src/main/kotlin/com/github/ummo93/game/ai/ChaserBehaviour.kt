package com.github.ummo93.game.ai

import com.github.ummo93.framework.Actor
import com.github.ummo93.framework.Scene
import com.github.ummo93.framework.Timer
import com.github.ummo93.framework.utils.RaylibUtils
import com.github.ummo93.game.Controllable
import com.github.ummo93.game.Damagable
import com.raylib.Jaylib.*

class ChaserBehaviour : AiBehaviourStrategy {
    private var shootTimer: Timer? = null

    private fun isTargetObjectClockwise(subject: Actor, target: Actor): Boolean {
        val selfPos = subject.position
        val targetPos = target.position
        val selfFwd = subject.forward
        val toTargetX = targetPos.x() - selfPos.x()
        val toTargetY = targetPos.y() - selfPos.y()
        return (selfFwd.x() * toTargetY - selfFwd.y() * toTargetX) < 0
    }

    private fun refreshEnemyShootingTimer() {
        if (shootTimer == null) {
            shootTimer = Timer.start(0.5)
        }
    }

    override fun <T> turn(subject: T, target: Actor?, scene: Scene?) where T : Actor?, T : Controllable? {
        if (subject == null || target == null) return
        refreshEnemyShootingTimer()

        if (isTargetObjectClockwise(subject, target)) {
            subject.rotateCounterClockwise()
        } else {
            subject.rotateClockwise()
        }

        if (vector2Distance(subject.position, target.position) > DISTANCE_TO_CONTACT) {
            subject.moveForward()
        }

        val rayOnTarget = RaylibUtils.ray(subject.position, vector2Scale(subject.forward, HIT_DISTANCE))
        val collisionInfo = scene!!.raycastOne(rayOnTarget, HIT_DISTANCE, subject)
        val subjectAlignedToTarget = collisionInfo.isPresent && collisionInfo.get().other is Damagable

        if (!shootTimer!!.isDone) return

        if (subjectAlignedToTarget) {
            subject.shoot()
            shootTimer = null
        }
    }

    companion object {
        private const val DISTANCE_TO_CONTACT = 70f
        private const val HIT_DISTANCE = 20f
    }
}
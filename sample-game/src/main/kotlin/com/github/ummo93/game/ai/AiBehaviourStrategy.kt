package com.github.ummo93.game.ai

import com.github.ummo93.framework.Actor
import com.github.ummo93.framework.Scene
import com.github.ummo93.game.Controllable

interface AiBehaviourStrategy {
    fun <T> turn(subject: T, target: Actor?, scene: Scene?) where T : Actor?, T : Controllable?
}
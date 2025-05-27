package com.github.ummo93.config

import com.github.ummo93.framework.Scene
import com.github.ummo93.game.MainScene
import com.github.ummo93.game.ai.ChaserBehaviour
import com.google.inject.AbstractModule
import com.github.ummo93.game.ai.AiBehaviourStrategy

class ModuleConfig : AbstractModule() {
    override fun configure() {
        bind(AiBehaviourStrategy::class.java).to(ChaserBehaviour::class.java)
        bind(Scene::class.java).to(MainScene::class.java).asEagerSingleton()
    }
}
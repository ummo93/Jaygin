package com.github.ummo93;

import com.github.ummo93.framework.Scene;
import com.github.ummo93.game.MainScene;
import com.github.ummo93.game.ai.AiBehaviourStrategy;
import com.github.ummo93.game.ai.ChaserBehaviour;
import com.google.inject.AbstractModule;

public class ModuleConfig extends AbstractModule {
    @Override
    protected void configure() {
        bind(AiBehaviourStrategy.class).to(ChaserBehaviour.class);
        bind(Scene.class).to(MainScene.class).asEagerSingleton();
    }
}

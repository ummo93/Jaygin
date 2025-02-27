package com.github.ummo93.config;


import com.github.ummo93.framework.GameContext;
import com.github.ummo93.framework.RaylibGame;
import com.github.ummo93.framework.service.TaskQueueService;
import com.github.ummo93.framework.service.impl.TaskQueueImpl;
import com.github.ummo93.game.MainScene;
import com.github.ummo93.framework.Scene;
import com.google.inject.AbstractModule;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

import com.github.ummo93.utils.StreamUtils;


public class AppModule extends AbstractModule {

    public RaylibSettings provideRaylibSettings() {
        Yaml yaml = new Yaml();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("raylib-settings.yaml");
        try {
            String yamlString = StreamUtils.replaceInYamlInputStream(inputStream, System.getenv());
            return yaml.loadAs(yamlString, RaylibSettings.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void configure() {
        bind(RaylibSettings.class).toProvider(this::provideRaylibSettings).asEagerSingleton();
        bind(RaylibGame.class).asEagerSingleton();
        bind(GameContext.class).asEagerSingleton();
        bind(TaskQueueService.class).to(TaskQueueImpl.class).asEagerSingleton();
        bind(Scene.class).to(MainScene.class).asEagerSingleton();
    }
}

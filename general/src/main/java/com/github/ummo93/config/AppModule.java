package com.github.ummo93.config;


import com.github.ummo93.framework.service.TaskQueueService;
import com.github.ummo93.framework.service.impl.TaskQueue;
import com.github.ummo93.game.MainScene;
import com.github.ummo93.framework.RaylibGame;
import com.github.ummo93.framework.Scene;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class AppModule extends AbstractModule {

    @Provides
    @Named("RaylibSettings")
    public RaylibSettings provideRaylibSettings() {
        Yaml yaml = new Yaml();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("raylib-settings.yaml");
        return yaml.loadAs(inputStream, RaylibSettings.class);
    }

    @Override
    protected void configure() {
        // Do this instead of @Singleton above @Provides which cause graalvm native image reflection error
        bind(RaylibSettings.class).toProvider(this::provideRaylibSettings).asEagerSingleton();
        bind(TaskQueueService.class).to(TaskQueue.class).asEagerSingleton();
        bind(Scene.class).to(MainScene.class).asEagerSingleton();
        bind(RaylibGame.class);
    }
}

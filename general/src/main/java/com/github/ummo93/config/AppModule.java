package com.github.ummo93.config;


import com.github.ummo93.framework.service.TaskQueueService;
import com.github.ummo93.framework.service.impl.TaskQueueImpl;
import com.github.ummo93.game.MainScene;
import com.github.ummo93.framework.Scene;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

import com.github.ummo93.utils.StreamUtils;

public class AppModule extends AbstractModule {

    @Provides
    @Named("RaylibSettings")
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
        // Do this instead of @Singleton above @Provides which cause graalvm native image reflection error
        bind(RaylibSettings.class).toProvider(this::provideRaylibSettings).asEagerSingleton();
        bind(TaskQueueService.class).to(TaskQueueImpl.class).asEagerSingleton();
        bind(Scene.class).to(MainScene.class).asEagerSingleton();
    }
}

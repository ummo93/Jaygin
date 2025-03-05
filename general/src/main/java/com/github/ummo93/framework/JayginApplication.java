package com.github.ummo93.framework;

import com.github.ummo93.framework.config.AppModule;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.ArrayList;
import java.util.Arrays;

public class JayginApplication {
    private static Injector injector;

    private final RaylibGame gameInstance;

    public JayginApplication(AbstractModule ...gameModules) {
        if (injector != null) {
            throw new RuntimeException("Application already started");
        }
        var modules = new ArrayList<>(Arrays.asList(gameModules));
        modules.addFirst(new AppModule());
        injector = Guice.createInjector(modules);
        gameInstance = injector.getInstance(RaylibGame.class);
    }

    public void start() {
        if (injector == null) {
            throw new RuntimeException("Application not started");
        }
        gameInstance.init();
        gameInstance.startGameLoop();
    }
}

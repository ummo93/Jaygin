package com.github.ummo93;


import com.github.ummo93.config.AppModule;
import com.github.ummo93.framework.RaylibGame;
import com.google.inject.Guice;

public class Main {
    public static void main(String[] args) {
        Guice.createInjector(new AppModule())
            .getInstance(RaylibGame.class)
            .init()
            .startGameLoop();
    }
}
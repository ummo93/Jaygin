package com.github.ummo93;

import com.github.ummo93.config.ModuleConfig;
import com.github.ummo93.framework.JayginApplication;

public class Launcher {
    public static void main(String[] args) {
        var game = new JayginApplication(new ModuleConfig());
        game.start();
    }
}
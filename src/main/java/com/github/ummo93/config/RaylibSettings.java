package com.github.ummo93.config;

import lombok.Data;

import static com.raylib.Raylib.*;

@Data
public class RaylibSettings {

    private String title;
    private int targetFps;
    private WindowSettings window;

    @Data
    public static class WindowSettings {
        private int width;
        private int height;
        private boolean resizable;
        private boolean vsync;
        private boolean fullscreen;
        private boolean undecorated;
        private boolean hidden;
        private boolean minimized;
        private boolean maximized;
        private boolean unfocused;
        private boolean topmost;
        private boolean alwaysRun;
        private boolean transparent;
        private boolean highDPI;
        private boolean mousePassthrough;
        private boolean borderlessWindowed;

        public int getWindowStateFlags() {
            int flags = 0;
            int[] flagsArray = {
                resizable ? FLAG_WINDOW_RESIZABLE : 0,
                vsync ? FLAG_VSYNC_HINT : 0,
                fullscreen ? FLAG_FULLSCREEN_MODE : 0,
                undecorated ? FLAG_WINDOW_UNDECORATED : 0,
                hidden ? FLAG_WINDOW_HIDDEN : 0,
                minimized ? FLAG_WINDOW_MINIMIZED : 0,
                maximized ? FLAG_WINDOW_MAXIMIZED : 0,
                unfocused ? FLAG_WINDOW_UNFOCUSED : 0,
                topmost ? FLAG_WINDOW_TOPMOST : 0,
                alwaysRun ? FLAG_WINDOW_ALWAYS_RUN : 0,
                transparent ? FLAG_WINDOW_TRANSPARENT : 0,
                highDPI ? FLAG_WINDOW_HIGHDPI : 0,
                mousePassthrough ? FLAG_WINDOW_MOUSE_PASSTHROUGH : 0,
                borderlessWindowed ? FLAG_BORDERLESS_WINDOWED_MODE : 0
            };
            for (int flag : flagsArray) {
                flags |= flag;
            }
            return flags;
        }
    }
}


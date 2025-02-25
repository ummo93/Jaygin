package com.github.ummo93.framework;


import com.google.inject.Singleton;
import lombok.Getter;

import static com.raylib.Raylib.*;
import static com.raylib.Raylib.ConfigFlags.*;


@Getter
@Singleton
public class GameContext {
    protected int windowWidth;
    protected int windowHeight;
    protected int fps;
    protected float delta;

    public boolean isAppAlwaysRun() {
        return isWindowState(FLAG_WINDOW_ALWAYS_RUN);
    }
    public boolean isWindowResizable() {
        return isWindowState(FLAG_WINDOW_RESIZABLE);
    }
    public boolean isVsyncMode() {
        return isWindowState(FLAG_VSYNC_HINT);
    }
    public boolean isHighDpiMode() {
        return isWindowState(FLAG_WINDOW_HIGHDPI);
    }
    public boolean isWindowFullscreen() {
        return isWindowState(FLAG_FULLSCREEN_MODE);
    }
    public boolean isWindowUndecorated() {
        return isWindowState(FLAG_WINDOW_UNDECORATED);
    }
    public boolean isWindowHidden() {
        return isWindowState(FLAG_WINDOW_HIDDEN);
    }
    public boolean isWindowMinimized() {
        return isWindowState(FLAG_WINDOW_MINIMIZED);
    }
    public boolean isWindowMaximized() {
        return isWindowState(FLAG_WINDOW_MAXIMIZED);
    }
    public boolean isWindowUnfocused() {
        return isWindowState(FLAG_WINDOW_UNFOCUSED);
    }
    public boolean isWindowTopmost() {
        return isWindowState(FLAG_WINDOW_TOPMOST);
    }
    public boolean isWindowTransparent() {
        return isWindowState(FLAG_WINDOW_TRANSPARENT);
    }
    public boolean isWindowBorderless() {
        return isWindowState(FLAG_BORDERLESS_WINDOWED_MODE);
    }
    public boolean isMousePassThrough() {
        return isWindowState(FLAG_WINDOW_MOUSE_PASSTHROUGH);
    }

    public void setAppAlwaysRun(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_ALWAYS_RUN);
        else clearWindowState(FLAG_WINDOW_ALWAYS_RUN);
    }
    public void setWindowResizable(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_RESIZABLE);
        else clearWindowState(FLAG_WINDOW_RESIZABLE);
    }
    public void setVsyncMode(boolean enabled) {
        if (enabled) setWindowState(FLAG_VSYNC_HINT);
        else clearWindowState(FLAG_VSYNC_HINT);
    }
    public void setHighDpiMode(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_HIGHDPI);
        else clearWindowState(FLAG_WINDOW_HIGHDPI);
    }
    public void setWindowFullscreen(boolean enabled) {
        if (enabled) setWindowState(FLAG_FULLSCREEN_MODE);
        else clearWindowState(FLAG_FULLSCREEN_MODE);
    }
    public void setWindowUndecorated(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_UNDECORATED);
        else clearWindowState(FLAG_WINDOW_UNDECORATED);
    }
    public void setWindowHidden(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_HIDDEN);
        else clearWindowState(FLAG_WINDOW_HIDDEN);
    }
    public void setWindowMinimized(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_MINIMIZED);
        else clearWindowState(FLAG_WINDOW_MINIMIZED);
    }
    public void setWindowMaximized(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_MAXIMIZED);
        else clearWindowState(FLAG_WINDOW_MAXIMIZED);
    }
    public void setWindowUnfocused(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_UNFOCUSED);
        else clearWindowState(FLAG_WINDOW_UNFOCUSED);
    }
    public void setWindowTopmost(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_TOPMOST);
        else clearWindowState(FLAG_WINDOW_TOPMOST);
    }
    public void setWindowTransparent(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_TRANSPARENT);
        else clearWindowState(FLAG_WINDOW_TRANSPARENT);
    }
    public void setWindowBorderless(boolean enabled) {
        if (enabled) setWindowState(FLAG_BORDERLESS_WINDOWED_MODE);
        else clearWindowState(FLAG_BORDERLESS_WINDOWED_MODE);
    }
    public void setMousePassThrough(boolean enabled) {
        if (enabled) setWindowState(FLAG_WINDOW_MOUSE_PASSTHROUGH);
        else clearWindowState(FLAG_WINDOW_MOUSE_PASSTHROUGH);
    }

    public void setCursorVisibility(boolean enabled) {
        if (enabled) {
            enableCursor();
        } else {
            disableCursor();
        }
    }
}

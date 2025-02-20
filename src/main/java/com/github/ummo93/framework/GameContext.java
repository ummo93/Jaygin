package com.github.ummo93.framework;


import jakarta.inject.Singleton;
import lombok.Data;

import static com.raylib.Raylib.*;

@Data
@Singleton
public class GameContext {
    private int windowWidth;
    private int windowHeight;

    public int getFrameRate() {
        return GetFPS();
    }

    public boolean hasWindowFlag(int flag) {
        return IsWindowState(flag);
    }

    public void setWindowFlag(int flag) {
        SetWindowState(flag);
    }

    public void clearWindowFlag(int flag) {
        ClearWindowState(flag);
    }
}

package com.github.ummo93.framework;


import jakarta.inject.Singleton;
import lombok.Data;

import static com.raylib.Jaylib.*;

@Data
@Singleton
public class GameContext {
    private int windowWidth;
    private int windowHeight;

    public int getFrameRate() {
        return getFPS();
    }

    public boolean hasWindowFlag(int flag) {
        return isWindowState(flag);
    }

    public void setWindowFlag(int flag) {
        setWindowState(flag);
    }

    public void clearWindowFlag(int flag) {
        clearWindowState(flag);
    }
}

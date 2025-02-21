package com.github.ummo93.framework;

import lombok.Getter;

import static com.raylib.RaylibWrapper.getTime;

@Getter
public class Timer {
    private final double startTime;
    private double lifetime;

    public static Timer start(double lifetime_sec) {
        return new Timer(lifetime_sec);
    }

    private Timer(double lifetime) {
        this.startTime = getTime();
        this.lifetime = lifetime;
    }

    public boolean isDone() {
        return startTime + lifetime < getTime();
    }
}

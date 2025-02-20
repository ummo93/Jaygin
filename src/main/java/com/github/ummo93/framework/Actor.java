package com.github.ummo93.framework;

import lombok.Getter;
import lombok.Setter;

import static com.github.ummo93.utils.RaylibUtils.*;
import static com.raylib.Raylib.*;

public abstract class Actor {
    private static long id = 0L;
    @Getter
    @Setter
    protected Vector3 position;
    @Getter
    @Setter
    protected Vector3 rotation;

    public Actor() {
        synchronized (Actor.class) {
            id++;
        }
    }

    public Actor(Vector3 position, Vector3 rotation) {
        synchronized (Actor.class) {
            id++;
        }
        this.position = position;
        this.rotation = rotation;
    }

    public long getId() {
        return id;
    }

    public Vector2 getForward2D()
    {
        return getHeadingByRotation2D(vector2(0.0f, -1.0f), rotation.y());
    }

    public Vector2 getRight2D()
    {
        return getHeadingByRotation2D(vector2(1.0f, 0.0f), rotation.y());
    }

    protected abstract void onDraw();
    protected void onInit() {}
    protected void onUpdate() {}
    protected void onDestroy() {}
}

package com.github.ummo93.framework;

import com.raylib.Raylib;
import lombok.Getter;
import lombok.Setter;

import static com.github.ummo93.framework.utils.RaylibUtils.*;
import static com.raylib.Jaylib.*;
import static com.raylib.Raylib.Vector2;
import static com.raylib.Raylib.BoundingBox;

public abstract class Actor {
    private static long id_couner = 0L;
    private Vector2 bodyLastPos;
    @Getter
    private long id;
    @Getter
    @Setter
    protected Vector2 position;
    @Getter
    @Setter
    protected Vector2 rotation;
    @Getter
    @Setter
    protected Scene scene;
    @Getter
    @Setter
    private BoundingBox collider;
    @Getter
    protected boolean destructed = false;

    public Actor() {
        synchronized (Actor.class) {
            id_couner++;
            id = id_couner;
        }
    }

    public Actor(Vector2 position, Vector2 rotation) {
        synchronized (Actor.class) {
            id_couner++;
            id = id_couner;
        }
        this.position = position;
        this.rotation = rotation;
    }

    public Vector2 getForward() {
        return getHeadingByRotation2D(VECTOR_UP, rotation.y());
    }

    public Vector2 getRight() {
        return getHeadingByRotation2D(VECTOR_RIGHT, rotation.y());
    }

    protected abstract void onDraw();
    protected void onInit() {}
    protected void onUpdate(float dt) {}
    protected void onDestroy() {
        destructed = true;
    }
    protected void onBeforeUpdatePhysic(float dt) {
        bodyLastPos = position;
    }
    protected void onUpdatePhysic(float dt) {
        if (collider == null) return;
        Raylib.Vector3 offsetSinceLastUpdate = vector3(vector2Subtract(position, bodyLastPos));
        collider.max(vector3Add(collider.max(), offsetSinceLastUpdate));
        collider.min(vector3Add(collider.min(), offsetSinceLastUpdate));
    }
}

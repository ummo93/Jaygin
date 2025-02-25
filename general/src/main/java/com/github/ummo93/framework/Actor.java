package com.github.ummo93.framework;

import lombok.Getter;
import lombok.Setter;

import static com.github.ummo93.utils.RaylibUtils.*;
import static com.raylib.Raylib.*;
import com.raylib.*;

public abstract class Actor {
    private static long id_couner = 0L;
    private Vector3 bodyLastPos;
    @Getter
    private long id;
    @Getter
    @Setter
    protected Vector3 position;
    @Getter
    @Setter
    protected Vector3 rotation;
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

    public Actor(Vector3 position, Vector3 rotation) {
        synchronized (Actor.class) {
            id_couner++;
            id = id_couner;
        }
        this.position = position;
        this.rotation = rotation;
    }

    public Vector2 getForward2D() {
        return getHeadingByRotation2D(VECTOR_UP, rotation.y());
    }

    public Vector2 getRight2D() {
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
        Vector3 offsetSinceLastUpdate = vector3Subtract(position, bodyLastPos);
        collider.max(vector3Add(collider.max(), offsetSinceLastUpdate));
        collider.min(vector3Add(collider.min(), offsetSinceLastUpdate));
    }
}

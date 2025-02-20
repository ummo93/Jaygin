package com.github.ummo93.framework;

import lombok.Getter;
import lombok.Setter;

import static com.github.ummo93.utils.RaylibUtils.*;
import static com.raylib.Raylib.*;

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
    private Scene scene;
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
    protected void onDestroy() {
        destructed = true;
    }
    protected void onBeforeUpdatePhysic() {
        bodyLastPos = position;
    }
    protected void onUpdatePhysic() {
        if (collider == null) return;
        Vector3 offsetSinceLastUpdate = Vector3Subtract(position, bodyLastPos);
        collider.max(Vector3Add(collider.max(), offsetSinceLastUpdate));
        collider.min(Vector3Add(collider.min(), offsetSinceLastUpdate));
    }
}

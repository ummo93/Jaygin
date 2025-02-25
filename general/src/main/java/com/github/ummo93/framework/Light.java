package com.github.ummo93.framework;

import lombok.Getter;

import static com.raylib.Raylib.*;
import com.raylib.*;

public class Light extends Actor {
    public static final int LIGHT_TYPE_DIRECTIONAL = 0;
    public static final int LIGHT_TYPE_POINT = 1;
    @Getter
    private Color color;
    @Getter
    private int lightType;
    @Getter
    private float bodyRadius = 5f;


    public Light(int lightType, Color color, Vector3 position, Vector3 rotation) {
        this.position = position;
        this.rotation = rotation;
        this.lightType = lightType;
        this.color = color;
    }

    public Light(int lightType, Color color, Vector3 position, Vector3 rotation, float bodyRadius) {
        this(lightType, color, position, rotation);
        this.bodyRadius = bodyRadius;
    }

    @Override
    protected void onDraw() {
        drawSphere(position, bodyRadius, color);
    }
}

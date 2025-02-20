package com.github.ummo93.utils;

import com.raylib.*;

import static com.raylib.Raylib.*;
import static java.lang.Math.PI;

public class RaylibUtils {
    public static Vector2 vector2(float x, float y) {
        return new Vector2(x, y);
    }

    public static Vector2 vector2(Vector3 vec3) {
        return new Vector2(vec3.x(), vec3.y());
    }

    public static Vector3 vector3(float x, float y, float z) {
        return new Vector3(x, y, z);
    }

    public static Vector3 vector3(Vector2 vec2) {
        return new Vector3(vec2.x(), vec2.y(), 0.f);
    }

    public static Rectangle rectangle(float x, float y, float width, float height) {
        return new Rectangle(x, y, width, height);
    }

    public static Vector2 getHeadingByRotation2D(Vector2 absoluteHeading, float rotation) {
        absoluteHeading = vector2Rotate(absoluteHeading, rotation * (float)PI/180);
        absoluteHeading = vector2Normalize(absoluteHeading);
        return absoluteHeading;
    }

    public static Vector2 translate2D(Vector2 origin, Vector2 dir, float strength)
    {
        return vector2Add(vector2(origin.x(), origin.y()), vector2Scale(dir, strength));
    }

    public static Color color(int r, int g, int b, int a) {
        return new Color((byte)r, (byte)g, (byte)b, (byte)a);
    }

    public static Ray ray(Vector3 start, Vector3 end) {
        return new Ray(start, end);
    }

    public static Ray ray(Vector2 start, Vector2 end) {
        return new Ray(vector3(start), vector3(end));
    }

    public static void drawTextureInCenter(Texture texture, Vector2 pos, float rotation) {
        drawTexturePro(
            texture,
            rectangle(0,0, texture.width(), texture.height()),
            rectangle(pos.x(),pos.y(), texture.width(), texture.height()),
            vector2(texture.width()/2.f, texture.height()/2.f),
            rotation,
            WHITE
        );
    }

    public static void drawTextureInCenterRepeat(Texture texture, Vector2 pos, float scale, float rotation, Color tint) {
        var pivot = vector2(texture.width() / 2.f , texture.height() / 2.f);
        drawTexturePro(
            texture,
            rectangle(0,0, texture.width() * scale, texture.height() * scale),
            rectangle(pos.x() - pivot.x(), pos.y() - pivot.y(), texture.width() * scale, texture.height() * scale),
            vector2((texture.width() * scale)/2.f, (texture.height() * scale)/2.f),
            rotation,
            tint
        );
    }
}

package com.github.ummo93.utils;

import com.raylib.Colors;
import com.raylib.Helpers;
import org.bytedeco.javacpp.Pointer;

import static com.raylib.Raylib.*;

public class RaylibUtils {
    public static Vector2 vector2(float x, float y) {
        return com.raylib.Helpers.newVector2(x, y);
    }

    public static Vector2 vector2(Vector3 vec3) {
        return com.raylib.Helpers.newVector2(vec3.x(), vec3.y());
    }

    public static Vector3 vector3(float x, float y, float z) {
        return com.raylib.Helpers.newVector3(x, y, z);
    }

    public static Vector3 vector3(Vector2 vec2) {
        return com.raylib.Helpers.newVector3(vec2.x(), vec2.y(), 0.f);
    }

    public static Rectangle rectangle(float x, float y, float width, float height) {
        return com.raylib.Helpers.newRectangle(x, y, width, height);
    }

    public static Vector2 getHeadingByRotation2D(Vector2 absoluteHeading, float rotation) {
        absoluteHeading = Vector2Rotate(absoluteHeading, rotation * (float)DEG2RAD);
        absoluteHeading = Vector2Normalize(absoluteHeading);
        return absoluteHeading;
    }

    public static Vector2 translate2D(Vector2 origin, Vector2 dir, float strength)
    {
        return Vector2Add(vector2(origin.x(), origin.y()), Vector2Scale(dir, strength));
    }

    public static Color color(int r, int g, int b, int a) {
        return com.raylib.Helpers.newColor(r, g, b, a);
    }

    public static Ray ray(Vector3 start, Vector3 end) {
        return Helpers.newRay(vector3(start.x(), start.y(), start.z()), vector3(end.x(), end.y(), end.z()));
    }

    public static Ray ray(Vector2 start, Vector2 end) {
        return Helpers.newRay(vector3(start.x(), start.y(), 0), vector3(end.x(), end.y(), 0));
    }

    public static <T extends Pointer> void putToCppArrayEx(T arrayRef, T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arrayRef.position(i);
            arrayRef.put(arr[i]);
        }
        arrayRef.position(0);
    }
    public static <T extends Pointer> void putToCppArray(T arrayRef, T ...arr) {
        for (int i = 0; i < arr.length; i++) {
            arrayRef.position(i);
            arrayRef.put(arr[i]);
        }
        arrayRef.position(0);
    }

    public static void drawTextureInCenter(Texture texture, Vector2 pos, float rotation) {
        DrawTexturePro(
            texture,
            rectangle(0,0, texture.width(), texture.height()),
            rectangle(pos.x(),pos.y(), texture.width(), texture.height()),
            vector2(texture.width()/2.f, texture.height()/2.f),
            rotation,
            Colors.WHITE
        );
    }

    public static void drawTextureInCenterRepeat(Texture texture, Vector2 pos, float scale, float rotation, Color tint) {
        var pivot = vector2(texture.width() / 2.f , texture.height() / 2.f);
        DrawTexturePro(
            texture,
            rectangle(0,0, texture.width() * scale, texture.height() * scale),
            rectangle(pos.x() - pivot.x(), pos.y() - pivot.y(), texture.width() * scale, texture.height() * scale),
            vector2((texture.width() * scale)/2.f, (texture.height() * scale)/2.f),
            rotation,
            tint
        );
    }
}

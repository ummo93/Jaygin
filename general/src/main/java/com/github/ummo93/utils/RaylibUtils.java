package com.github.ummo93.utils;

import com.raylib.Colors;
import com.raylib.Helpers;
import com.raylib.Raylib;
import org.bytedeco.javacpp.Pointer;

import static com.raylib.Jaylib.*;
import static com.raylib.Raylib.Vector2;
import static com.raylib.Raylib.Vector3;
import static com.raylib.Raylib.Vector4;
import static com.raylib.Raylib.Color;
import static com.raylib.Raylib.Rectangle;
import static com.raylib.Raylib.DEG2RAD;
import static com.raylib.Raylib.Ray;
import static com.raylib.Raylib.Texture;
import static com.raylib.Raylib.Image;
import static com.raylib.Raylib.Model;
import static com.raylib.Raylib.Shader;
import com.raylib.Raylib.Sound;


public class RaylibUtils {
    public static final Vector2 VECTOR_UP = vector2(0.0f, -1.0f);
    public static final Vector3 VECTOR_3_UP = vector3(0.0f, 1.0f, 0.0f);
    public static final Vector2 VECTOR_RIGHT = vector2(1.0f, 0.0f);
    public static final Vector2 VECTOR_ZERO = vector2(0.0f, 0.0f);
    public static final Vector3 VECTOR_3_ZERO = vector3(0.0f, 0.0f, 0.0f);

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
    public static Vector4 vector4(float x, float y, float z, float w) {
        return new Vector4().x(x).y(y).z(z).w(w);
    }

    public static Rectangle rectangle(float x, float y, float width, float height) {
        return com.raylib.Helpers.newRectangle(x, y, width, height);
    }

    public static Texture loadTextureResource(String resourceFileName) {
        return loadTexture(ResourceUtils.getAssetPath(resourceFileName));
    }

    public static Sound loadSoundResource(String resourceFileName) {
        return loadSound(ResourceUtils.getAssetPath(resourceFileName));
    }

    public static Model loadModelResource(String resourceFileName) {
        return loadModel(ResourceUtils.getAssetPath(resourceFileName));
    }

    public static Shader loadShaderResource(String vsFileName, String fsFileName) {
        return loadShader(ResourceUtils.getAssetPath(vsFileName), ResourceUtils.getAssetPath(fsFileName));
    }

    public static Image loadImageResource(String resourceFileName) {
        return loadImage(ResourceUtils.getAssetPath(resourceFileName));
    }

    public static Vector2 getHeadingByRotation2D(Vector2 absoluteHeading, float rotation) {
        absoluteHeading = vector2Rotate(absoluteHeading, rotation * (float)DEG2RAD);
        absoluteHeading = vector2Normalize(absoluteHeading);
        return absoluteHeading;
    }

    public static Vector2 translate2D(Vector2 origin, Vector2 dir, float strength)
    {
        return vector2Add(origin, vector2Scale(dir, strength));
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
        drawTexturePro(
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

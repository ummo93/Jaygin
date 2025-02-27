package com.github.ummo93.utils;

import com.raylib.Colors;
import com.raylib.Helpers;
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

    public static Vector2 clone(Vector2 vector2) {
        return new Vector2().x(vector2.x()).y(vector2.y());
    }

    public static Vector3 clone(Vector3 vector3) {
        return new Vector3().x(vector3.x()).y(vector3.y()).z(vector3.z());
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

    public static Vector3 translate3D(Vector3 origin, Vector3 dir, float strength)
    {
        return vector3Add(origin, vector3Scale(dir, strength));
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

    public static void drawTextureInCenterEx(Texture texture, Vector2 pos, float rotation, float scale, Color tint) {
        drawTextureInCenterEx(texture, pos, rotation, vector2(scale, scale), tint);
    }

    public static void drawTextureInCenterEx(Texture texture, Vector2 pos, float rotation, Vector2 scale, Color tint) {
        var scaledWidth = texture.width() * scale.x();
        var scaledHeight = texture.height() * scale.x();
        drawTexturePro(
            texture,
            rectangle(0,0, texture.width(), texture.height()),
            rectangle(pos.x(),pos.y(), scaledWidth, scaledHeight),
            vector2(scaledWidth/2.f, scaledHeight/2.f),
            rotation,
            tint
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

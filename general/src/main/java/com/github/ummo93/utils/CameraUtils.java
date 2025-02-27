package com.github.ummo93.utils;

import static com.github.ummo93.utils.RaylibUtils.VECTOR_3_ZERO;
import static com.github.ummo93.utils.RaylibUtils.translate3D;
import static com.raylib.Raylib.KEY_E;
import static com.raylib.Raylib.KEY_W;
import static com.raylib.Raylib.KEY_A;
import static com.raylib.Raylib.KEY_S;
import static com.raylib.Raylib.KEY_SPACE;
import static com.raylib.Raylib.KEY_LEFT_CONTROL;
import static com.raylib.Raylib.KEY_D;
import static com.raylib.Raylib.KEY_Q;
import static com.raylib.Raylib.Vector2;
import static com.raylib.Raylib.Vector3;
import static com.raylib.Raylib.Camera3D;
import static com.raylib.Raylib.Matrix;
import static com.raylib.Jaylib.*;

public class CameraUtils {

    private static final float DEFAULT_MOUSE_SENSITIVITY = 0.1f;
    private static final float DEFAULT_MOVE_SPEED = 4f;
    private static final float DEFAULT_ROLL_SPEED = 0.5f;

    public static Vector3 getCameraForward(Camera3D camera) {
        Vector3 forward = vector3Subtract(camera.target(), camera._position());
        return vector3Normalize(forward);
    }

    public static Vector3 updateFreeFlyCameraRotation(Camera3D camera, Vector3 angularVelocity, float mouseSensitivity, float rollSpeed, float dt) {
        angularVelocity = RaylibUtils.clone(angularVelocity);
        Vector2 mouseDelta = getMouseDelta();

        float yaw = -mouseDelta.x() * mouseSensitivity * dt;
        angularVelocity.x(angularVelocity.x() + yaw);
        float pitch = -mouseDelta.y() * mouseSensitivity * dt;
        angularVelocity.y(angularVelocity.y() + pitch);

        Vector3 forward = vector3Subtract(camera.target(), camera._position());
        forward = vector3Normalize(forward);

        Matrix rotationYaw = matrixRotate(camera.up(), angularVelocity.x());
        Vector3 right = vector3CrossProduct(forward, camera.up());
        Matrix rotationPitch = matrixRotate(right, angularVelocity.y());

        forward = vector3Transform(forward, rotationYaw);
        forward = vector3Transform(forward, rotationPitch);

        camera.target(vector3Add(camera._position(), forward));

        right = vector3CrossProduct(forward, camera.up());
        right = vector3Normalize(right);

        Vector3 up = vector3CrossProduct(right, forward);
        camera.up(vector3Normalize(up));

        if (isKeyDown(KEY_Q)) {
            angularVelocity.z(angularVelocity.z() - (rollSpeed * dt));
        }
        if (isKeyDown(KEY_E)) {
            angularVelocity.z(angularVelocity.z() + (rollSpeed * dt));
        }

        Matrix rotationRoll = matrixRotate(forward, angularVelocity.z());
        camera.up(vector3Transform(camera.up(), rotationRoll));
        return angularVelocity;
    }

    public static Vector3 updateFreeFlyCameraVelocity(Camera3D camera, Vector3 velocity, float moveSpeed, float sideSpeed, float dt) {
        Vector3 forward = vector3Subtract(camera.target(), camera._position());
        forward = vector3Normalize(forward);

        Vector3 right = vector3CrossProduct(forward, camera.up());
        right = vector3Normalize(right);

        Vector3 up = vector3CrossProduct(right, forward);
        camera.up(vector3Normalize(up));

        Vector3 translation = velocity;
        if (isKeyDown(KEY_W)) {
            translation = translate3D(translation, forward, moveSpeed * dt);
        }
        if (isKeyDown(KEY_A)) {
            translation = translate3D(translation, right, -sideSpeed * dt);
        }
        if (isKeyDown(KEY_S)) {
            translation = translate3D(translation, forward, -moveSpeed * dt);
        }
        if (isKeyDown(KEY_D)) {
            translation = translate3D(translation, right, sideSpeed * dt);
        }
        if (isKeyDown(KEY_SPACE)) {
            translation = translate3D(translation, up, sideSpeed * dt);
        }
        if (isKeyDown(KEY_LEFT_CONTROL)) {
            translation = translate3D(translation, up, -sideSpeed * dt);
        }
        camera._position(vector3Add(camera._position(), translation));
        camera.target(vector3Add(camera.target(), translation));
        return translation;
    }

    public static void updateDefaultCamera(Camera3D camera, float dt) {
        updateFreeFlyCameraRotation(camera, VECTOR_3_ZERO, DEFAULT_MOUSE_SENSITIVITY, DEFAULT_ROLL_SPEED, dt);
        updateFreeFlyCameraVelocity(camera, VECTOR_3_ZERO, DEFAULT_MOVE_SPEED, DEFAULT_MOVE_SPEED, dt);
    }
}

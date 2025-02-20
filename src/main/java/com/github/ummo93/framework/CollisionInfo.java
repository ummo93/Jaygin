package com.github.ummo93.framework;

import com.raylib.Raylib;
import lombok.Data;

@Data
public class CollisionInfo {
    Raylib.RayCollision collision;
    Actor other;
}

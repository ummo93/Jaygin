package com.github.ummo93.framework;

import com.raylib.Raylib.RayCollision;
import lombok.Data;

@Data
public class CollisionInfo {
    RayCollision collision;
    Actor other;
}

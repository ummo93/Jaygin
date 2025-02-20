package com.github.ummo93.framework;

import com.raylib.RayCollision;
import lombok.Data;

@Data
public class CollisionInfo {
    RayCollision collision;
    Actor other;
}

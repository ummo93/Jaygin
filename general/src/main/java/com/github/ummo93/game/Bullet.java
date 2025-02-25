package com.github.ummo93.game;

import com.raylib.Vector2;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bullet {
    Vector2 pos;
    Vector2 fwd;
}

package com.github.ummo93.game;

import com.raylib.Raylib;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bullet {
    Raylib.Vector2 pos;
    Raylib.Vector2 fwd;
}

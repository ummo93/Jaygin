package com.github.ummo93.game;

import com.github.ummo93.framework.Actor3D;
import com.raylib.Raylib.Model;
import com.raylib.Raylib.Vector3;


public class CelestialBody extends Actor3D {

    public CelestialBody(Model model, Vector3 position) {
        super(model, position);
    }

    @Override
    protected void onDraw() {
        super.onDraw();
    }
}

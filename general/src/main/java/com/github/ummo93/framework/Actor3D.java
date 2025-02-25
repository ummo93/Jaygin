package com.github.ummo93.framework;

import lombok.Getter;
import lombok.Setter;

import static com.raylib.Raylib.*;
import com.raylib.*;

public class Actor3D extends Actor {
    @Getter
    private final Model model;
    @Setter
    @Getter
    protected float scale = 1;
    private Shader lightShader;
    private boolean lightShaderAssigned;

    public Actor3D(Model model, Vector3 position) {
        this.model = model;
        this.position = position;
    }

    private void tryToGetLightShader() {
        if (scene != null && lightShader == null) {
            lightShader = scene.getLightShader();
            if (lightShader != null) {
                tryToAssignLight();
            }
        }
    }

    private void tryToAssignLight() {
        if (!lightShaderAssigned && lightShader != null) {
            for (var i = 0; i < model.materialCount(); i++) {
                model.materials().getArrayElement(i).shader(lightShader);
            }
            model.materials().getArrayElement(0);
            lightShaderAssigned = true;
        }
    }

    @Override
    protected void onInit() {
        super.onInit();
        tryToGetLightShader();
    }

    @Override
    protected void onDraw() {
        tryToGetLightShader();
        drawModel(model, position, scale, WHITE);
    }
}

package com.github.ummo93.framework;

import lombok.Getter;
import org.bytedeco.javacpp.IntPointer;

import static com.github.ummo93.utils.RaylibUtils.loadShaderResource;
import static com.raylib.Colors.WHITE;
import static com.raylib.Jaylib.rlDisableBackfaceCulling;
import static com.raylib.Jaylib.rlDisableDepthMask;
import static com.raylib.Jaylib.rlEnableBackfaceCulling;
import static com.raylib.Jaylib.rlEnableDepthMask;
import static com.raylib.Raylib.*;
import static com.raylib.Jaylib.*;

public class Skybox extends Actor {
    private Model skybox;
    private final Image skyboxImg;
    @Getter
    private final float scale;
    private final int cubemapLayout;

    /**
     *
     * @param skyboxImg Skybox image
     * @param cubemapLayout Layout type: CUBEMAP_LAYOUT_AUTO_DETECT, CUBEMAP_LAYOUT_LINE_VERTICAL, CUBEMAP_LAYOUT_LINE_HORIZONTAL, CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR, CUBEMAP_LAYOUT_CROSS_FOUR_BY_THREE = 4;
     * @param position Skybox position
     * @param rotation Skybox rotation
     * @param scale Skybox size
     */
    public Skybox(Image skyboxImg, int cubemapLayout, Vector3 position, Vector3 rotation, float scale) {
        super(position, rotation);
        this.skyboxImg = skyboxImg;
        this.scale = scale;
        this.cubemapLayout = cubemapLayout;
    }

    @Override
    protected void onInit() {
        super.onInit();
        Mesh generatedMesh = genMeshCube(scale, scale, scale);
        skybox = loadModelFromMesh(generatedMesh);
        Material mtl = skybox.materials().position(0);
        mtl.shader(loadShaderResource("shader/skybox.vs", "shader/skybox.fs"));

        IntPointer environmentMap = new IntPointer(1).put(new int[]{MATERIAL_MAP_CUBEMAP});
        IntPointer doGamma = new IntPointer(1).put(new int[]{0});
        IntPointer vflipped = new IntPointer(1).put(new int[]{0});

        setShaderValue(mtl.shader(), getShaderLocation(mtl.shader(), "environmentMap"), environmentMap, SHADER_UNIFORM_INT);
        setShaderValue(mtl.shader(), getShaderLocation(mtl.shader(), "doGamma"), doGamma, SHADER_UNIFORM_INT);
        setShaderValue(mtl.shader(), getShaderLocation(mtl.shader(), "vflipped"), vflipped, SHADER_UNIFORM_INT);

        MaterialMap mtlMap = mtl.maps().position(MATERIAL_MAP_CUBEMAP);
        mtlMap.texture(loadTextureCubemap(this.skyboxImg, cubemapLayout));
        unloadImage(this.skyboxImg);
    }

    @Override
    protected void onDraw() {
        rlDisableBackfaceCulling();
        rlDisableDepthMask();
        drawModel(skybox, position, 1, WHITE);
        rlEnableBackfaceCulling();
        rlEnableDepthMask();
    }

    @Override
    protected void onDestroy() {
        unloadModel(skybox);
    }
}

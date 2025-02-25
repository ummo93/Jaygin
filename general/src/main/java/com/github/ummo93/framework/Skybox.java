package com.github.ummo93.framework;

import lombok.Getter;

import static com.github.ummo93.utils.RaylibUtils.loadShaderResource;
import static com.raylib.Raylib.*;
import static com.raylib.Raylib.MaterialMapIndex.MATERIAL_MAP_CUBEMAP;
import static com.raylib.Raylib.ShaderUniformDataType.SHADER_UNIFORM_INT;

import com.raylib.*;

import java.lang.foreign.MemorySegment;

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
        Material mtl = skybox.materials().getArrayElement(0);
        mtl.shader(loadShaderResource("shader/skybox.vs", "shader/skybox.fs"));

        MemorySegment environmentMap = MemorySegment.ofArray(new int[]{MATERIAL_MAP_CUBEMAP});
        MemorySegment doGamma = MemorySegment.ofArray(new int[]{0});
        MemorySegment vflipped = MemorySegment.ofArray(new int[]{0});

        setShaderValue(mtl.shader(), getShaderLocation(mtl.shader(), "environmentMap"), environmentMap, SHADER_UNIFORM_INT);
        setShaderValue(mtl.shader(), getShaderLocation(mtl.shader(), "doGamma"), doGamma, SHADER_UNIFORM_INT);
        setShaderValue(mtl.shader(), getShaderLocation(mtl.shader(), "vflipped"), vflipped, SHADER_UNIFORM_INT);

        MaterialMap mtlMap = mtl.maps().getArrayElement(MATERIAL_MAP_CUBEMAP);
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

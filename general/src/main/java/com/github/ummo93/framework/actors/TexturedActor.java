package com.github.ummo93.framework.actors;


import com.github.ummo93.framework.Actor;
import lombok.Getter;
import lombok.Setter;

import static com.github.ummo93.utils.RaylibUtils.*;
import static com.raylib.Raylib.*;

public class TexturedActor extends Actor {
    @Getter
    @Setter
    protected Texture texture;

    public TexturedActor(Vector2 position, Vector2 rotation, Texture texture) {
        super(position, rotation);
        this.texture = texture;
    }

    public TexturedActor(Texture texture) {
        super();
        this.texture = texture;
    }

    public Vector2 getScale() {
        return vector2((float)texture.width(), (float)texture.height());
    }

    @Override
    protected void onDraw() {
        drawTextureInCenter(texture, position, rotation.y());
    }
}

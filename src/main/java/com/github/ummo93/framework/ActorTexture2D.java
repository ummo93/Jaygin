package com.github.ummo93.framework;


import lombok.Getter;
import lombok.Setter;

import static com.github.ummo93.utils.RaylibUtils.*;
import com.raylib.*;

public class ActorTexture2D extends Actor {
    @Getter
    @Setter
    protected Texture texture;

    public ActorTexture2D(Vector3 position, Vector3 rotation, Texture texture) {
        super(position, rotation);
        this.texture = texture;
    }

    public ActorTexture2D(Texture texture) {
        super();
        this.texture = texture;
    }

    public Vector2 getScale()
    {
        return vector2((float)texture.width(), (float)texture.height());
    }

    @Override
    protected void onDraw() {
        drawTextureInCenter(texture, vector2(position), rotation.y());
    }
}

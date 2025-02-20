package com.github.ummo93.framework;

import com.raylib.Raylib;
import lombok.Getter;
import lombok.Setter;


public class ActorAnimated2D extends Actor {
    @Getter
    @Setter
    protected AnimatedTexture animation;

    public ActorAnimated2D(Raylib.Vector3 position, Raylib.Vector3 rotation, AnimatedTexture animation) {
        super(position, rotation);
        this.animation = animation;
    }

    public ActorAnimated2D(AnimatedTexture animation) {
        super();
        this.animation = animation;
    }

    @Override
    protected void onDraw() {
        this.animation.drawAnimation((int)position.x(), (int)position.y(), false);
    }
}

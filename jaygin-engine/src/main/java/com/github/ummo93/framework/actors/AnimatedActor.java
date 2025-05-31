package com.github.ummo93.framework.actors;

import com.github.ummo93.framework.Actor;
import com.github.ummo93.framework.AnimatedTexture;
import com.raylib.Raylib.Vector2;
import lombok.Getter;
import lombok.Setter;


public class AnimatedActor extends Actor {
    @Getter
    @Setter
    protected AnimatedTexture animation;

    public AnimatedActor(Vector2 position, Vector2 rotation, AnimatedTexture animation) {
        super(position, rotation);
        this.animation = animation;
    }

    public AnimatedActor(AnimatedTexture animation) {
        super();
        this.animation = animation;
    }

    @Override
    protected void onDraw() {
        this.animation.drawAnimation((int)getPosition().x(), (int)getPosition().y(), false);
    }
}

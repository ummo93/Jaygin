package com.github.ummo93.game.ai;

import com.github.ummo93.framework.Actor;
import com.github.ummo93.framework.Scene;
import com.github.ummo93.game.Controllable;
import com.google.inject.ImplementedBy;

@ImplementedBy(ChaserBehaviour.class)
public interface AiBehaviourStrategy {
    <T extends Actor & Controllable> void turn(T subject, Actor object, Scene scene);
}

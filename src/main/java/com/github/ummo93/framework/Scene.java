package com.github.ummo93.framework;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static com.raylib.Colors.RAYWHITE;
import static com.raylib.Raylib.*;


public abstract class Scene {
    private final List<Actor> actors = new ArrayList<>();
    @Getter
    private Camera3D camera3D;
    @Getter
    private Camera2D camera2D;

    public abstract void onInit();

    public void onUpdate() {

    }
    public void onDraw() {

    }
    public void onDestroy() {

    }
    public void beforeDraw() {

    }

    public void drawHierarchy() {
        actors.forEach(Actor::onDraw);
    }

    public void updateHierarchy() {
        actors.forEach(Actor::onUpdate);
    }

    public Optional<Actor> findOne(Predicate<Actor> pred) {
        for (Actor actor : actors) {
            if (pred.test(actor)) {
                return Optional.of(actor);
            }
        }
        return Optional.empty();
    }

    public Color getBackgroundColor() {
        return RAYWHITE;
    }

    public void spawn(Actor actor) {
        actors.add(actor);
    }
    public void remove(Actor actor) {
        actors.remove(actor);
    }

    public void addCamera(Camera3D camera3D) {
        this.camera3D = camera3D;
    }
    public void addCamera(Camera2D camera2D) {
        this.camera2D = camera2D;
    }
}

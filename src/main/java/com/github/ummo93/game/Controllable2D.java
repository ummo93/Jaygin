package com.github.ummo93.game;

import java.util.HashSet;
import java.util.Set;


public interface Controllable2D {
    Set<ControlSignal2D> CONTROL_SIGNALS = new HashSet<>();

    default void moveForward() {
        CONTROL_SIGNALS.add(ControlSignal2D.MOVE_FORWARD);
        CONTROL_SIGNALS.remove(ControlSignal2D.MOVE_BACKWARD);
    }
    default void stopMove() {
        CONTROL_SIGNALS.remove(ControlSignal2D.MOVE_FORWARD);
        CONTROL_SIGNALS.remove(ControlSignal2D.MOVE_BACKWARD);
    }
    default void moveBackward() {
        CONTROL_SIGNALS.add(ControlSignal2D.MOVE_BACKWARD);
        CONTROL_SIGNALS.remove(ControlSignal2D.MOVE_FORWARD);
    }
    default void rotateClockwise() {
        CONTROL_SIGNALS.add(ControlSignal2D.ROTATE_CLOCKWISE);
        CONTROL_SIGNALS.remove(ControlSignal2D.ROTATE_COUNTERCLOCKWISE);
    }
    default void rotateCounterClockwise() {
        CONTROL_SIGNALS.add(ControlSignal2D.ROTATE_COUNTERCLOCKWISE);
        CONTROL_SIGNALS.remove(ControlSignal2D.ROTATE_CLOCKWISE);
    }
    default void stopRotate() {
        CONTROL_SIGNALS.remove(ControlSignal2D.ROTATE_CLOCKWISE);
        CONTROL_SIGNALS.remove(ControlSignal2D.ROTATE_COUNTERCLOCKWISE);
    }
    default void shoot() {
        CONTROL_SIGNALS.add(ControlSignal2D.SHOOT);
    }
    default void stopShoot() {
        CONTROL_SIGNALS.remove(ControlSignal2D.SHOOT);
    }
}

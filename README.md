# Jaygin - Java + [Raylib](https://github.com/raysan5/raylib) JNI ([Jaylib](https://github.com/electronstudio/jaylib)) engine
### Simple game engine based on raylib (JNI jaylib) using java

## List of features:
- Object-oriented model (working with actors and scene)
- Automatically generated Java-style wrapper over Raylib API (including doc hints, comments)
- Event loop for scene and the actors
- Deferred tasks and timers (without blocking the game loop, but running in the game loop in main thread)
- A set of utilities for convenient raycasting, animation playback (animated actor based on spritesheets)

### Automatically generated Java wrapper over Raylib API

This feature allows you to use the usual camelcase method names and hints of method arguments have normal names unlike default JNI bindings i0, var1... etc.
Also moved original method comments from raylib, raymath, raygui, rlgl, physac .h files.
Additional data generation (like comments, arg. names over functions) is based on output json files of the [raylib_parser](https://github.com/raysan5/raylib/tree/master/parser) utility

![Hints Example](https://github.com/ummo93/Jaygin/blob/master/example.jpg?raw=true)
![Description Example](https://github.com/ummo93/Jaygin/blob/master/example2.jpg?raw=true)

### Deferred tasks queue

Example of creating a deferred task:

```java
// somewhere in the Actor successor class
var scene = getScene();
scene.spawn(explosion); // Spawn explosion animation

// Deferred task, remove explosion after a second
TaskQueueService.getInstance()
                .enqueue(() -> scene.remove(explosion), 1);
```

### Raycasting

Example of raycast based collision handling (bullet hitting a collider)

```java
//...
Ray ray = ray(bullet.pos, bullet.fwd);
var infoOpt = getScene().raycastOne(ray, 10, this); // detect first hit
if (infoOpt.isPresent()) {
    var info = infoOpt.get();
    var other = info.getOther();
    bullets.remove(bullet);
    if(other instanceof Damagable damagable) {
        damagable.addDamage(damage);
    }
}
```

## Build executable
### Windows

    mvn clean install -Pwindows-profile

And then - just run general/jaygin-win/jaygin.exe
The assembly method uses the standard jlink utility to assemble a stripped-down jre, then the [packr](https://github.com/libgdx/packr) utility (config is located in the packaging) folder, to create an executable file.

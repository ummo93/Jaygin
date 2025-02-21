# Jaygin - Java + [Raylib](https://github.com/raysan5/raylib) JNI ([Jaylib](https://github.com/electronstudio/jaylib)) engine
### Simple game engine based on raylib (JNI jaylib) using java

#### List of features:
- Object-oriented model (working with actors and scene)
- Event loop for scene and the actors
- Deferred tasks and timers (without blocking the game loop, but running in the game loop in main thread)
- A set of utilities for convenient raycasting, animation playback (animated actor based on spritesheets)

Example of creating a deferred task:

```java
// somewhere in the Actor successor class
var scene = getScene();
scene.spawn(explosion); // Spawn explosion animation

// Deferred task, remove explosion after a second
TaskQueueService.getInstance()
                .enqueue(() -> scene.remove(explosion), 1);
```

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

## Native image

You will need to download [Graal](https://www.graalvm.org/downloads/) and extract the archive.  Set an env variable
with the location, e.g.

    export GRAALVM_HOME=/home/richard/Downloads/graalvm-jdk-22+36.1/

Then build a usual jar:

    mvn clean package

[For windows] open VS developer console

    call "%ProgramFiles%\Microsoft Visual Studio\2022\Community\Common7\Tools\VsDevCmd.bat" -arch=amd64 -host_arch=amd64

And create reflection configs:

    java -agentlib:native-image-agent=config-output-dir=general/src/main/resources/META-INF/native-image -jar general/target/jaygin.jar

Run python script to add "unsafeAllocated" to Raylib native classes:

    python update_reflect_config.py

Then to build a native image:

    native-image --target=windows-amd64 -jar jaygin.jar







# Jaygin - Java + Raylib + Spring engine

## Native image

You will need to download [Graal](https://www.graalvm.org/downloads/) and extract the archive.  Set an env variable
with the location, e.g.

    export GRAALVM_HOME=/home/richard/Downloads/graalvm-jdk-22+36.1/

Then build a usual jar:

    mvn clean package

[For windows] open VS developer console

    call "%ProgramFiles%\Microsoft Visual Studio\2022\Community\Common7\Tools\VsDevCmd.bat" -arch=amd64 -host_arch=amd64

And create reflection configs:

    java -agentlib:native-image-agent=config-output-dir=src/main/resources/META-INF/native-image -jar target/**YOUR_JAR_NAME**.jar

Run python script to add "unsafeAllocated" to Raylib native classes:

    python update_reflect_config.py

Then to build a native image:

    mvn -Pnative spring-boot:build-image







cd ..
SET JAVA_HOME=C:\Program Files\Java\graalvm-jdk-23.0.2+7.1
SET PATH=%PATH%;C:\Program Files\Java\graalvm-jdk-23.0.2+7.1\bin;C:\Program Files\JetBrains\IntelliJ IDEA 2023.3.4\plugins\maven\lib\maven3\bin
call "%ProgramFiles%\Microsoft Visual Studio\2022\Community\Common7\Tools\VsDevCmd.bat" -arch=amd64 -host_arch=amd64
mvn clean package ^
&& java -agentlib:native-image-agent=config-output-dir=general/src/main/resources/META-INF/native-image -jar general/target/jaygin.jar ^
&& python update_reflect_config.py ^
&& cd general/target & mvn -Pnative native:compile
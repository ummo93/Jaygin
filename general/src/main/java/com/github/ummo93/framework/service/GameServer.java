package com.github.ummo93.framework.service;


import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface GameServer {
    void start(int port) throws IOException;
    void setOnMessageHandler(Consumer<String[]> onMessageHandler);
    void setOnResponseHandler(Supplier<String[]> onResponseHandler);
    boolean isRunning();
    void stop();
}

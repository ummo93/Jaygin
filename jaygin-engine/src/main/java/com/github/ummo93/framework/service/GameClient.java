package com.github.ummo93.framework.service;

import java.util.function.Consumer;
import java.util.function.Supplier;


public interface GameClient {
    void connect(String host, int port, int pollInterval_millis);
    void setRequestHandler(Supplier<String[]> handler);
    void setOnResponseHandler(Consumer<String[]> handler);
    void disconnect();
}

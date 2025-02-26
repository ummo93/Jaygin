package com.github.ummo93.framework.service;

import com.github.ummo93.framework.service.impl.PollingGameClient;
import com.google.inject.ImplementedBy;

import java.util.function.Consumer;
import java.util.function.Supplier;

@ImplementedBy(PollingGameClient.class)
public interface GameClient {
    void connect(String host, int port, int pollInterval_millis);
    void setRequestHandler(Supplier<String[]> handler);
    void setOnResponseHandler(Consumer<String[]> handler);
    void disconnect();
}

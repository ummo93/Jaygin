package com.github.ummo93.framework.service.impl;

import com.github.ummo93.framework.service.GameServer;
import com.sun.net.httpserver.HttpServer;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Supplier;

@NoArgsConstructor
public class SimpleServer implements GameServer {
    public static final String ENDPOINT_PATH = "/gamedata";
    public static final String DELIM = "::";
    private HttpServer server;
    private boolean isRunning = false;
    private Consumer<String[]> onMessageHandler;
    private Supplier<String[]> onResponseHandler;

    @Override
    public void start(int port) throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext(ENDPOINT_PATH, exchange -> {
            var rawData = exchange.getRequestURI().getQuery();
            var data = rawData.split(DELIM);
            onMessageHandler.accept(data);
            var response = String.join(DELIM, onResponseHandler.get());
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
        isRunning = true;
        System.out.println("Server started on port " + port);
    }

    @Override
    public void setOnMessageHandler(Consumer<String[]> onMessageHandler) {
        this.onMessageHandler = onMessageHandler;
    }

    @Override
    public void setOnResponseHandler(Supplier<String[]> onResponseHandler) {
        this.onResponseHandler = onResponseHandler;
    }

    @Override
    public boolean isRunning() {
        return server != null && isRunning;
    }

    @Override
    public void stop() {
        if(isRunning())
            server.stop(0);
    }
}

package com.github.ummo93.framework.service.impl;

import com.github.ummo93.framework.service.GameClient;
import com.google.inject.Singleton;
import lombok.NoArgsConstructor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Singleton
@NoArgsConstructor
public class PollingGameClient implements GameClient {
    private static final String  URL_PROTOCOL = "http://";
    private static final String  LOCALHOST = "localhost";
    private static final String  URL_SECURED_PROTOCOL = "https://";
    private static final String  URL_PATH_DELIM = "/";
    private static final String  URL_REQUEST_START_SIGN = "?";
    private static final String  URL_PORT_DELIM = ":";
    Supplier<String[]> sender;
    Consumer<String[]> receiver;
    private boolean isConnected = false;
    private Timer timer;

    @Override
    public void connect(String host, int port, int pollInterval_millis) {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                send(host, port);
            }
        }, 0, pollInterval_millis);
        isConnected = true;
    }

    @Override
    public void setRequestHandler(Supplier<String[]> handler) {
        sender = handler;
    }

    @Override
    public void setOnResponseHandler(Consumer<String[]> handler) {
        receiver = handler;
    }

    @Override
    public void disconnect() {
        if (!isConnected) {
            return;
        }
        timer.cancel();
    }

    private void send(String host, int port) {
        try {
            var request = new StringBuilder()
                .append(host.equals(LOCALHOST) ? URL_PROTOCOL: URL_SECURED_PROTOCOL)
                .append(host)
                .append(URL_PORT_DELIM)
                .append(port)
                .append(SimpleServer.ENDPOINT_PATH)
                .append(URL_PATH_DELIM)
                .append(URL_REQUEST_START_SIGN)
                .append(String.join(SimpleServer.DELIM, sender.get()))
                .toString();
            var url = URI.create(request).toURL();
            var urlConnection = (HttpURLConnection) url.openConnection();
            var httpResponseBodyScanner = new Scanner(urlConnection.getInputStream());
            var responseBodyBaos = new ByteArrayOutputStream();
            while(httpResponseBodyScanner.hasNextLine()) {
                responseBodyBaos.write(httpResponseBodyScanner.nextLine().getBytes());
            }
            responseBodyBaos.close();
            httpResponseBodyScanner.close();
            var receivedData = responseBodyBaos.toString().split(SimpleServer.DELIM);
            receiver.accept(receivedData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package dev.senta.sockets;

import dev.senta.sockets.impl.Server;
import dev.senta.sockets.impl.builders.Message;
import dev.senta.sockets.impl.models.User;

import java.util.Arrays;
import java.util.logging.Level;

public class TestServer {

    public static void main(String[] args) {
        Server server = new Server(25500) {
            @Override
            public void onConnect(User user) {
                asLogger(Level.INFO, String.format("Connection Received from [%s].", user.getIp()));
            }

            @Override
            public void onDisconnect(User user) {
                asLogger(Level.INFO, String.format("Connection Disconnected from [%s].", user.getIp()));
            }

            @Override
            public void onReceive(User user, Message message) {
                asLogger(Level.INFO, Arrays.asList("-- Data Received --", "SENDER: " + user.getIp(), "KEY: " + message.getKey(), "MESSAGE: " + message.getMessage()));
            }
        };
    }
}

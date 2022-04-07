package dev.senta.sockets;

import dev.senta.sockets.impl.Client;
import dev.senta.sockets.impl.builders.Message;
import dev.senta.sockets.impl.models.User;

import java.util.logging.Level;

public class TestClient {

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 25500) {
            @Override
            public void onConnect(User user) {
                asLogger(Level.INFO, "Connected to server.");
            }

            @Override
            public void onDisconnect(User user) {
                asLogger(Level.INFO, "Disconnected from server.");
            }

            @Override
            public void onSend(User user, Message message) {
                asLogger(Level.INFO, "Sending message [" + message + "]");
            }
        };
    }
}

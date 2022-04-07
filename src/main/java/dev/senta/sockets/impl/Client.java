package dev.senta.sockets.impl;

import dev.senta.sockets.abstractions.AbstractSender;
import dev.senta.sockets.impl.models.User;
import lombok.SneakyThrows;

import java.net.Socket;

public abstract class Client extends AbstractSender<User> {

    Socket socket;

    @SneakyThrows
    public Client(String ip, int port) {
        this.socket = new Socket(ip, port);
    }
}

package dev.senta.sockets.impl;

import dev.senta.sockets.abstractions.AbstractReceiver;
import dev.senta.sockets.impl.models.User;
import lombok.SneakyThrows;

import java.net.ServerSocket;
import java.net.Socket;

public abstract class Server extends AbstractReceiver<User> {

    private ServerSocket socket;

    @SneakyThrows
    public Server(int port) {
        socket = new ServerSocket(port);

        Socket s = socket.accept();
        onConnect(new User(s.getLocalAddress().getHostAddress()));
    }
}

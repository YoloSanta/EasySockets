package dev.senta.sockets.abstractions;

import dev.senta.sockets.impl.models.User;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractMutual {

    public abstract void onConnect(User user);

    public abstract void onDisconnect(User user);

    public void asLogger(Level level, String message) {
        Logger.getLogger(getClass().getSimpleName()).log(level, message);
    }

    public void asLogger(Level level, List<String> message) {
        Logger.getLogger(getClass().getSimpleName()).log(level, String.join(", ", message));
    }
}

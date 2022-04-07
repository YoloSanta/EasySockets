package dev.senta.sockets.abstractions;

import dev.senta.sockets.impl.builders.Message;
import dev.senta.sockets.impl.models.User;

public abstract class AbstractReceiver<T> extends AbstractMutual {
    public abstract void onReceive(User user, Message message);
}

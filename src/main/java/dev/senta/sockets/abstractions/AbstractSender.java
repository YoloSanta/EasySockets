package dev.senta.sockets.abstractions;

import dev.senta.sockets.impl.builders.Message;
import dev.senta.sockets.impl.models.User;

public abstract class AbstractSender<T> extends AbstractMutual {
    public abstract void onSend(User user, Message message);
}

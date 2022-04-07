package dev.senta.sockets.impl.builders;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

@Data
public class Message implements Serializable {

    @NonNull
    private String key;
    private String message;
}

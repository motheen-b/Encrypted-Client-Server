package org.encrypted.server.clients;

import org.encrypted.server.ThreadHandler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    private final Socket socket;
    private final ObjectInputStream objectInputStream;
    private final ObjectOutputStream objectOutputStream;

    public Client(final Socket socket) {
        this.socket = socket;
        ThreadHandler.get().execute(this::run);
    }

    public void run() {

    }

    public Socket getSocket() {
        return socket;
    }
}

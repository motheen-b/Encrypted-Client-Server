package org.encrypted.server.clients;

import org.encrypted.server.ThreadHandler;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientHandler {

    private List<Client> clients;

    public ClientHandler(final int maxClients) {
        clients = new ArrayList<>(maxClients);
    }

    public void addClient(final Socket socket) {
        System.out.println("Accepted connection from: " + socket.getInetAddress());
        clients.add(new Client(socket));
    }

}

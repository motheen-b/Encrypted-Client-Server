package org.encrypted.server;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    private ServerSocket serverSocket;

    public Server(final int serverPort) {
        try {
            this.serverSocket = new ServerSocket(serverPort);
            ThreadHandler.get().execute(() -> {
                while (!serverSocket.isClosed()) {

                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

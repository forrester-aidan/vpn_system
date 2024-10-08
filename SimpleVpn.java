package server;

import java.io.*;
import java.net.*;

public class VPNServer {
    private static final int PORT = 8888;

    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("VPN is running on port " + PORT);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");
            handleClient(socket);
        }
    }

    private static void handleClient(Socket socket) {

    }

}
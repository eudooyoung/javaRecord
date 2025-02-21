package com.multi.homework.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("press 'q' to end.");

        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }
        scanner.close();

        stopServer();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("종료.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(9993);
                    System.out.println("서버시작");

                    while(true) {
                        Socket socket = serverSocket.accept();

                        DataInputStream dis = new DataInputStream(socket.getInputStream());
                        String message = dis.readUTF();
                        System.out.println(message);

                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                        dos.writeUTF(message);
                        dos.flush();
                        System.out.println(message);

                        socket.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        thread.start();
    }
}

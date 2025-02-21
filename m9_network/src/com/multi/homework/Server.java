package com.multi.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9093);
             Scanner sc = new Scanner(System.in)) {

            System.out.println("Waiting for a client to connect...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected. Enter messages to send:");

            try (DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                 DataInputStream dis = new DataInputStream(socket.getInputStream())) {

                while (true) {
                    String send = sc.nextLine();
                    if (send.equalsIgnoreCase("q")) {
                        System.out.println("Server shutting down...");
                        break;
                    }
                    dos.writeUTF(send);
                    dos.flush();
                    System.out.println("Server: " + send);

                    try {
                        String receive = dis.readUTF();
                        System.out.println("Received: " + receive);
                    } catch (EOFException e) {
                        System.out.println("Client disconnected.");
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error in communication: " + e.getMessage());
            } finally {
                socket.close();
            }
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
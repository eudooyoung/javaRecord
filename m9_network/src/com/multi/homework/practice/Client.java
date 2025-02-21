package com.multi.homework.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9993);
            System.out.println("연결 성공");

            String send = "여기까지";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(send);
            dos.flush();
            System.out.println("보내기: " + send);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String receive = dis.readUTF();
            System.out.println("받기: " + receive);

            socket.close();
            System.out.println("끝");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

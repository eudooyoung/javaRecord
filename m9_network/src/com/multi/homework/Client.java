package com.multi.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    //    애플리케이션 계층: ip, port 정보를 가지고 요청
//    전송 계층: tcp 프로토콜, 핸드쉐이킹이 일어남
//    네트워크 계층: IP 프로토콜, 패킷
    public static void main(String[] args) {


            while (true) {

                try {
                    Socket socket = new Socket("localhost", 9093); // host, port. Socket: 연결 요청 클래스

                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    String data = bufferedReader.readLine();
                    System.out.println(data);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }




    }
}

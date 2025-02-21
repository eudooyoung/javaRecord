package com.multi.b_network.b_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) {
        DatagramSocket ds; // 소켓 생성

        {
            try {
                ds = new DatagramSocket(9999);

                byte[] data = new byte[256];

                DatagramPacket packet = new DatagramPacket(data, data.length); // 배열, 배열의 크기 지정

                ds.receive(packet);

                System.out.println(new String(data));

                ds.close();

            } catch (SocketException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

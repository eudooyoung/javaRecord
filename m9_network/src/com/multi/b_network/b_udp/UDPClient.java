package com.multi.b_network.b_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();


        InetAddress ip = InetAddress.getByName("localhost");

        String str = "안녕!!";

        byte[] data = str.getBytes();  // 전달할 글자를 data 배열에 담아서 전달

        DatagramPacket dp = new DatagramPacket(data, data.length, ip, 9999); // 전달받을 데이터, 데이터 크기, ip 주소, port

        ds.send(dp);

        ds.close();
    }
}

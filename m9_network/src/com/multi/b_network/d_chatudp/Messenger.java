package com.multi.b_network.d_chatudp;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Messenger {

    private MyFrame myFrame;
    private DatagramSocket socket;
    private InetAddress address;
    private final int myPort;
    private final int otherPort;


    public Messenger(int myPort, int otherPort) {
        this.myPort = myPort;
        this.otherPort = otherPort;

        try {
            address = InetAddress.getByName("127.0.0.1");

            socket = new DatagramSocket(myPort);
            myFrame = new MyFrame(address, otherPort, socket);


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    public MyFrame getMyFrame() {
        return myFrame;
    }
}

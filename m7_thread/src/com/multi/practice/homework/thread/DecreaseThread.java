package com.multi.practice.homework.thread;

public class DecreaseThread extends Thread{
    @Override
    public void run() {
        for( int i = 1000; i > 0; i--) {
            System.out.println("스레드#2 [ " + i + " ]");
        }
    }
}

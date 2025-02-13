package com.multi.practice.homework.thread;

public class IncreaseThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("스레드#1 [ " + (i + 1) + " ]");
        }
    }
}

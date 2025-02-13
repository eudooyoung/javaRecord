package com.multi.practice.homework.thread;

public class NameThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 5000; i++) {
            System.out.println("김두영");
        }
    }
}

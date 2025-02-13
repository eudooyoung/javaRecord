package com.multi.practice.homework.thread;

public class Count extends Thread {

    private String name;

    public Count(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println(this.name + ": " + i);
            if (i == 1) {
                System.out.println(this.name + " 끝!");
            }
        }
    }
}

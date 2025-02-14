package com.multi.practice.sample;

public class Run {
    public static void main(String[] args) {
        new Thread(()->{
            for(int i=0;i<5000;i++){
                System.out.println("*: "+(i+1)+"번");
            }
        }).start();

        new Thread(()->{
            for(int i=0;i<5000;i++){
                System.out.println("hyomin: "+(i+1)+"번");
            }
        }).start();
    }
}

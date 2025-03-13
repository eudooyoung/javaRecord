package com.multi.this_is_java.b_beep;

import java.awt.*;

public class BeepPrintExample02 {
    public static void main(String[] args) {
//        작업 1
//        Runnable interface 구현 객체 생성
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit(); // static method 호출
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });

        thread.start();

//        작업 2
//        for (int i = 0; i < 5; i++) {
//            System.out.println("띵");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//        }
        Runnable task = new Task();
        Thread thread2 = new Thread(task);
        thread2.start();
    }
}

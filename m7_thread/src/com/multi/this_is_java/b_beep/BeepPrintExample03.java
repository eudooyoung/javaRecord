package com.multi.this_is_java.b_beep;

import java.awt.*;

public class BeepPrintExample03 {
    public static void main(String[] args) {
//        작업 1
//        Thread()를 상속한 익명 자식 객체
        Thread thread = new Thread() {
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
        };

        thread.start();

//        작업 2
//        for (int i = 0; i < 5; i++) {
//            System.out.println("띵");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//        }
        Thread thread2 = new PrintThread();
        thread2.start();
    }
}

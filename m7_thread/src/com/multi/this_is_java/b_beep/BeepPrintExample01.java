package com.multi.this_is_java.b_beep;

import java.awt.*;

public class BeepPrintExample01 {
    public static void main(String[] args) {
//        작업 1
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // static method 호출
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }

//        작업 2
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

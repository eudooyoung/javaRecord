package com.multi.b_conditional;


import javax.swing.*;

public class Exec02 {

    public void method1() {
        int ok = 0, no = 0, etc = 0;

        for (int i = 0; i < 5; i++) {
            String data = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)기타");

            if (data.equals("ok")) {
                System.out.println("긍정");
                ok++;
            } else if (data.equals("no")) {
                System.out.println("부정");
                no++;
            } else {
                System.out.println("기타");
                etc++;
            }
        }

        System.out.println("긍정 횟수: " + ok);
        System.out.println("부정 횟수: " + no);
        System.out.println("기타 횟수: " + etc);
    }
}
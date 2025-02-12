package com.multi.c_loop;

import javax.swing.*;

public class Exec02 {
    public static void main(String[] args) {
        while(true) {

            System.out.println("계속 도는중");
            String choice = JOptionPane.showInputDialog("계속 하시겠어요? yes: y or no: n");

            if(choice.equals("n") || choice.equals("no")) {
                System.out.println("프로그램 종료...");
//                break; 아래 동작 수행
//                return; main 메소드로 빠져나감, 아래 동작 수행하지 않음
                System.exit(0); //프로그램 종료, 아래 동작 수행하지 않음
            }
        }

//        System.out.println("나 출력됨?");
    }
}

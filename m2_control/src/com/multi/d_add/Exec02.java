package com.multi.d_add;

import java.util.Scanner;

public class Exec02 {
    public static void main(String[] args) {
//  -----------------------------
//        1.증속 | 2.감속 | 3.중지
//-----------------------------
//  선택: 1
//  현재 속도=1
//        -----------------------------
//        1.증속 | 2.감속 | 3.중지
//-----------------------------
//  선택: 1
//  현재 속도=2
//        -----------------------------
//        1.증속 | 2.감속 | 3.중지
//-----------------------------
//  선택: 2
//  현재 속도=1
//        -----------------------------
//        1.증속 | 2.감속 | 3.중지
//-----------------------------
//  선택: 2
//  현재 속도=0
//        -----------------------------
//        1.증속 | 2.감속 | 3.중지
//-----------------------------
//  선택: 3
//  프로그램 종료

        Scanner scn = new Scanner(System.in);
        int spd = 0;
        boolean run = true;


        while (run) {
            System.out.println("-----------------------");
            System.out.println("1. 증속 2. 감속 3. 중지");
            System.out.println("원하시는 작동을 선택하세요");
            System.out.println("-----------------------");
            System.out.print("선택: ");
            int choice = scn.nextInt();
            scn.nextLine();

            switch (choice) {
                case 1:
                    spd++;
                    System.out.println("현재속도: " + spd);
                    System.out.println();
                    break;
                case 2:
                    spd--;
                    System.out.println("현재속도: " + spd);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("프로그램 종료");
                    run = false;
                default:
                    System.out.println("다시 입력하세요");
                    System.out.println();
                    break;
            }

        }

        scn.close();
    }
}

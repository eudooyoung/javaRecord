package com.multi.practice;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//      1.
        {
            System.out.println("인기 투표 시스템");
            System.out.println("======================");

            int iuVote = 0;
            int btsVote = 0;
            int njnsVote = 0;
            boolean run = true;

            while (run) {
                System.out.println("1)아이유 2)방탄 3)뉴진스 4)종료");
                int choice = scn.nextInt();
                if (choice == 1) {
                    iuVote++;
                } else if (choice == 2) {
                    btsVote++;
                } else if (choice == 3) {
                    njnsVote++;
                } else if (choice == 4) {
                    System.out.println("시스템을 종료합니다.");
                    run = false;
                } else {
                    System.out.println("다시 입력하세요.");
                }
            }
            System.out.println("======================");
            System.out.printf("아이유 %d표\n", iuVote);
            System.out.printf("방탄 %d표\n", btsVote);
            System.out.printf("뉴진스 %d표\n", njnsVote);

        }
        scn.close();
    }

}
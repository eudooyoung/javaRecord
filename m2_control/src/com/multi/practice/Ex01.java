package com.multi.practice;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        1. BMI 구하기
        {
            System.out.print("몸무게 입력: ");
            int weight = scn.nextInt();
            System.out.print("신장 입력: ");
            int height = scn.nextInt();
            double heightM = (height * 0.01); //신장 미터로 변환
            double bMI = (double) weight / (heightM * heightM);
            System.out.println();
            System.out.printf("당신의 BMI는: %.2f 입니다.\n", bMI);
        }
//        2. 포인트 문제
        {
            double point = 3000;
            System.out.println("현재까지의 누적 포인트: " + point);
            System.out.print("추가 포인트: ");
            double addPoint = scn.nextDouble();
            point += addPoint;
            System.out.println("최종 포인트는 " + point + "입니다.");
        }

        scn.close();
    }
}

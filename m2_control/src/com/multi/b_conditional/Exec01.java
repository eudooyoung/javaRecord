package com.multi.b_conditional;

import java.util.Scanner;

public class Exec01 {

    // 사용자에게 키보드로 정수를 입력 받아 점수별로 등급을 나눠서 점수와 등급을 출력하는 메소드

    //90점 이상은 A등급
    //90점 미만 80점 이상은 B등급
    //80점 미만 70점 이상은 C등급
    //70점 미만 60점 이상은 D등급
    //60점 미만은 F등급

    public void method1() {//static이 아니기 때문에 main 메소드 안에서 new 를 사용해 객체를 생성해야 사용 가능
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력: ");
        int score = sc.nextInt();

        String grade = "";

        if (score >= 90) {
            grade = "A 등급";
        } else if (score >= 80) {
            grade = "B 등급";
        } else if (score >= 70) {
            grade = "C 등급";
        } else if (score >= 60) {
            grade = "D 등급";
        } else {
            grade = "F 등급";
        }

        System.out.println("당신의 점수는 " + score + "이고, 등급은 " + grade + " 입니다.");
    }
}

package com.multi.practice;

import javax.swing.*;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        1.
        {
            System.out.print("암호를 대시오: ");
            String pw = scn.nextLine();
            System.out.println(pw.equals("pass") ? "들어오세요" : "나가세요"); //삼항 연산자 프린트 함수 안에 사용
        }
//        2.
        {
            System.out.println("당신이 먹고 싶은 저녁메뉴는?(자장면, 라면, 회)");
            String dinner = scn.nextLine();
            System.out.println(
                    switch (dinner) {
                        case "자장면" -> "중국집으로 가요";
                        case "라면" -> "분식집으로 가요";
                        case "회" -> "횟집으로 가요";
                        default -> "그냥 안먹어요";
                    }
            );
        }
//        3.
        {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자를 입력하세요"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자를 입력하세요"));
            int bigNum = Math.max(num1, num2); //입력 받은 두 숫자를 비교하는 static 메소드?
            if (num1 == num2) {
                System.out.println("두 숫자의 크기 같다.");
            } else if (bigNum == num1) {
                System.out.printf("앞 숫자(%d)가 더 크다.\n", num1);
            } else {
                System.out.printf("뒷 숫자(%d)가 크다.\n", num2);
            }

        }
//        4.
        {
            System.out.println("사원번호를 입력하세요.(A100EX, B100EX, C100EX)");
            String no = scn.nextLine();
            char first = no.charAt(0); //문자 하나 추출 메소드
            System.out.println(
                    switch (first) {
                        case 'A' -> "기획부";
                        case 'B' -> "총무부";
                        case 'C' -> "개발부";
                        default -> "다시 입력하세요.";
                    }
            );

        }
        scn.close();
    }
}

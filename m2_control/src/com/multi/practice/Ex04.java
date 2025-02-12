package com.multi.practice;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        1.
        {
            System.out.print("숫자 1 입력: ");
            int num1 = scn.nextInt();
            System.out.print("숫자 2 입력: ");
            int num2 = scn.nextInt();

            int bigNum = Math.max(num1, num2);
            if (num1 == num2) { //숫자가 같을 경우
                System.out.println("두 숫자의 크기 같다.");
            } else if (bigNum == num1) {
                System.out.println("앞 숫자가 크다.");
            } else {
                System.out.println("뒷 숫자가 크다.");
            }
        }
//        2.
        {
            System.out.print("당신이 좋아하는 과목은?: ");
            String data = scn.next(); //nextLine의 기본형인듯
            System.out.println(switch (data) { //switch expression은 프린트함수 안에도 사용 가능하다.
                        case "자바" -> "JSP로 점프";
                        case "파이썬" -> "장고로 점프";
                        default -> "무조건 열심히";
                    }
            );
        }
        scn.close();
    }
}

package com.multi.practice;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        1.
        {
            System.out.print("오늘 날짜를 입력하세요: ");
            String date = scn.nextLine();
            if (date.length() > 1) {
                String lastNum = date.substring(1); // sugstring 메소드 사용하여 문자열 추출. 1: 0부터 시작해서, 문자열의 2번째 자리부터 추출
                System.out.println(lastNum.equals("1") ? "할인 받는날" : "정가");
            } else {
                String lastNum = date.substring(0); //0: 0부터 시작해서, 문자열의 1번째 자리부터 추출
                System.out.println(lastNum.equals("1") ? "할인 받는날" : "정가");
            }
        }
//        2.
        {
            int buildingNum = 0;
            int labNum = 0;
            System.out.print("당신의 검사번호를 입력하세요: ");
            String num = scn.nextLine();
            String num1 = num.substring(0, 1); //문자열의 첫번재 자리 추출

            if (num1.equals("1") || num1.equals("2") || num1.equals("3") | num1.equals("4")) {
                buildingNum = 1;
            } else if (num1.equals("5") || num1.equals("6") || num1.equals("7") | num1.equals("8")) {
                buildingNum = 2;
            }

            String num2 = num.substring(1, 2); //문자열의 두번째 자리 추출
            labNum = switch (num2) {
                case "1" -> 1;
                case "2" -> 2;
                case "3" -> 3;
                case "4" -> 4;
                case "5" -> 5;
                case "6" -> 6;
                case "7" -> 7;
                case "8" -> 8;
                default -> 0;
            };
            System.out.printf("%d번 건물 %d번 검사실로 가세요.\n", buildingNum, labNum);

        }
//        3.
        {
            System.out.print("당신이 지금 하고 싶은 일은?: ");
            String toDo = scn.nextLine();
            String doNext = switch(toDo) {
                case "운동" -> "헬스장";
                case "식사" -> "음식점";
                case "휴식" -> "집";
                case "공부" -> "학원";
                default -> throw new IllegalStateException("Unexpected value: " + toDo); //switch expression 은 default 가 필수 인듯.
            };
            System.out.println(doNext + "으로");
        }
        scn.close();
    }
}

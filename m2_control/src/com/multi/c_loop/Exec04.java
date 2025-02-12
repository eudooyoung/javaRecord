package com.multi.c_loop;

import java.util.Scanner;

public class Exec04 {
    public static void main(String[] args) {
        /* [do-while문 표현식]
         * 초기식;
         * do {
         *     1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 구문(반복할 구문);
         *     증감식;
         * } while(조건식);
         * */

        do {
            System.out.println("조건 비교 전에 최초로 한번 실행됨");
        } while (false);

        System.out.println("반복문 종료 확인");

//        예쩨
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.print("문자열을 입력하세요 : ");
            str = sc.nextLine();
            System.out.println(str);
        } while (!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}

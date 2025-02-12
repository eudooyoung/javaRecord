package com.multi.b_conditional;


import java.util.Scanner;

public class Exec03 {
    /* [switch문 ] --> 대소비교는 안되고 일치 하는지 확인
     * switch(비교할변수) {   --> 비교할 변수는 정수 문자열 문자 enum 가능, **실수,논리 안됨**
     *     case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
     *     case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
     *     default : case에 모두 해당하지 않는 경우 실행할 구문; break;
     * }
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        switch (name) {
            case "자바":
                System.out.println("자바");
                break;
            case "파이썬":
                System.out.println("파이썬");
                break;
            case "리눅스":
                System.out.println("리눅스");
                break;
            default:
                System.out.println("다시 입력");
        }
    }

}

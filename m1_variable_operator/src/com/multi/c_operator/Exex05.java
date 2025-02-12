package com.multi.c_operator;

public class Exex05 {
    public static void main(String[] args) {
//        삼항연산자

        int num1 = 15;
        int num2 = -20;

        String checkNum1 = (num1 >= 0) ? "true" : "false";
        System.out.println(checkNum1);

        boolean isPositive = (num1 >= 0) ? true : false;
        System.out.println(isPositive);

        boolean isNagative = (num2 < 0) ? true : false;
        System.out.println(isNagative);


//------------------------------------------------------------------

        System.out.println();
        int num3 = 0;

        String checkNum3 = (num3 > 0) ? "양수" : (num3 == 0) ? "0 입니다" : "음수입니다";
        System.out.println(checkNum3);

    }
}

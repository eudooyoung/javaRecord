package com.multi.c_operator;

public class Exex04 {
    public static void main(String[] args) {
        //증감 연산자

        int num = 20;

        System.out.println(num);

        num++; // 1 증가
        System.out.println(num);

        ++num;
        System.out.println(num);

        num--;
        System.out.println(num);

        --num;
        System.out.println(num);

//-----------------------------------------------------------------------------
        System.out.println();

        int firstNum = 20;
        int result1 = firstNum++ * 3; // 후위 연산: (20*3) 계산 후, firstNum + 1

        System.out.println(result1); // 출력 결과: 60
        System.out.println(firstNum); // 출력 결과: 21

        int secondNum = 20;
        int result2 = ++secondNum * 3; // 전위 연산: secondNum + 1 연산 후, (secondNum *3)

        System.out.println(result2);
        System.out.println(secondNum);
    }
}

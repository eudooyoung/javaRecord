package com.multi.c_operator;

public class Exec01 {
    public static void main(String[] args) {
//      산술 연산자

        int n1 = 100;
        int n2 = 200;

        int n3 = n1 + n2;

        System.out.println(n3);

        int n4 = n3 + 100;
        System.out.println(n4);

        double div1 = (double) n1 / n2; //형변환 필요
//        자바에서 정수보다 더 큰 자료형으로 변환해서 계산 시 자동으로 형변환이 일어남
//        강제로 자료형을 바꾸는 것을 "형변환"이라고 부름.
        System.out.println(div1);

        double div2 = n1 % n2;
        System.out.println(div2);

        // byte, char, short, int 타입의 자료형의 리터럴 연산은 모두 int형으로 처리된다
        byte num1 = 3;
        System.out.println("num1: " + num1);
//        byte num2 = -num1; num1을 음수로 바꾸는 것도 연산으로 인식하기 때문에 컴파일 오류가 뜬다
        byte num2 = (byte) -num1; // 이런식으로 byte형으로 다시 형변환 시켜줘야 한다.

        System.out.println("-num1: " + num2);

        long num3 = 1351351313533333331L;
        long num4 = -num3; // long 타입은 문제 없음
        System.out.println(num4);

        float num5 = 0.13513535F;
        float num6 = -num5; //foat 타입도 문제 없음
        System.out.println(num6);

        // double 타입도 문제 없을 것임. int 타입 이하의 자료형에서만 일어나는 현상인듯.
    }
}

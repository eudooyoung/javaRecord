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
    }
}

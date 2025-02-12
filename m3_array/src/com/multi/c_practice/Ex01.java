package com.multi.c_practice;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
//        1.
        int[] room1 = new int[200]; // 저장되는 데이터 타입이 int형인 크기 200의 배열 생성
        room1[0] = 200; // 첫번째 값
        room1[1] = 2000; // 두번재 값
        room1[2] = 3000; // 세번째 값
        room1[199] = 5000; // 마지막 값
        System.out.println(Arrays.toString(room1)); //Arrays.toString 메소드를 이용해 배열 출력
        System.out.println();//공백
//        2.
        double[] room2 = new double[300]; // 저장되는 데이터 나입이 doible형인 크기 300개의 배열 생성
        room2[0] = 10.1; // 첫번재 값
        room2[1] = 20.2; // 두번째 값
        room2[2] = 30.2; // 세번재 값
        room2[299] = 50.5; // 마지막 값
        System.out.println(Arrays.toString(room2)); //Arrays.toString 메소드를 이용해 배열 출력

    }
}

package com.multi.c_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //스캐너 객체 생성
//      1.
        String[] travel = new String[5]; //문자열 배열, 크기: 5
        System.out.println("좋아하는 여행지 5개를 입력하세요."); // 지시문
        for (int i = 0; i < travel.length; i++) { //배열의 크기만큼 반복
            travel[i] = scn.nextLine(); //배열에 입력받은 순서대로 데이터 저장
        }
        System.out.println("당신이 좋아하는 여행지:");
        System.out.println(Arrays.toString(travel)); // 배열 출력
//      2.
        char[] color = new char[5]; // 문자 배열, 크기: 5
        System.out.println("좋아하는 색깔 5개를 입력하세요");
        for (int i = 0; i < color.length; i++) {
            color[i] = scn.nextLine().charAt(0); //입력은 nextLine으로 받고, 앞 글자만 charAt을 이용해 추출하여 배열에 저장
        }
        System.out.println("당신이 좋아하는 색깔 5개의 첫 글자:");
        System.out.println(Arrays.toString(color));
//      3.
        double[] heights = new double[5]; //double형 배열, 크기 5
        System.out.println("좋아하는 연예인 5명의 키를 입력하세요");
        for (int i = 0; i < 5; i++) {
            heights[i] = scn.nextDouble();
        }
        scn.nextLine();
        System.out.println("당신이 좋아하는 연예인 5명의 키:");
        System.out.println(Arrays.toString(heights));

        scn.close(); //스캐너 클로즈
    }
}

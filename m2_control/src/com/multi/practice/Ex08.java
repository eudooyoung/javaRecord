package com.multi.practice;

public class Ex08 {
    public static void main(String[] args) {
        char square = '▣';
        for (int y = 0; y < 10; y++) { //y축, 총 반복 횟수 설정
            for (int x = 0; y > x; x++) { //x축, x축을 중심으로 반사시켰을때 모양대로 함수식 대입
                System.out.print(square);
            }
            System.out.println();
        }
    }

}
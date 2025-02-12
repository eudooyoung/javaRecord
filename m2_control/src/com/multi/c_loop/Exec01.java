package com.multi.c_loop;

public class Exec01 {
    public static void main(String[] args) {

//        시작 값, 조건식, 증감
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        char star = '★';
        for (int i = 0; i < 3; i++) {
            System.out.println(star);
        }

        System.out.println();

//        while (조건식): 조건식이 true 인동안 반복
//        while (true) {
//            System.out.println("반갑습니다.");
//        }
        {
            int start = 1; //시작 값
            int end = 5; // 끝 값

            while (start <= end) {
                System.out.println(start);
                start++;
            }
        }

        System.out.println();
//        3부터 11까지 더하기. 2씩 증가
//        더한 값 출력
        {
            int start = 3;
            int sum = 3;

            while (start < 11) {
                start = start + 2;
                sum += start;
            }
            System.out.println(sum);
            System.out.println();
        }

//        짝수 뛰어넘기
        {
            int count = 0;
            for (int i = 0; i < 100; i++) {
                System.out.println((i % 2 == 1) ? i : ++count);
            }
            System.out.println(count);
            System.out.println();
        }

//        스킵
        {
            for (int i = 0; i < 100; i++) {
                if (i % 3 == 0) continue; // 아래 로직을 수행하지 않음
                System.out.println(i);
            }
        }
//
        System.out.println();
        {
            int sum3 = 0;
            for (int i = 1; i <= 1000; i++) {
                if (sum3 >= 100) {
                    break; //가장 가까운 반복문 빠져나감
                }
                if (i % 5 == 0) {
                    continue;
                }
                sum3 = sum3 + i;
            }
            System.out.println(sum3);
            System.out.println();
        }

//  1)100부터 1까지 프린트!
        {
            int firstNum = 100;
            for (int i = 0; i < 100; i++) {
                System.out.println(firstNum);
                firstNum--;
            }
        }

//  3)1부터 100까지 중 2씩 증가하면서 프린트!
        {
            System.out.println();
            int firstNum = 1;
            for (int i = 0; i < 50; i++) {
                System.out.println(firstNum);
                firstNum += 2;
            }
        }
    }
}

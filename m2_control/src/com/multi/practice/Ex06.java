package com.multi.practice;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        1.
        {
            System.out.print("시작 값을 입력하세요: ");
            int numFirst = scn.nextInt();
            System.out.print("종료 값을 입력하세요: ");
            int numLast = scn.nextInt();
            int length = (numLast - numFirst) + 1; //총 반복횟수 계산
            int sum = 0; //총합 초기화
            for (int i = 0; i < length; i++) {
                int add = numFirst + i; // 총합에 더해줄 값. for문 안에서만 사용. 시작 값 + 회차 수로 계산
                sum += add;
            }
            System.out.println(sum);
        }
//        2.
        {
            System.out.print("시작 값을 입력하세요: ");
            int numFirst = scn.nextInt();
            System.out.print("종료 값을 입력하세요: ");
            int numLast = scn.nextInt();
            System.out.print("점프 값을 입력하세요: ");
            int numJump = scn.nextInt();

            int length = (numLast - numFirst) + 1; //총 반복횟수 계산
            int sum = 0; //총합 초기화
            for (int i = 0; i < length; i++) {
                if (i % numJump != 0) { // 0부터 시작한 회차를 점프값으로 나누었을 때의 나머지가 0일때만 아래의 동작 수행
                    continue;// 회차 수를 점프값으로 나누었을 때의 나머지가 0이 아니면 여기서 다시 for문 처음으로 이동
                }
                int add = numFirst + i; // 총합에 더해줄 값. for문 안에서만 사용. 시작 값 + 회차 수로 계산
                sum += add;
                if (sum >= 100) {
                    System.out.println("총합이 100을 넘어 프로그램을 종료합니다.");
                    scn.close(); //여기서 프로그램 종료할 경우 스캐너 클로즈
                    System.exit(0);
                }
            }
            System.out.println(sum);
        }
        scn.close();
    }

}
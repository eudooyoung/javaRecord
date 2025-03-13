package com.multi.thisisjava;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
//        학생들의 점수를 분석하는 프로그램을 만들려고 한다. 키보드로부터 학생 수와 각 학생들의 점수를 입력받고, while 문과 Scanner 의 nextLin() 메소드를 이용해서
//        최고 점수 및 평균 점수를 출력하는 코드를 작성하시오.
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int totalStudent = 0;
        int[] scores = null;
        int topScore = 0;
        int scoreSum = 0;
        double scoreAvg = 0.0;


        while (true) {

            System.out.println("-------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------------------");
            System.out.print("선택> ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("학생수> ");
                    totalStudent = Integer.parseInt(sc.nextLine());
                    scores = new int[totalStudent];
                }
                case 2 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("score[" + i + "]> ");
                        scores[i] = Integer.parseInt(sc.nextLine());
                        scoreSum += scores[i];
                        if (topScore < scores[i]) topScore = scores[i];
                    }
                }
                case 3 -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("score[" + i + "]: " + scores[i]);
                    }
                }
                case 4 -> {
                    scoreAvg = (double) scoreSum / scores.length;
                    System.out.println("최고 점수: " + topScore);
                    System.out.printf("평균 점수: %.2f\n", scoreAvg);
                }
                case 5 -> {
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
                }
                default -> System.out.println("다시 입력하세요.");
            }
        }
    }
}

package com.multi.d_add;

import java.util.Scanner;

public class Exec03 {
    public static void main(String[] args) {
// 인기투표만들기 - 반복문 사용, 그만 입력해서 종료

//    투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진 중 선택) 또는 '그만'을 입력해 종료:
//    제니
//    제니에게 투표했습니다!
//    투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진 중 선택) 또는 '그만'을 입력해 종료:
//    사나
//    사나에게 투표했습니다!
//    투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진 중 선택) 또는 '그만'을 입력해 종료:
//    제니
//    제니에게 투표했습니다!
//    투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진 중 선택) 또는 '그만'을 입력해 종료:
//    그만
//

//    출력결과
//    최종 득표 결과:
//    제니: 2표
//    사나: 1표
//    카리나: 0표
//    안유진: 0표
//    총 득표수: 3표
//    가장 많은 표를 받은 후보: 제니
//
        Scanner scn = new Scanner(System.in);
        int jenny = 0;
        int sana = 0;
        int carina = 0;
        int ahnyujin = 0;
        boolean run = true;

        while (run) {
            System.out.println("투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진 중 선택) 또는 '그만'을 입력해 종료:");
            String candidate = scn.nextLine();

            switch (candidate) {
                case "제니":
                    jenny++;
                    System.out.println("제니에게 투표했습니다!");
                    break;
                case "사나":
                    sana++;
                    System.out.println("사나에게 투표했습니다!");
                    break;
                case "카리나":
                    carina++;
                    System.out.println("카리나에게 투표했습니다!");
                    break;
                case "안유진":
                    ahnyujin++;
                    System.out.println("안유진에게 투표했습니다!");
                    break;
                case "그만":
                    System.out.println("투표를 종료합니다.");
                    run = false;
                default:
                    System.out.println("다시 입력하세요");
                    break;
            }
        }

        int sum = jenny + sana + carina + ahnyujin;

        int winner = 0;
        if (jenny > sana && jenny > carina && jenny > ahnyujin) winner = jenny;
        if (sana > jenny && sana > carina && sana > ahnyujin) winner = sana;
        if (carina > sana && carina > jenny && carina > ahnyujin) winner = carina;
        if (ahnyujin > sana && ahnyujin > carina && ahnyujin > jenny) winner = ahnyujin;

        System.out.println("최종 투표 결과");
        System.out.println("제니: " + jenny + "표");
        System.out.println("사나: " + sana + "표");
        System.out.println("카리나: " + carina + "표");
        System.out.println("안유진: " + ahnyujin + "표");
        System.out.println("총 투표 수: " + sum);

//        switch (winner) {
//            case jenny:
//                System.out.println("가장 많은 표를 받은 후보: 제니");
//                break;
//            case sana:
//                System.out.println("가장 많은 표를 받은 후보: 사나");
//                break;
//            case carina:
//                System.out.println("가장 많은 표를 받은 후보: 카리나");
//                break;
//            case ahnyujin:
//                System.out.println("가장 많은 표를 받은 후보: 안유진");
//                break;
//            default:
//                System.out.println("몰라");
//        }

    }
}

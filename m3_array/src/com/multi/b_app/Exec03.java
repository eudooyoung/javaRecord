package com.multi.b_app;

import java.util.Scanner;

/**
 * packageName    : com.multi.b_app
 * fileName       : Exec02
 * author         : uni
 * date           : 2025-02-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-05        uni       최초 생성
 */
public class Exec03 {
    /**
     * // 숫자로 입력받아도 상관없음 자유형식
     * 투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진) 또는 '그만'을 입력해 종료:
     * 제니
     * 제니에게 투표했습니다!
     * 투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진) 또는 '그만'을 입력해 종료:
     * 사나
     * 사나에게 투표했습니다!
     * 투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진) 또는 '그만'을 입력해 종료:
     * 제니
     * 제니에게 투표했습니다!
     * 투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진) 또는 '그만'을 입력해 종료:
     * 그만
     * 최종 득표 결과:
     * 제니: 2표
     * 사나: 1표
     * 카리나: 0표
     * 안유진: 0표
     * 총 득표수: 3표
     * 가장 많은 표를 받은 후보: 제니
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] voteCount = new int[4];
        boolean run = true;
//멤버이름 스트링 배열로 만들기
        do {
            System.out.println("투표할 후보 이름을 입력하세요 (제니, 사나, 카리나, 안유진) 또는 '그만'을 입력해 종료:");
            String vote = scn.nextLine();
            switch (vote) {
                case "제니":
                    voteCount[0] += 1;
                    break;
                case "사나":
                    voteCount[1] += 1;
                    break;
                case "카리나":
                    voteCount[2] += 1;
                    break;
                case "안유진":
                    voteCount[3] += 1;
                    break;
                case "그만":
                    run = false;
                    continue;
                default:
                    System.out.println("다시 입력하세요.");
                    break;
            }
        } while (run);

        System.out.println("최종 투표 결과: ");
        System.out.println("제니: " + voteCount[0] + "표");
        System.out.println("사나: " + voteCount[1] + "표");
        System.out.println("카리나: " + voteCount[2] + "표");
        System.out.println("안유진: " + voteCount[3] + "표");

        int sum = 0;
        for (int i : voteCount) {
            sum += i;
        }
        System.out.print("총 득표수: ");
        System.out.println(sum);


        int winner = Math.max(Math.max(voteCount[0], voteCount[1]), Math.max(voteCount[2], voteCount[3]));

        System.out.print("가장 많은 투표를 받은 후보: ");



//        if (winner == voteCount[0]) {
//            System.out.println("제니");
//        } else if (winner == voteCount[1]) {
//            System.out.println("사나");
//        } else if (winner == voteCount[2]) {
//            System.out.println("카리나");
//        } else if (winner == voteCount[3]) {
//            System.out.println("안유진");
//        }

        scn.close();


//        String은 불변
//        StringBuffer를 사용하면 값이 바꾸어 사용할 수 있다.
//        StringBuffer winner = new StringBuffer();
//        for(int i = 0; i< member.length; i++){
//        if(vote[i] > maxVote){

//        winner.setLength(0);
//        winner.append(member[i]
//        int maxVote = 0;
//          StringBuffer winner = new StringBuffer();
//          for (int i = 0; i < member.length; i++) {
//          if(vote[i] > maxVote){
//        maxVote = vote[i];
//
//        winner.setLength(0);
//        winner.append(member[i]);
//
//    }else if(vote[i] == maxVote){
//        winner.append(",").append(member[i]); // 메소드 체이닝
//    }
//
//}
    }
}

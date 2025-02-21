package com.uni.stream.homework;

import java.util.List;
import java.util.Scanner;

public class VoteMenu {

    private static final Scanner sc = new Scanner(System.in);
    private final VoteController vc = new VoteController();

    public void mainMenu() {
        while (true) {
            System.out.println("*+*+*+* 아이돌 후보 투표 프로그램 *+*+*+*");
            System.out.println("1. 후보 등록");
            System.out.println("2. 전체 후보 조회");
            System.out.println("3. 후보 삭제");
            System.out.println("4. 투표");
            System.out.println("5. 투표 종료");
            System.out.println("9. 프로그램 종료");
            System.out.println("*+*+*+**+*+*+**+*+*+**+*+*+**+*+*+**+*+*");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addCandidate();
                    break;
                case 2:
                    showAllCandidates();
                    break;
                case 3:
                    removeCandidate();
                    break;
                case 4:
                    voteCandidate();
                    break;
                case 5:
                    showResult();
                    return;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");
                    break;
            }
        }
    }

    //    투표 결과 출력
    private void showResult() {
        System.out.println("투표를 종료합니다.");
        System.out.println("*+*+*+* 투표 결과 *+*+*+*");
        vc.getWinner();
        sc.close();
    }

    //    투표
    private void voteCandidate() {
        System.out.println("투표할 후보명을 입력하세요.");
        String name = sc.nextLine();
        boolean isVoted = vc.voteCandidate(name);

        if (!isVoted) {
            System.out.println("입력하신 후보를 찾을 수 없습니다.");
        } else {
            System.out.println("투표 성공!");
        }
    }

    //    후보자 삭제
    private void removeCandidate() {
        System.out.print("삭제할 후보명: ");
        String name = sc.nextLine();
        boolean isDelete = vc.removeCandidate(name);

        if (!isDelete) {
            System.out.println("입력하신 후보를 찾을 수 없습니다.");
        } else {
            System.out.println("삭제 성공!");
        }
    }

    //    등록된 후보자 조회
    private void showAllCandidates() {
        System.out.println("*+*+*+* 전체 후보 조회 *+*+*+*");
        List<Candidate> candidateList = vc.getCandidateList();
        candidateList.stream()
                .forEach(System.out::println);
    }

    //    후보자 등록
    private void addCandidate() {
        System.out.print("후보 이름: ");
        String name = sc.nextLine();
        boolean isRegistered = vc.registerCandidate(name);
        if (!isRegistered) {
            System.out.println("이미 등록된 후보입니다.");
        } else {
            System.out.println("후보 등록 성공!");
        }
    }


}

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
public class Exec02 {

    /**
     * 간단한 좌석 예약 시스템
     * 사용자가 원하는 좌석 번호를 입력하여 예약을 진행할 수 있으며, 모든 좌석의 예약 상태를 확인할 수 있다
     * -----------------------------
     * 0  1  2  3  4  5  6  7  8  9
     * -----------------------------
     * 0  0  0  0  0  0  0  0  0  0
     * 원하는 좌석 입력(종료-1)>> 1
     * 예약을 완료했습니다.
     * -----------------------------
     * 0  1  2  3  4  5  6  7  8  9
     * -----------------------------
     * 0  1  0  0  0  0  0  0  0  0
     * 원하는 좌석 입력(종료-1)>> 2
     * 예약을 완료했습니다.
     * -----------------------------
     * 0  1  2  3  4  5  6  7  8  9
     * -----------------------------
     * 0  1  1  0  0  0  0  0  0  0
     * 원하는 좌석 입력(종료-1)>> -1
     * 프로그램 종료!
     **/
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] seat = new int[10];
        boolean run = true;
        while (run) {
// 숫자가 더 클때 오류 확인
            System.out.println("-----------------------------");
            System.out.println("0  1  2  3  4  5  6  7  8  9");
            for (int i : seat) {
                System.out.print(i + "  ");
            }
            System.out.print("\n-----------------------------\n");
            System.out.print("원하는 좌석 입력(종료: -1) >> ");
            int rsv = scn.nextInt();
            if (rsv == -1) {
                run = false;
                continue;//break면 바로 while을 빠져나감, continue일 경우 처음으로 돌아감.
            } else if (-1 < rsv && rsv < 10) {
                seat[rsv] = 1;
            } else {
                System.out.println("다시 입력하세요");
                continue;
            }
            System.out.print("\n예약을 완료했습니다.\n");
        }
        scn.close();
    }
}

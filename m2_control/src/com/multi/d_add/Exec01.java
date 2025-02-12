package com.multi.d_add;

import javax.swing.*;
import java.util.Random;

public class Exec01 {
    public static void main(String[] args) {
//    랜덤한수 1 ~ 100
//    dialog로 입력 받은 값과 일치하는지 비교
        Random rd = new Random();
        int target = rd.nextInt(100) + 1;

        int noCnt = 0; //오답 횟수
        int totCnt = 0; //총 횟수

        while (true) {
            String data = JOptionPane.showInputDialog("숫자 입력 ");
            int data2 = Integer.parseInt(data);

            totCnt++;

            if (data2 == target) {
                System.out.println("정답");
                break;
            } else {
                System.out.println("오답");
                noCnt++;

                if (data2 > target) {
                    System.out.println("너무 큽니다");
                } else {
                    System.out.println("너무 작습니다");
                }
            }
        }

        System.out.println("총 시도 횟수: " +totCnt);
        System.out.println("오답 횟수: " +noCnt);

    }
}

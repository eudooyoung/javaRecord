package com.multi.a_inout;

import javax.swing.*;

public class Exec02 {
    public static void main(String[] args) {
        String hour = JOptionPane.showInputDialog("지금 몇 시 인가요?");
        System.out.println(hour);
        JOptionPane.showMessageDialog(null, hour + "시 입니다.");

        if (hour.length() == 0) {
            System.out.println("시간을 숫자 0~24로 입력해 주세요.");
            return; //뒷 코드를 수행하지 않음
        }

        int hour2 = Integer.parseInt(hour);
        System.out.println(hour2);

        if (hour2 < 16) {
            System.out.println("아직 집에 갈 시간이 멀었다.");
        } else {
            System.out.println("집에 갈 시간이 얼마 안 남았다.");
        }

        System.out.println((hour2 < 16) ? "아직 집에 갈 시간이 멀었다." : "집에 갈 시간이 얼마 안 남았다.");
    }
}

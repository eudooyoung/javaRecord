package com.multi.a_thread.run;

import com.multi.a_thread.thread.TimerTest;

import java.util.Timer;

public class Run3 {
    public static void main(String[] args) {
        Timer timer = new Timer(); // 특정 시간 후에 실행할 작업 예약, import 필요
        TimerTest timerTest = new TimerTest();
        System.out.println("10초 동안 게임을 진행할 수 없습니다.");
        timer.schedule(timerTest, 10000);
        System.out.println("10초가 카운드 되고 있습니다.");

    }
}

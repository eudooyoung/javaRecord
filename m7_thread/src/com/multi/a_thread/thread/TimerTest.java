package com.multi.a_thread.thread;

import java.util.TimerTask;

public class TimerTest extends TimerTask { // abstract: 추상- 직접 구현해야함.
    @Override
    public void run() {
        System.out.println("게임이 종료되었습니다.");
    }

}

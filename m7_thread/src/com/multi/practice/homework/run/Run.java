package com.multi.practice.homework.run;

import com.multi.practice.homework.thread.DecreaseThread;
import com.multi.practice.homework.thread.IncreaseThread;

public class Run {
    public static void main(String[] args) {
        IncreaseThread th1 = new IncreaseThread();
        DecreaseThread th2 = new DecreaseThread();

        th1.start();
        th2.start();

    }
}

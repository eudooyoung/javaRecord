package com.multi.practice.homework.run;

import com.multi.practice.homework.thread.NameThread;
import com.multi.practice.homework.thread.StarThread;

public class Run2 {
    public static void main(String[] args) {
        NameThread t1 = new NameThread();
        StarThread t2 = new StarThread();

        t1.start();
        t2.start();
    }
}

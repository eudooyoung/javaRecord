package com.multi.b_method.run;

import com.multi.b_method.thread.CountThread;
import com.multi.b_method.thread.ImageThread;
import com.multi.b_method.thread.TimeThread;

public class Run2 {
    public static void main(String[] args) {

        TimeThread times = new TimeThread(); // 각 thread 객체 생성
        ImageThread images = new ImageThread();
        CountThread counters = new CountThread();

        times.start(); // start 메소드 호출
        images.start();
        counters.start();
    }
}

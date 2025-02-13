package com.multi.practice.homework.run;

import com.multi.practice.homework.thread.Count;

public class CountGame {
    public static void main(String[] args) throws InterruptedException {

        Count[] p = {
                new Count("플레이어1"),
                new Count("플레이어2"),
                new Count("플레이어3")
        };

        p[0].start();
        p[1].start();
        p[2].start();


    }
}

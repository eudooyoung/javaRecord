package com.multi.practice.homework.cancel;

import java.util.Random;

public class Player {

    private String name;
    private String[] choice = {"가위", "바위", "보"};

    public Player(String name) {
        this.name = name;
    }

    public synchronized String getChoice() {
        int num = new Random().nextInt(3);
        return this.choice[num];
    }

    public String getName() {
        return this.name;
    }

}

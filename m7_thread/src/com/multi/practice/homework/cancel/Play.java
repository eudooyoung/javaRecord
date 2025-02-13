package com.multi.practice.homework.cancel;

public class Play extends Thread {

    private Player player;

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            this.player.getChoice();
        }
    }
}

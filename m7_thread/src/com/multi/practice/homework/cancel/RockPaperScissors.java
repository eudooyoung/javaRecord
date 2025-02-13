package com.multi.practice.homework.cancel;


public class RockPaperScissors {
    public static void main(String[] args) {

        Player p1 = new Player("플레이어1");
        Player p2 = new Player("플레이어2");

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println(p1.getName() + ": " + p1.getChoice());
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println(p2.getName() + ": " +p2.getChoice());
            }
        });

        t1.start();
        t2.start();
    }
}

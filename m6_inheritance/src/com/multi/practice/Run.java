package com.multi.practice;

public class Run {
    public static void main(String[] args) {


        Reptile reptile1 = new Crocodile("악돌이", Size.BIG, Weight.HEAVY, "악어", "늪", true);
        reptile1.bornEgg();
        reptile1.describe();
        ((Crocodile) reptile1).openJaw();

        System.out.println("-------------------------------------");
        Reptile reptile2 = new Turtle("겁욱이", Size.MEDIUM, Weight.HEAVY, "거북이", "바다", true);
        reptile2.bornEgg();
        reptile2.describe();
        ((Turtle) reptile2).swim();

    }
}

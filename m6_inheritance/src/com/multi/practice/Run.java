package com.multi.practice;

public class Run {
    public static void main(String[] args) {


        Reptile reptile1 = new Crocodile("악돌이", Size.BIG, Weight.HEAVY, "악어", "늪", true);
        reptile1.bornEgg();
        reptile1.describe();
        if (reptile1 instanceof Crocodile crocodile1) {
            System.out.println(crocodile1);
            crocodile1.openJaw();
        }


        System.out.println("-------------------------------------");
        Reptile reptile2 = new Turtle("겁욱이", Size.MEDIUM, Weight.HEAVY, "거북이", "바다", true);
        reptile2.bornEgg();
        reptile2.describe();
        if (reptile2 instanceof Turtle turtle1) {
//            reptile2 가 Turtle 클래스와 형식이 같다면 Turtle 클래스의 turtle1을 반환
            System.out.println(turtle1);
            turtle1.swim();
        }

        System.out.println(reptile1 instanceof Reptile);

    }
}

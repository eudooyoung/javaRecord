package com.multi.e_enum.enum_test;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        RockPaperScissors choice;

        choice = switch (new Random().nextInt(3) + 1) {
            case 1 -> RockPaperScissors.ROCK;
            case 2 -> RockPaperScissors.PAPER;
            case 3 -> RockPaperScissors.SCISSORS;
            default -> RockPaperScissors.GIVE_UP;
        };


        System.out.println(choice);
        System.out.println(choice.getClass().getSimpleName()); // 출력 결과: RockPaperScissors(클래스 이름)
        System.out.println(choice.name());

    }
}


package com.multi.b_conditional;


public class Exec05 {
    //    Switch Expression (Java 12 이상)
    public static void main(String[] args) {
        int score1 = 0;
        char grade = 'B'; //char로 확인
        switch (grade) {
            case 'A':
                score1 = 100;
                break;
            case 'B':
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1: " + score1);

        int score2 = switch (grade) {
            case 'A' -> 100;
            case 'B' -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;

        };

        System.out.println("score2: " + score2);

//        값을 반환
        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원입니다.");

            case 'B', 'b' -> System.out.println("일반 회원입니다.");

            default -> System.out.println("손님입니다.");

        }

        String animal = "Dog";
        String sound = "";

        String sound2 = switch (animal) {
            case "Dog" -> "Bark";
            case "Cat" -> "Meow";
            case "Cow" -> "Moo";
            case "Duck" -> "Quack";
            default -> "Unknown sound";
        };
        System.out.println(sound2);

        System.out.println(switch (animal) {
                    case "Dog" -> "Bark";
                    case "Cat" -> "Meow";
                    case "Cow" -> "Moo";
                    case "Duck" -> "Quack";
                    default -> "Unknown sound";
                }
        );


    }
}

package com.multi.e_enum;

public class Run {
    //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Enum.html
    public static void main(String[] args) {
        //enum 클래스는 상수필드를 관리, enum 클래스명
//        stataic final자동 선언
//        열거형, 상수값 이외의 값은 할당이 안됨
//        enum Day {MONDAY, TUESDAY, FRIDAY} //enum 클래스의 상수 필드 관리

        Day today = Day.FRIDAY;

        System.out.println(today);
        switch (today) {
            case MONDAY:
                break;
            case FRIDAY:
                System.out.println("금요일");
                break;
        }


//    Day.value():  모든 상수를 배열로 반환
        for(Day day : Day.values()){
            System.out.println(day);
        }

        Day day = Day.valueOf("MONDAY");
        System.out.println(day);
        System.out.println();

        System.out.println(today.getKoreanDay());
        System.out.println(today.name());
        System.out.println(today.ordinal()); //선언된 순서의 인덱스
    }
}

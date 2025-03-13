package com.multi.thisisjava._enum;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
//        열거 타입 변수를 선언
        Week today = null;

//        Calendar
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DAY_OF_WEEK);

//        열거값 대입
        today = switch (day) {
            case 1 -> Week.SUNDAY;
            case 2 -> Week.MONDAY;
            case 3 -> Week.TUESDAY;
            case 4 -> Week.WEDNESDAY;
            case 5 -> Week.THURSDAY;
            case 6 -> Week.FRIDAY;
            case 7 -> Week.SATURDAY;
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };

//        열거값 비교
        if (today == Week.FRIDAY) {
            System.out.println("오늘은 금요일 입니다.");
        } else {
            System.out.println("오늘은 금요일이 아닙니다.");
        }
    }
}

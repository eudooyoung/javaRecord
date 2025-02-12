package com.multi.practice;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ex03 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); //LocalDate 객체 생성
        LocalTime nowTime = LocalTime.now(); //LocalTime 객체 생성

//        1.
        {
            int year = now.getYear(); //LocalDate로 현재 연도 호출
            System.out.println(year >= 2000 ? "밀레니엄 세대시군요" : "밀레니엄 세대가 아니시군요");
        }
//        2.
        {
            String today = now.getDayOfWeek().toString(); //LocalDate로 현재 요일 호출
            if (today.equals("SATURDAY") || today.equals("SUNDAY")) {
                System.out.println("쉬자");
            } else {
                System.out.println("공부하자");
            }
        }
//        3.
        {
            String month = now.getMonth().toString(); //LocalDate로 현재 월 호출
            switch (month) {
                case "FEBRUARY":
                    System.out.println("28일까지");
                    break;
                case "APRIL":
                case "JUNE":
                case "SEPTEMBER":
                    System.out.println("30일까지");
                    break;
                default:
                    System.out.println("31일까지");
            }
        }
//        4.
        {
            int time = nowTime.getHour(); //LocalTime으로 현재 시간 추출
            if (time < 11) {
                System.out.println("굿모닝");
            } else if (time < 15) {
                System.out.println("굿애프터눈");
            } else if (time < 19) {
                System.out.println("굿이브닝");
            } else {
                System.out.println("굿나잇");
            }
        }
    }
}

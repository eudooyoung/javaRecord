package com.multi.thisisjava.ex02;

public class CarExample {
    public static void main(String[] args) {
//        객체 생성
        Car myCar = new Car();

//        Car 객체의 필드값 읽기
        System.out.println("제작 회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고 속도: " + myCar.maxSpeed);
        System.out.println("현재 속도: " + myCar.speed);

//        Car 객체의 필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
    }
}

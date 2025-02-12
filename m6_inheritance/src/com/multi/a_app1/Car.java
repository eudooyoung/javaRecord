package com.multi.a_app1;

public class Car {

    private boolean isRunning; // 자동차가 달리고 있는지 나타내는 boolean값

    public Car() {
        System.out.println("Car의 기본생성자");
    }

    public void run() { // 자동차를 달리게 하는 함수
      isRunning = true;
        System.out.println("자동차가 달립니다");
    };

    public void soundHorn() {
        if(isRunning) {
            System.out.println("빵빵");
        } else {
            System.out.println("주행중이 아닙니다.");
        }
    }

    public void stop() {
        isRunning = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public boolean isRunning() { // 다른 클래스에 isRunning 값을 넘겨주기 위한 함수 getter?
        return isRunning;
    }
}

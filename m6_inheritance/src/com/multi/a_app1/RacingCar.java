package com.multi.a_app1;

public class RacingCar extends Car{

    public RacingCar() {
        System.out.println("RacingCar 기본 생성자");
    }

    @Override
    public void run() {
        System.out.println("RacingCar가 질주합니다");
    }

    @Override
    public void soundHorn() {
        System.out.println("RacingCar는 경적을 울리지 않습니다.");
    }

    @Override
    public void stop() {
        System.out.println("RacingCar가 멈춥니다");
    }

    public void drift(){
        System.out.println("RacingCar 가 드리프트 합니다.");
    }
}

package com.multi.homework.car;

public class AppleCar implements Car {

    @Override
    public void startCar() {
        System.out.println("사과차의 시동이 걸립니다.");
    }

    @Override
    public void openCar() {
        System.out.println("사과차의 껍질이 깍입니다.");
    }
}

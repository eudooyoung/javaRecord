package com.multi.homework.car;

public class BananaCar implements Car {
    @Override
    public void startCar() {
        System.out.println("바나나차의 시동이 걸립니다.");
    }

    @Override
    public void openCar() {
        System.out.println("바나나차의 껍질이 벗겨집니다.");
    }
}

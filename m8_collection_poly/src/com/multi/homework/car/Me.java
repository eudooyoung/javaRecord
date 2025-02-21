package com.multi.homework.car;

public class Me {
    public static void main(String[] args) {
        Car car = new AppleCar();

        car.openCar();
        car.startCar();

        car = new BananaCar();

        car.openCar();
        car.startCar();
    }

}

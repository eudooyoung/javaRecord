package com.multi.c_add.carracer;

public class CarRacer {
    private Car car = new Car(); //

    public void startUp(){
        car.startUp();
    }

    public void stepAccelator(){
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }

}

package com.multi.practice;

public final class Turtle extends Reptile{

    private boolean isSwiming;

    public Turtle(String name, Size size, Weight weight, String type, String home, boolean isSwiming) {
        super(name, size, weight, type, home);
        this.isSwiming = isSwiming;
    }

    public void swim() {
        if(isSwiming) {
            System.out.println(getName() + "가(이) 헤엄을 칩니다.");
        } else {
            System.out.println(getName() + "가(이) 헤엄을 치지 않습니다.");
        }
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "isSwiming=" + isSwiming +
                '}' + super.toString();
    }
}

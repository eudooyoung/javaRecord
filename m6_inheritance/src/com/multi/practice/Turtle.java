package com.multi.practice;

public final class Turtle extends Reptile{

    private boolean isSwim;

    public Turtle(String name, Size size, Weight weight, String type, String home, boolean isSwim) {
        super(name, size, weight, type, home);
        this.isSwim = isSwim;
    }

    public void swim() {
        if(isSwim) {
            System.out.println(getName() + "가(이) 헤엄을 칩니다.");
        } else {
            System.out.println(getName() + "가(이) 헤엄을 치지 않습니다.");
        }
    }
}

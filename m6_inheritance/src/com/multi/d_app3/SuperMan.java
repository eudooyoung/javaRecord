package com.multi.d_app3;

public class SuperMan extends Man{

    private boolean fly;

    public SuperMan(int age, String name, int power, boolean fly) {
        super(age, name, power);
        this.fly = fly;
    }

    public void space() {
        if(fly) {
            System.out.println("슈퍼맨이 날고 있습니다.");
        } else {
            System.out.println("슈퍼맨이 날고 있지 않습니다.");
        }
    }

    @Override
    public String toString() {
        return "SuperMan{" +
                "fly=" + fly +
                "} " + super.toString();
    }
}

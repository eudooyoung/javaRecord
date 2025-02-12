package com.multi.d_app3;

public class Man extends Human{

    private int power;

    public Man(int age, String name, int power) {
        super(age, name);
        this.power = power;
    }

    public void run() {
        System.out.println(getName() + "이(가) 달립니다.");
    }

    @Override
    public String toString() {
        return "Man{" +
                "power=" + power +
                "} " + super.toString();
    }

}

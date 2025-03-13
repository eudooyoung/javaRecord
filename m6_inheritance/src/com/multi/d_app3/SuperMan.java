package com.multi.d_app3;

public class SuperMan extends Man{

    private boolean isFlying;

    public SuperMan(int age, String name, int power, boolean isFlying) {
        super(age, name, power);
        this.isFlying = isFlying;
    }

    public void space() {
        if(isFlying) {
            System.out.println(super.getName() + "이 하늘을 납니다");
        } else {
            System.out.println(super.getName() + "이 땅에 내려 왔습니다.");
        }
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void run() {
        System.out.println("슈퍼맨이 질주합니다.");
    }

    @Override
    public String toString() {
        return "SuperMan{" +
                "isFlying=" + isFlying +
                "} " + super.toString();
    }
}

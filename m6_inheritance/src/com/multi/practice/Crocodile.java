package com.multi.practice;

public non-sealed class Crocodile extends Reptile {

    private boolean isJaw;

    public Crocodile(String name, Size size, Weight weight, String type, String home, boolean isJaw) {
        super(name, size, weight, type, home);
        this.isJaw = isJaw;
    }

    public void openJaw() {
        if(isJaw) {
            System.out.println(getName() + "가(이) 턱을 벌립니다."); // Reptile 클래스를 상속 받았기 때문에 getName()을 호출할 수 있다.
        } else {
            System.out.println(getName() + "가(이) 턱을 벌리지 않습니다.");
        }
    }
}


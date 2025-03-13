package com.multi.practice;

public non-sealed class Crocodile extends Reptile {

    private boolean isJawOpen;

    public Crocodile(String name, Size size, Weight weight, String type, String home, boolean isJawOpen) {
        super(name, size, weight, type, home);
        this.isJawOpen = isJawOpen;
    }

    public void openJaw() {
        if(isJawOpen) {
            System.out.println(getName() + "가(이) 턱을 벌립니다."); // Reptile 클래스를 상속 받았기 때문에 getName()을 호출할 수 있다.
        } else {
            System.out.println(getName() + "가(이) 턱을 벌리지 않습니다.");
        }
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "isJawOpen=" + isJawOpen +
                '}' + super.toString();
    }
}


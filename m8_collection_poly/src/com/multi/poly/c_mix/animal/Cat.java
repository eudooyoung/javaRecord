package com.multi.poly.c_mix.animal;

public class Cat extends Animal implements Action {

    public Cat(String name) {
        super(name);
    }
//    인터페이스안에 있는 메소드를 전부 재정의 해줘야 하는듯
    @Override
    public void makeSound() {
        sound();
    }

    @Override
    public void eat() {
        System.out.println(getName() + "은 츄르를 먹습니다.");

    }

    @Override
    public void play() {
        System.out.println(getName() + "은 장난감을 가지고 놉니다..");
    }

    @Override
    public void sound() {
        System.out.println(getName() + "은 야옹하고 소리를 냅니다.");
    }
}

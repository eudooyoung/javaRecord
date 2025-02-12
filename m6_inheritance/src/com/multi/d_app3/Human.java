package com.multi.d_app3;

public class Human {

    private int age;
    private String name;

    public void eat() {
        System.out.println("밥을 먹습니다");
    }

    public void sleep() {
        System.out.println("잠을 잡니다.");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

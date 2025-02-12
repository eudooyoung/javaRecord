package com.multi.practice;

public sealed class Reptile permits Crocodile, Turtle {

    private String name;
    private Size size;
    private Weight weight;
    private String type;
    private String home;

    public Reptile(String name, Size size, Weight weight, String type, String home) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.type = type;
        this.home = home;
    }

    public void bornEgg() {
        System.out.println(name + "가(이) 알에서 태어납니다.");
    }

    public void describe() {
        System.out.println("이름: " + name + ", 종류: " + type);
        System.out.println(name +"는(은) " +  size.getSize());
        System.out.println(name + "는(은) " + weight.getWeight());
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                ", home='" + home + '\'' +
                '}';
    }
}

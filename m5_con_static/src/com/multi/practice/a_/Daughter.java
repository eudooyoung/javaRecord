package com.multi.practice.a_;

public class Daughter {
    //    필드
    private String name;
    private char gen;

    //    스태틱
    private static int dadWallet;
    private static int count;

    //    기본생성자
    public Daughter() {
        count++; // 객체 생성시 카운드 증가
        dadWallet -= 1000; // 객체 생성시(딸 출생시) 1000원 지출
    }

    //    이름, 성별 매개 변수 생성자
    public Daughter(String name, char gen) {
        this.name = name;
        this.gen = gen;

        count++; // 객체 생성시 카운드 증가
        dadWallet -= 1000; // 객체 생성시(딸 출생시) 1000원 지출
    }

    //    필요한 메소드
    public void watchTv() {
        System.out.println("티비를 봅니다.");
    }

//    getter and setter...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Daughter.count = count;
    }

    public static int getDadWallet() {
        return dadWallet;
    }

    public static void setDadWallet(int dadWallet) {
        Daughter.dadWallet = dadWallet;
    }

    //    toString 오버라이드
    @Override
    public String toString() {
        return "Daughter{" +
                "name='" + name + '\'' +
                ", gen=" + gen +
                '}';
    }
}

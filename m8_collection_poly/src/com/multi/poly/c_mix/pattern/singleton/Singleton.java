package com.multi.poly.c_mix.pattern.singleton;

public class Singleton {

    private static final Singleton singleton = new Singleton(); // 객체를 한번만 생성

    private Singleton(){

    } // 생성자를 private으로 생성

    public static Singleton getInstance() {
        return singleton;
    }
}

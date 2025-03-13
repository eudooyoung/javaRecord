package com.multi.poly.c_mix.pattern.singleton;

public class Singleton {

    private static final Singleton singleton = new Singleton();
//    객체를 한번만 생성
//    자기 자신을 참조타입으로하는 객체를 상수형으로 선언하고, 그 객체를 반환하는 getInstance 라는 메소드를 사용해 외부에서 항상 동일한 객체를 사용하도록 함

    private Singleton(){

    } // 생성자를 private으로 생성

    public static Singleton getInstance() {
        return singleton;
    }
}

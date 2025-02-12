package com.multi.b_classuse;

import com.multi.a_classmake.*;

public class MyRoom {

    public static void main(String[] args) {

        Phone p1 = new Phone(); // 객체 생성 (heap에 등록?)
//        p1.speaker = "애플"; // 스트링형식, 값을 지정: set
//        p1.size = 10; // int형식

        System.out.println(p1); // p1에 저장되어있는 주소값 출력
//        System.out.println(p1.size); 값을 얻어옴: get
//        System.out.println(p1.speaker);

        p1.setSize(15);
        p1.setSpeaker("애플");
        System.out.println(p1.getSize());
        System.out.println(p1.getSpeaker());

        p1.makeCall();
        p1.takePhoto();
        System.out.println();

        Phone p2 = new Phone(); // Phone 클래스의 또 다른 객체 생성
        p2.setSize(20);
        p2.setSpeaker("삼성");
        System.out.println();

        System.out.println(p2); // p1과 다른 주소 확인
        System.out.println(p2.getSize());
        System.out.println(p2.getSpeaker());

        Dog dog = new Dog();

        dog.setColor("검정");
        dog.setKind("누렁이");

        System.out.println(dog.getColor());
        System.out.println(dog.getKind());
        dog.bark();
        dog.wagTail();

        Tv tv1 = new Tv();
        tv1.on();
        tv1.setChannel("7번");
        tv1.setVolume(9);
        System.out.println(tv1.getChannel());
        System.out.println(tv1.getVolume());
        tv1.off();

        Tv tv2 = new Tv();

        tv2.on();
        tv2.setChannel("11번");
        tv2.setVolume(7);
        System.out.println(tv2.getChannel());
        System.out.println(tv2.getVolume());
        tv2.off();

        System.out.println(tv2); // toString 자동으로 불러옴
        System.out.println(tv2.toString());

        Calculator cal = new Calculator();
        cal.add();
        cal.minus();

        MethodPrinter m1 = new MethodPrinter();
        m1.methodA();


    }
}

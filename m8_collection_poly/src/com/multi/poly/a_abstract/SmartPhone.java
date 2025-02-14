package com.multi.poly.a_abstract;

public class SmartPhone extends Product{

//    추상 클래스가 가지는 추상 메소드를 반드시 구현해야 한다.
    @Override
    public void method3() {
        System.out.println("Product 클래스의 추상 메소드 구현");
    }

    public void method4() {
        System.out.println("SmartPhone 클래스의 일반 메소드 입니다");
    }
}

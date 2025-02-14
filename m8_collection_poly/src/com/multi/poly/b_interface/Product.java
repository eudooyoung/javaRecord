package com.multi.poly.b_interface;

public class Product implements InterProduct{ // 인터페이스 임플레먼트

    @Override
    public void method1() {
        System.out.println("InterProduct의 메소드 오버라이딩");
    }

//    인터페이스의 스테틱 메소드는 오버라이드 안됨
//    @Override
//    public static void staticMethod(){}

//    default 메소드는 인터페이스에서만 사용 가능
//    @Override
//    default void defaultMethod() {}

//    default 키워드 제거후 오버라이드 가능
    @Override
    public void defaultMethod() {
        System.out.println("Product가 디폴트 메소드 재정의의의의의의");
    }
}

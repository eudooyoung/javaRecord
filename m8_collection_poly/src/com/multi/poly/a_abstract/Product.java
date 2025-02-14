package com.multi.poly.a_abstract;

public abstract class Product {

    //

    private int nonStaticField;
    private static int staticField;

    //    생성자를 만들 수는 있지만, 객체 생성은 불가능
    public Product() {
    }

    public void method1() {
        System.out.println("일반 메소드입니다");
    }

    public static void method2() {
        System.out.println("스테틱 메소드입니다");
    }

//    추상 클래스: 블럭 없이, 구현체 없이 만듬. "public abstract" 생략 불가
//    추상 메소드가 한개라도 있다면 클래스에 abstract를 추가하여 추상 클래스로 만들어줘야 함
    public abstract void method3();
}

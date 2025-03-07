package com.multi.b_static;

public class StaticMethod {
    //    static 필드(클래스 변수)
    private static int num1 = 10; //private: 클래스 내부에서만 접근 가능
    private static int num2 = 10;

    public static int num = 30; // public: 외부에서 접근, 공유 가능

    public static void method1() {
        System.out.println(num1 + num2);
        num2++;
    }

    public static int method2() {
        return num1 + num2;
    }

    public static void method3(String name) {
        System.out.println("name: " + name);
    }

    public static String method4(String name) {
        return "name :" + name;
    }
}

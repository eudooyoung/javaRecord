package com.multi.a_classmake;

public class Calculator2 {

    public int add(int x, int y) {
//        x, y 파라미터, 지역변수, 매개변수
        //지역변수는 초기화를 해줘야하마, 그래서 값을 받아와서 사용
//        지역변수는 블럭 안에서만 사용 가능
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public double div(int x, int y) {
        return (double) x / y;
    }

//    오버로딩
    //같은 메소드의 시그니쳐(패러미터 자료형, 순서, 개수)을 변경하여 overloading 할 수 있다.
    //div(double x, double y)
    public double div(double x, double y) {
        return (double) x / y;
    }
}

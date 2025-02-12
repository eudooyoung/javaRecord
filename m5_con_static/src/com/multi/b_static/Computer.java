package com.multi.b_static;

public class Computer {
//    public int sum(int a, int b, int c)

//    public int sum(int 1, int b, int c, int d, int e)

//    가변 길이 매개 변수
//    **확인

    public int sum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}

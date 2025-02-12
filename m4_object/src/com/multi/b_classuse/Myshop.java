package com.multi.b_classuse;

import com.multi.a_classmake.Calculator;
import com.multi.a_classmake.Calculator2;

public class Myshop {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        Calculator2 cal2 = new Calculator2();

        System.out.println(cal2.add(2, 3));
        System.out.println(cal2.minus(2, 3));
        System.out.println(cal2.mul(2, 3));
        System.out.println(cal2.div(2, 3));
    }
}

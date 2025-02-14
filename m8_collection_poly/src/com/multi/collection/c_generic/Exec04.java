package com.multi.collection.c_generic;

import java.util.ArrayList;
import java.util.List;

public class Exec04 {
    public static void main(String[] args) {
        //<? super T> : T와 T의 상위 타입만 허용 (쓰기 가능)

        List<Integer> list1 = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();
        List<Double> list3 = new ArrayList<>();
        addNumber(list1);
        addNumber(list2);
//        addNumber(list3); double 형은 포함되지 않음


    }

//    리스트의 인티저, 넘버 타입만 허용하는 메소드
    public static void addNumber(List<? super Integer> list) { // integer포함, 상위클래스만 허용
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}

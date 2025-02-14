package com.multi.collection.c_generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Exec03 {
    public static void main(String[] args) {
        //<? extends T> : T와 T의 하위 타입만 허용 (읽기 전용)


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        printNum(integerList);
        printNum(doubleList);

        List<String> alist = new ArrayList<>();
        alist.add("아오");
        alist.add("아오진짜");

        printColl(alist);
    }

    public static void printNum(List<? extends Number> numbers) {
        for(Number n : numbers) {
            System.out.println(n);
        }
    }

//    문자열만 받을 수 있는 모든 컬렉션 타입을 허용하는 메소드
//    public static void printString(LinkedList<?> string) {
//        for(Object l : string) {
//            System.out.println(l);
//        }
//    }
    public static void printColl(Collection<String> str) {
        for(String c : str) {
            System.out.println(c);
        }
    }

}

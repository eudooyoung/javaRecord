package com.multi.collection.c_generic;

import java.util.ArrayList;
import java.util.List;

public class Exec02 {
    public static void main(String[] args) {
        //<?> : 와일드카드, 모든 타입을 허용


        List<Integer> list1 = new ArrayList<>(); // ArrayList 형식으로 만듬
        list1.add(33);
        list1.add(22);

        List<String> list2 = new ArrayList<>(); // ArrayList 형식으로 만듬
        list2.add("제니");
        list2.add("리사");

        printList(list1);
        printList(list2);

    }

    public static void printList(List<?> list) {  // 리스트 형식의 모든타입
        for(Object o : list) {
            System.out.println(o);
        }
    }
}

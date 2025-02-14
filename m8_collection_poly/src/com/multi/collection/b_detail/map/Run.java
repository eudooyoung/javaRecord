package com.multi.collection.b_detail.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Run {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>(); // 제네릭 두개, 키와 밸류
//        키 기준으로 정렬

        treeMap.put("a", 10);
        treeMap.put("b", 20);
        treeMap.put("e", 30);
        treeMap.put("c", 40);
        treeMap.put("g", 50);
        treeMap.put("d", 60);
        treeMap.put("f", 70);

        Set<Map.Entry<String,Integer>> entrySet = treeMap.entrySet(); // 확인

        for(Map.Entry<String,Integer> e : entrySet) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}

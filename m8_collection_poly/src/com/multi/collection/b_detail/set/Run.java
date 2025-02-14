package com.multi.collection.b_detail.set;

import java.util.TreeSet;

public class Run {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>(); // 인티저타입만 받는 컬렉션
//        트리셋은 자동으로 오름차순으로 정렬 해준다.


        scores.add(35);
        scores.add(353);
        scores.add(112);
        scores.add(335);
        scores.add(66);

        for(Integer i : scores) {
            System.out.println(i);
        }

        //특정 Integer 객체를 가져오기
        System.out.println("가장 낮은 점수: " + scores.first());
        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래 점수: " + scores.lower(95)); // 바로 아래?
        System.out.println("95점 위의 점수: " + scores.higher(95)); // 바로 위?
        System.out.println("95점 이거나 바로 아래 점수: " + scores.floor(95));
        System.out.println("85점 이거나 바로 위의 점수: " + scores.ceiling(85) + "\n");
    }
}

package com.multi.c_practice;

public class Ex03 {
    public static void main(String[] args) {
//        1.
        int[] box1 = new int[5]; //int형 배열, 크기 5
        for (int i = 0; i < box1.length; i++) {
            box1[i] = (i + 1) * 10; //(배열의 index + 1) * 10을 한 값을 차례대로 배열에 저장
        }
        int result = box1[0] + box1[3]; //배열의 첫번째 값과 두번째 값을 더함
        System.out.println(result);
//        2.
        String[] box2 = new String[3]; //String형 배열, 크기 3
        for (int i = 0; i < box2.length; i++) {
            box2[i] = (i == 0) ? "자바" : //자바, 스프링, JSP를 순서대로 배열에 저장
                    (i == 1) ? "스프링" : "JSP";
        }
        System.out.printf("%s 보다는 %s", box2[0], box2[1]); //printf를 사용해 원하는 모양의 문장 출력
    }
}

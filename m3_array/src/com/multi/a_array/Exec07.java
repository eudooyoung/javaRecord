package com.multi.a_array;

public class Exec07 {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null;
//      null 포인트 익셉션 찾아보기
//        System.out.println(hobby.length()); //null 포인트 에러: java.lang.NullPointerException: Cannot invoke "String.length()" because "hobby" is null

        int[] intArray = null; //주소값 heap에 할당 받은 주소값과 데이터와의 연결이 끊어짐
//        intArray[0] = 10; // null: java.lang.NullPointerException: Cannot invoke "String.length()" because "hobby" is null

        String test = "자동차";
        String test1 = test;
        test = null;
        System.out.println(test);
    }
}

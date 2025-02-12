package com.multi.c_operator;

public class Exex02 {
    public static void main(String[] args) {
//        비교 연산자 --> 결과가 boolean (논리형)

//        비교연산자(==, !=, >, >=)
//        *** 비교 결과가 중요(논리형 데이터!! true/false)
//          - ‘==‘과 ‘!=‘은 모든 자료형에 사용 가능
//          - ‘==‘과 ‘!=‘을 제외한 비교 연산자(>, >=, <, <=)는 기본형 boolean과 참조형(String)을 제외하고 나머지 자료형에 모두 사용 가능

        int x = 200;
        int y = 100;
        System.out.println("일치? " + (x == y));
        System.out.println("불일치? " + (x != y));
        System.out.println("이상? " + (x >= y));
        System.out.println("초과? " + (x > y));

        String a = "이효리"; // 리터럴(=값): String pool 영역에 저장, 같은 문자열이 있는 경우 기존 객체 참조
        String b = "유재석";

        String c = new String("이효리"); //새로운 객체를 생성
        String d = "이효리";

        System.out.println(a.hashCode()); // 문자열의 내용이 같다면 해시코드가 동일하게 저장됨
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

        System.out.println();

        System.out.println("a 가 저장된 해시코드: " + System.identityHashCode(a)); // 실제 메모리 주소 출력
        System.out.println("b 가 저장된 해시코드: " + System.identityHashCode(b));
        System.out.println("c 가 저장된 해시코드: " + System.identityHashCode(c));
        System.out.println("d 가 저장된 해시코드: " + System.identityHashCode(d));

//        a와 d는 같은 해시코드
//        c는 다른 해시코드

        System.out.println();

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);

        System.out.println();

        System.out.println(a.equals(c)); // 실제 메모리 주소는 다르지만, 저장된 문자열이 같으므로 a 와 c 를 같은 값으로 인식
        System.out.println(a.equals(d));
    }
}

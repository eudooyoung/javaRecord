package com.multi.b_variable;

/**
 * 변수의 선언 (저장할 값을 기록하기 위한 변수를 메모리 공간에 확보해놓는 과정) == 변수(박스)
 * [표현법] 자료형 변수명;
 * <p>
 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 대해 변수(박스)의 크기 및 모양을 정하는 부분
 * 변수명 : 변수(박스)의 이름을 정하는 부분 (의미부여) -> 여기서 지정한 이름으로 앞으로 호출
 * <p>
 * 주의할점
 * - 변수명은 반드시 첫 문자가 소문자여야된다.
 * - 하지만 여러단어로 엮어 있는경우 연결되는 단어의 첫글자는 대문자
 * - 동일한 변수명으로 선언 불가
 * - 해당 영역({})에 선언한 변수는 해당 지역 안에서만 꺼내 쓸수 있다. (다른 메소드에서는 사용 불가)
 * == 지역변수 개념
 */
public class Exec01 {
    public static void main(String[] args) {

//        1. 값의 의미 부여
        int salary = 1000000;
        int bonus = 2000;

        System.out.println("급여와 보너스의 합: " + (salary + bonus));

//        1 ~ 5 번 고객에게 포인트를 지급

        int point = 3000;

        System.out.println("1번 포인트: " + point);
        System.out.println("2번 포인트: " + point);
        System.out.println("3번 포인트: " + point);
        System.out.println("4번 포인트: " + point);
        System.out.println("5번 포인트: " + point);

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " 번 포인트: " + point);
        }

        int sum = 0;
        sum += 10;

        System.out.println(sum);
    }
}

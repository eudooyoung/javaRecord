package com.multi.collection.c_generic;

public class Exec01 {
    public static void main(String[] args) {
        /* 제네릭(generic) */
        /* 제네릭의 사전적인 의미는 일반적인 이라는 의미이다.
         * 자바에서 제네릭이란 데이터의 타입을 **일반화**한다는 의미를 가진다.
         *
         * 제네릭은 **클래스나 메소드**에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법을 말한다.
         * 컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있으며,
         * (잘못된 타입인 경우 컴파일 에러를 발생시킴)
         * 반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다.
         * (instanceof 비교 및 다운캐스팅 작성 불필요)
         *
         * JDK 1.5 버전부터 추가된 문법이다.
         *
         * 제네릭 프로그래밍
         * 데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술에 중점을 두어
         * 재사용성을 높일 수 있는 프로그래밍 방식이다.
         * */

        GenericTest gt = new GenericTest();
        gt.setValue(1);
        System.out.println(gt.getValue().getClass().getSimpleName());
//        출력 결과: Integer
//        1을 자동으로 boxing 하여 GenericTest 에서 객체 형식으로 선언된 value 에
//        객체 형식으로 넣어줌
        gt.setValue("test");
        System.out.println(gt.getValue().getClass().getSimpleName());


        System.out.println(gt.getValue());

        GenericTest<Integer> gt2 = new GenericTest<>();
//        gt2.setValue("test"); 문자열은 컴파일 에러
        gt2.setValue(1231415);

        System.out.println(gt2.getValue());

        GenericTest<String> gt3 = new GenericTest<>();
        gt3.setValue("제니");
        GenericTest<String> gt4 = new GenericTest<>();
        gt4.setValue("제니");
        gt3.compare(gt4);
        boolean result2 = gt3.compare(gt);
        System.out.println(result2);

        boolean result = gt3.compare(gt4);
        System.out.println(result);


    }
}

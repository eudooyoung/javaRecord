package com.multi.b_variable;

public class Exec06 {
    public static void main(String[] args) {
        /* Wrapper 클래스 */
        /* 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
         * 이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
         * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스 (Wrapper class)
         * 라고 한다. (주방에서 사용하는 랩(Wrap)과 같은 의미로 감싼다는 의미이다.)
         * */

        /* 기본타입              래퍼클래스
         * byte          Byte
         * short         Short
         * int           Integer
         * long          Long
         * float         Float
         * double        Double
         * char          Character
         * boolean       Boolean
         * */

        /* 박싱(Boxing)과 언박싱(UnBoxing)
         * 기본타입을 래퍼클래스의 인스턴스(객체)로 인스턴스(객체)화 하는 것을 박싱(Boxing)이라고 하며,
         * 래퍼클래스 타입의 인스턴스(객체)를 기본 타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
         * */

//        문자열 -> 숫자
        int value1 = Integer.parseInt("10");
        System.out.println(value1);

        double value2 = Double.parseDouble("10.10");
        System.out.println(value2);

//        숫자 -> 문자열
        System.out.println();
        String str1 = String.valueOf(10);
        String str1_1 = "10";
        System.out.println(str1);
        System.out.println(str1_1);

        String str2 = String.valueOf(3.14);
        System.out.println(str2);

        String str3 = String.valueOf(false);
        System.out.println(str3);
        System.out.println(str3.getClass()); // 출력결과: class java.lang.String

//        boxing
        System.out.println();
        Integer objLegacy = new Integer(100); // 오류는 나지 않으나 지금은 사용하지 않는 방식
        System.out.println(objLegacy);
        Integer obj = 100; // 지금 사용되는 방식

        int test = 256;
        Integer obj2 = test; // 이런식으로 기본형 자료를 바로 넘겨주는 것도 가능
        System.out.println(obj2);
        System.out.println(obj); // obj
        System.out.println(obj.getClass()); // 출력 결과: class java.lang.Integer

//        unboxing
        System.out.println();
        int result = obj +100;
        int result2_1 = obj2.intValue(); // obj2 객체를 사용하여 값을 가져올수도 있지만,
        int result2 = obj2; // 인트형으로 선언한 변수에 바로 넣어줘도 됨

        System.out.println(result2_1);
        System.out.println(result2);
        System.out.println(result);
    }
}

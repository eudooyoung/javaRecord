package com.multi.c_operator;

public class Exex05 {
    public static void main(String[] args) {
//        삼항연산자

        int num1 = 15;
        int num2 = -20;

        String checkNum1 = (num1 >= 0) ? "true" : "false"; // 삼항연산자: (조건) ? 조건이 참일 경우 유효한 값 : 조건이 거짓일 경우 유효한 값
                                                            // 여기서는 num1이 0이거나 0보다 크면 checkNum1에 "true"라는 문자열을 저장, 거짓이면 "false"라는 문자열을 저장하겠다는 뜻
        System.out.println(checkNum1);
        System.out.println(checkNum1.getClass());

        boolean isPositive = (num1 >= 0) ? true : false;
        Boolean isPositiveClass = isPositive;
        System.out.println(isPositiveClass.getClass());
        System.out.println(isPositiveClass);

        boolean isNagative = (num2 < 0) ? true : false;
        System.out.println(isNagative);


//------------------------------------------------------------------

        System.out.println();
        int num3 = 0;

//        삼항연산자에서 조건을 연속으로 붙여서 쓸 수 있다.
        String checkNum3 = (num3 > 0) ? "양수" : (num3 == 0) ? "0 입니다" : "음수입니다"; // 첫번째 조건: num3 > 0 을 검사후 조건이 참이면 "양수"라는 문자열을 checkNum3에 저장.
                                                                // 첫번재 조건이 거짓일 경우, 두번째 조건: num3 == 0을 검사후 참이면 "0 입니다", 거짓이면 "음수입니다"라는 문자열을 저장.
                                                                // if else... 문과 같은 형식.
        System.out.println(checkNum3);

        int num4 = -3;
        String checkNum4 = (num4 > 0) ? "첫번째 검사 결과 참" : (num4 == 0) ? "두번째 검사 결과 참" : "두번째 검사 결과 거짓";
        System.out.println(checkNum4);

    }
}

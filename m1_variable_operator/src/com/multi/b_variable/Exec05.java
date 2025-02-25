package com.multi.b_variable;

public class Exec05 {
    public static void main(String[] args) {
// 형변환 : 값의 자료형을 바꾸는 것
        /*
         *  * 컴퓨터에서의 값 처리 규칙 (즉, 형 변환이 필요한 상황)
         *  1. 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야된다.
         *  --> 즉, 같은 자료형에 해당하는 값만 대입이 가능하다. 다른 자료형의 값을 대입하고자 한다면 형변환이 필수
         *      자료형 변수명 = (자료형)값;
         *
         *  2. 같은 자료형끼리만 계산이 가능 --> 계산 결과도 같은 자료형으로 나옴!
         *     값 + 값       => 두 값이 같은 자료형이여야됨!
         *
         *  * 형 변환의 종류
         *  1. 자동(묵시적)형변환   --> 자동으로 형변환이 이루어져 우리가 형변환을 시켜줄 필요 없다.
         *
         *  2. 강제(명시적) 형변환 --> 자동으로 형변환이 안되서 우리가 직접 형변환을 해줘야됨
         *
         *     [표현법] (바꿀자료형)값
         *
         *     (바꿀자료형) 을 cast연산자 즉, 형변환 연산자라고 함
         *
         *  * 주의사항
         *  boolean은 형변환이 불가하다 오직 true, false의 값만을 가질 수 있다.
         *
         */

        byte x1 = 100;
        int y1 = x1; // 자동, 묵시적 형변환
        System.out.println(y1);


        int x2 = 300;
//      byte y2 = x2; 큰 데이터타입을 더 작은 데이터 타입으로 형변환 불가

        byte y2 = (byte) x2; // 강제, 명시적 형변환
        System.out.println(y2); // 데이터 손실(300-256(128*2))로 인해 44출력, 오버플로우

        double x3 = 400.4;
        int y3 = (int) x3;
        System.out.println(y3); // 400출력

        double x4 = y3; // 자동 형변환
        System.out.println(x4); //400.0출력

        System.out.println();

//      오버 플로우: 자료형의 최대값을 벗어나는 현상
        byte maxbyte = 127;
        System.out.println(++maxbyte); // 한바퀴 돌아서 -128 출력
//      언더 플로우 자료형의 최소값을 벗어나는 현상
        byte minbyte = -128;
        System.out.println(--minbyte); // 반대로 돌아서 127 출력


        double large = Double.MAX_VALUE;
        System.out.println(large * 2);  // 출력: Infinity

        double small = Double.MIN_VALUE;
        System.out.println(small / 2);  // 출력: 0.0

        /*
         * int형 리터럴로 초기화가 가능한 자료형
         * byte, short, char, int
         * -> 1) 초기화 시 입력 값을 int형 리터럴로 인식하지 않고 그냥 정수로 인식
         *    2) 컴파일러가 저장하려는 자료형의 값의 범위와 일치하는지 검사하여
         *       일치하면 입력값을 저장하려는 자료형으로 변환하여 저장
         *    3) 값의 범위가 일치하지 않으면 에러 발생
         *
         * -> 초기화 된 이후 위 자료형들의 연산 시 무조건 int형으로 처리
         */
        System.out.println();
        byte byteNum1 = 10;
        byte byteNum2 = 20;

        byte result = (byte) (byteNum1 + byteNum2);
        System.out.println(result);


        char val1 = 'A';
        char val2 = 1;

        System.out.println();
        int result1 = val1 + val2;
        System.out.println(result1); // int 자료형(66)으로 출력
        System.out.println((char) result1); //char 자료형(B)로 출력
    }
}

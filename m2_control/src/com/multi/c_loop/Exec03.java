package com.multi.c_loop;

import java.util.Random;

public class Exec03 {
    public static void main(String[] args) {
        /* java.util.Random 클래스 */
        /* java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
         * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환 */

        /* 원하는 범위의 난수를 구하는 공식
         * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         *
         * 난수 생성식 구조:
         * random.nextInt(생성 가능한 난수의 총 갯수) + 구하려는 난수의 최소값
         *
         * */
        Random random = new Random();
//        0부터 10까지 중에 난수 생성
        int num1 = random.nextInt(10);
        System.out.println(num1);

//        1부터 10까지 중에 난수 생성
        int num2 = random.nextInt(9) + 1;
        System.out.println(num2);

//        20부터 45중에 난수 생성
        int num3 = random.nextInt(26) + 20;
        System.out.println(num3);

//        -128부터 127 중에 난수 생성(byte)
        int num4 = random.nextInt(256) - 128;
        System.out.println(num4);

        /* 난수의 활용 */
        /* Math.random()을 이용해 발생한 난수는 0부터 1사이의 실수 범위의 난수값을 반환한다.*/


        /* 원하는 범위의 난수를 구하는 공식
         * (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
         * 0.0 ~ 0.999999999
         * 0 ~ 9.999999999
         * 0 ~ 9
         * */

        int num5 = (int)(Math.random() * 10);
        System.out.println(num5);

//        1 ~10
        int num6 = (int)(Math.random() * 10);
        System.out.println(num6);

//        10 ~15
        int num7 = (int)(Math.random() * 6) + 10;
        System.out.println(num7);

//        -128 ~ 127
        int num8 = (int)(Math.random() * 256) - 128;
        System.out.println(num8);

    }
}

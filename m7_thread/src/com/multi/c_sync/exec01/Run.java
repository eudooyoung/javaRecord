package com.multi.c_sync.exec01;

public class Run {
    public static void main(String[] args) throws InterruptedException {

        // 동기화: 여러 작업을 순서 대로 처리. 속도 느림, 정확도 높음
        // 비동기화: 여러 작업을 동시에 처리하는 방식. 속도 빠름, 정확도 낮음

//        Count count = new Count();
//
//        Thread t1 = new Thread(() -> {
//            for(int i = 0; i < 100000; i++) {
//                count.increment();
//            }
//
//        });
//
//        Thread t2 = new Thread(() -> {
//            for(int i = 0; i < 100000; i++) {
//                count.increment();
//            }
//
//        });// Thread안에 run을 구현해야함

//        t1.start();
//        t2.start();
//
//        t1.join(); //throws InterruptedException at method signature
//        t2.join(); // t1, t2가 끝날때까지 main method 대기

//        System.out.println(count.getCount());

        CountSync count = new CountSync();

        Thread t1 = new Thread(() -> { // 스레드 객체 생성하면서 내부 메소드 정의
            for(int i = 0; i < 100000; i++) {
                count.increment();
            }

        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 100000; i++) {
                count.increment();
            }

        });// Thread안에 run을 구현해야함

        t1.start();
        t2.start();

        t1.join(); //throws InterruptedException at method signature
        t2.join(); // t1, t2가 끝날때까지 main method 대기

        System.out.println(count.getCount());
    }
}

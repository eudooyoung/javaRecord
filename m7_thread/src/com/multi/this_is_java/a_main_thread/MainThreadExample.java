package com.multi.this_is_java.a_main_thread;

public class MainThreadExample {
    public static void main(String[] args) {
        System.out.println("시작");

        Thread currThread = Thread.currentThread(); // 현재 스레드의 객체를 리턴하는 메소드
        System.out.println(currThread.getName());

        System.out.println("종료");
    }
}

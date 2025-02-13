package com.multi.a_thread.thread;

public class Thread1 extends Thread {

//    Thread클래스를 상속 받아서 사용하는 방식
    @Override
    public void run() { // run 재정의
        for (int i = 1; i <= 10; i++) {
            System.out.println("스레드 1 [ " + i + " ]");
        }
    }
}

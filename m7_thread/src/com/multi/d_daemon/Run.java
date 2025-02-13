package com.multi.d_daemon;

public class Run {
    public static void main(String[] args) throws InterruptedException {

        AutoSaveThread autoSaveThread = new AutoSaveThread();

        autoSaveThread.setDaemon(true);
//        데몬스레드로 지정: setDaemon(true);

        autoSaveThread.start(); //데몬 스레드는 메인 스레드가 종료되면 같이 종료된다.

        Thread.sleep(10000);

        System.out.println("메인스레드 종료 ");
    }
}

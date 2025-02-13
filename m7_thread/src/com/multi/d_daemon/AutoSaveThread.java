package com.multi.d_daemon;

public class AutoSaveThread extends Thread {

    public void save() {
        System.out.println("자동 저장 되었습니다.");
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                break;
            }
            save();
        }
    }
}

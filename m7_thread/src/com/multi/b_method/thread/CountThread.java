package com.multi.b_method.thread;

public class CountThread extends Thread {

    @Override // generate 에서 override 해서 가져옴
    public void run() {
        for (int i = 20; i >= 0; i--) {
            System.out.println("카운트 " + i);
            try {
                Thread.sleep(1000); // 1000 == 1초, throw interruptedException: 프로그래이 무한 지연 될 수있기 때문에 발생하는 예외
            } catch (InterruptedException e) { // 에러의 정보가 e에 들어가 있음
                i = -1;
            throw new RuntimeException(e);
//                e.printStackTrace(); //에러메세지 확인?
            }
        }
    }


}

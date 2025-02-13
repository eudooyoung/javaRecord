package com.multi.b_method.thread;

public class ImageThread extends Thread {
    @Override
    public void run() {
        String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"}; // 배열 생성

        for (int i = 0; i < list.length; i++) {
            System.out.println("이미지 ===>" + list[i]);

            try {
                Thread.sleep(3000); // 1000 == 1초, throw interruptedException: 프로그래이 무한 지연 될 수있기 때문에 발생하는 예외
            } catch (InterruptedException e) { // 에러의 정보가 e에 들어가 있음
//                i = -1;
                throw new RuntimeException(e);
//                e.printStackTrace(); //에러메세지 확인?
            }
        }
    }
}

package com.multi.b_method.thread;

import java.util.Date;

public class TimeThread extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 500 ; i++){

            Date date = new Date(); // Date import;
            System.out.println("시각 >> "+date);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { //
                e.printStackTrace();
            }


        }




    }
}

package com.multi.e_exception.b_custom;

public class Run {
    public static void main(String[] args) {

        Account acnt = new Account();
        acnt.deposit(10000);
//        try {
//            acnt.withdraw(10001);
//        } catch (AccountCheckedException e) {
//            throw new RuntimeException(e); // main으로 던지고 main이 jvm으로 던짐
//        }

        try{
            acnt.withdraw(30000);
        } catch (AccountRuntimeCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료...");
    }
}

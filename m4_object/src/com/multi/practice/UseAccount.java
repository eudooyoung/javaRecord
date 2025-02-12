package com.multi.practice;

public class UseAccount {
    public static void main(String[] args) {
        Account acnt1 = new Account();
        acnt1.setUserName("나리");
        acnt1.setAccountName("월급");
        acnt1.setBalance(4000);

        Account acnt2 = new Account();
        acnt2.setUserName("구다");
        acnt2.setAccountName("저축");
        acnt2.setBalance(80050);

        Account acnt3 = new Account();
        acnt3.setUserName("동자");
        acnt3.setAccountName("비상금");
        acnt3.setBalance(1354795);

        System.out.println("사용자 이름: " + acnt1.getUserName());
        System.out.println("통장 이름: " + acnt1.getAccountName());
        System.out.println("현재 잔액: " + acnt1.getBalance() + " 원");
        System.out.println("--------------------");

        System.out.println("사용자 이름: " + acnt2.getUserName());
        System.out.println("통장 이름: " + acnt2.getAccountName());
        System.out.println("현재 잔액: " + acnt2.getBalance() + " 원");
        System.out.println("--------------------");

        System.out.println("사용자 이름: " + acnt3.getUserName());
        System.out.println("통장 이름: " + acnt3.getAccountName());
        System.out.println("현재 잔액: " + acnt3.getBalance() + " 원");
        System.out.println("--------------------");

        acnt1.nameDeposit(acnt1.getUserName(), acnt1.getAccountName(), 11550);
        acnt1.deposit(acnt1.getUserName(), 1);
        acnt1.withdraw(1131);
        System.out.println("--------------------");

        acnt2.nameDeposit(acnt2.getUserName(), acnt2.getAccountName(), -15550); // 음수 값을 예금 시도할 경우 "다시 입력하세요" 출력
        acnt2.deposit(acnt2.getUserName(), -135135); // 음수 값을 예금 시도할 경우 "다시 입력하세요" 출력
        acnt2.withdraw(15331);
        System.out.println("--------------------");

        acnt3.nameDeposit(acnt3.getUserName(), acnt3.getAccountName(), 11550);
        acnt3.deposit(acnt3.getUserName(), 1);
        acnt3.withdraw(15331533); // 현재 잔액 보다 큰 금액을 출금 시도할 경우. "금액이 부족합니다" 출력 후 현재 잔액 출력

        System.out.println("--------------------");

    }
}

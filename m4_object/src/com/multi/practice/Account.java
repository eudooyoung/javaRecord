package com.multi.practice;

public class Account {
    private String userName; // 사용자 초기화
    private String accountName; // 통장 이름 초기화
    private int balance; // 잔액 초기화

    public String getUserName() { // 사용자 이름 반환
        return userName;
    }

    public void setUserName(String userName) { // 사용자 이름 등록
        this.userName = userName;
    }

    public String getAccountName() { // 통장 이름 반환
        return accountName;
    }

    public void setAccountName(String accountName) { // 통장 이름 등록
        this.accountName = accountName;
    }

    public int getBalance() { // 잔액 반환
        return balance;
    }

    public void setBalance(int balance) { //잔액 설정
        this.balance = balance;
    }

    //    사용자이름, 통장 이름을 표시하는 예금 메소드
//    사용자, 통장이름은 생성된 객체에서 가져오고, 추가 예금액만 새로 받아옴
    public void nameDeposit(String userName, String accountName, int deposit) {
        if (deposit <= 0) { // 예금액이 0원 이하일 경우
            System.out.println("다시 입력하세요.");
        } else {
            this.balance += deposit; // 현재 잔액을 예금액을 더한 값으로 갱신
            System.out.printf("%s 님의 %s 통장에 %d 원을 입금합니다.\n", userName, accountName, deposit);
            System.out.println("현재 잔액: " + this.balance + " 원"); // 갱신된 현재 잔액 출력
        }
    }

    //    사용자 이름만 표시하는 예금 메소드
//    사용자 이름은 생성된 객체에서 가져오고, 추가 예금액만 새로 받아옴
    public void deposit(String userName, int deposit) {
        if (deposit <= 0) { // 예금액이 0원 이하일 경우
            System.out.println("다시 입력하세요.");
        } else {
            this.balance += deposit; // 현재 잔액을 예금액을 더한 값으로 갱신
            System.out.printf("%s 님의 통장에 %d 원을 입금합니다.\n", userName, deposit);
            System.out.println("현재 잔액: " + this.balance + " 원"); // 갱신된 현재 잔액 출력
        }
    }

    //    출금 메소드
    public void withdraw(int withdraw) {
        if (withdraw > this.balance) { // 출금액이 현재 잔액보다 클 경우 출금을 진행하지 않음.
            System.out.println("금액이 부족합니다. (현재 잔액: " + this.balance + " 원)");
        } else {
            this.balance -= withdraw;  // 출금액이 현재 잔액보다 작을 경우, 현재 잔액을 출금액을 뺀 값으로 갱신
            System.out.printf("%d 원을 출금 합니다.\n현재 잔액: %d\n", withdraw, this.balance); // 출금액과 현재 잔액 출력
        }
    }
}

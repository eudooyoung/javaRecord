package com.multi.e_exception.b_custom;



public class Account {

    private long balance;

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

//    public void withdraw (int money) throws AccountCheckedException {
//        if(balance < money) {
//            throw new AccountCheckedException("잔고 부족: " + (money-balance) + " 원 부족");
//        }
//        balance -= money;
//    }

    public void withdraw (int money) {
        if(balance < money) {
            throw new AccountRuntimeCheckedException("잔고 부족: " + (money-balance) + " 원 부족");
        }
        balance -= money;
    }
}

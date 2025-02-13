package com.multi.e_exception.b_custom;

public class AccountCheckedException extends Exception{ // Exception 클래스를 상속하는 사용자 Exception
    public AccountCheckedException() {}

    public AccountCheckedException(String message) { // Exception message 확인
        super(message);
    }
}

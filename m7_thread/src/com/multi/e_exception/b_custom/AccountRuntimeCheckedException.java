package com.multi.e_exception.b_custom;

public class AccountRuntimeCheckedException extends RuntimeException{
    public AccountRuntimeCheckedException() {}

    public AccountRuntimeCheckedException(String message) {
        super(message);
    }
}

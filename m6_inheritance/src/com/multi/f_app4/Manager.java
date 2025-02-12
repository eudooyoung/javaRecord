package com.multi.f_app4;

public non-sealed class Manager extends Person{ // 다른 클래스가 상속 받을 수 있도록 seald를 풀어줌
//                                                 sealed 클래스의 하위 클래스에 non-sealed 키워드를 붙이면, 그 클래스는 다시 상속이 가능

    @Override
    public void work() {
        System.out.println("생산을 관리합니다.");
    }
}

package com.multi.f_app4;

public final class Employee extends Person { //final: 해당 클래스는 더이상 상속될 수 없음

    @Override
    public void work() {
        System.out.println("제품을 생산합니다.");
    }
}

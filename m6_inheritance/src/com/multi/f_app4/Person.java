package com.multi.f_app4;

public sealed class Person permits Employee, Manager { //sealed 키워드: 허용된 클래스만 상속 가능
    //클래스를 sealed로 선언하면, 특정한 하위 클래스만 상속할 수 있도록 제한

    //필드
    private String name;

    //메소드
    public void work() {
        System.out.println("하는 일이 결정되지 않았습니다.");
    }
}

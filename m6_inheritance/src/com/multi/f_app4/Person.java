package com.multi.f_app4;

public sealed class Person permits Employee, Manager { //sealed 키워드: 허용된 클래스만 상속 가능
    //클래스를 sealed로 선언하면, 특정한 하위 클래스만 상속할 수 있도록 제한
//    부모클래스에 sealed 키워드가 있으면, 자식클래스는 자신의 sealed 여부를 반드시 명시해야 한다
//    sealed, non-sealed, final
//    sealed: permits 한 또 다른 자식 클래스가 필요하고, 그 클래스가 본 클래스(첫번째 자식 클래스)를 상속 해야 함
//    non-sealed: sealed 키워드를 해제 하여 일반 클래스처럼 상속 받을 수 있음
//    final: 더이상 클래스를 상속이 불가능하게 만듬

    //필드
    private String name;

    //메소드
    public void work() {
        System.out.println("하는 일이 결정되지 않았습니다.");
    }
}

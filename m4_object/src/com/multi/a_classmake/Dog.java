package com.multi.a_classmake;

public class Dog {
    // 강아지 색, 종류

    //    멤버 변수( 초기화 null)
    private String color;
    private String kind;

    //    멤버 메소드
    public void bark() {
        System.out.println("멍"); // 메소드 호출시 바로 출력
    }

    public void wagTail() {
        System.out.println("꼬리를 흔듬"); // 메소드 호출시 바로 출력
    }

    public void setColor (String color) {
        this.color = color; // 메소드 호출시 패러미터로 받아온 값을 현재 클래스의 멤버 변수에 저장
    }

    public void setKind (String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return this.color; // 현재 클래스에 저장되어 있는 private String color의 값을 반환
    }

    public String getKind() {
        return this.kind;
    }

}

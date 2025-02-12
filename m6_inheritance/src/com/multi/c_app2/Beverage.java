package com.multi.c_app2;

public class Beverage extends MenuItem { // 메뉴아이템 상속 받음

    private boolean isHot;


    public Beverage(String name, int price, boolean isHot) {
//        부모클래스의 기본 생성자를 호출하나 만약에 부모 클래스에 기본생성자가 없으면 에러
        super(name, price);
        this.isHot = isHot; // 부모 생성자를 가져온 후, isHot 정의?
    }

    public void describe() {
        System.out.println("이 음료는 " + (isHot ? "뜨겁습니다." : "차갑습니다."));
    }
}

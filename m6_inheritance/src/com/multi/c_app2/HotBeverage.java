package com.multi.c_app2;

public class HotBeverage extends Beverage{

    public HotBeverage(String name, int price) {
        super(name, price, true); // isHot 항상 true로
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("HotBeverage 제공");
    }
}

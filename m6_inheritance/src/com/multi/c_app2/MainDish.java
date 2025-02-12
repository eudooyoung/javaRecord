package com.multi.c_app2;

public class MainDish extends Food{

    private String foodType;

    public MainDish(String name, int price) { // foodType을 굳이 받아오지 않아도 됨
        super(name, price, "Main");
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "MainDish{} " + super.toString();
    }
}

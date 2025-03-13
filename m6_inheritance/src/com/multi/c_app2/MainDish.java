package com.multi.c_app2;

public class MainDish extends Food{

    private String mainDishType;

    public MainDish(String name, int price, String mainDishType) { // foodType을 굳이 받아오지 않아도 됨
        super(name, price, "Main");
        this.mainDishType = mainDishType;
    }

    @Override
    public String toString() {
        return "MainDish{" +
                "mainDishType='" + mainDishType + '\'' +
                "} " + super.toString();
    }
}

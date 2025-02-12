package com.multi.c_app2;

public class MenuItem {

    private String name; // '-'표시 private
    private int price; // '-'표시

    public MenuItem(String name, int price) { // 생성자
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() { // 저장된 필드 값을 배열 형식으로 출력
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}

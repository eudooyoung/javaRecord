package com.multi.d_app.controller;

import com.multi.d_app.model.dto.Product;

public class ProductController {
    private Product pro = null; //Product 클래스의 객체를 하나 만들고 이름을 pro로 둔다. 초기값은 null로 저장
//                              필드 멤버로 객체를 생성
//                              null로 두는 이유는 객체 멤버를 초기화 하는 방법인듯?

    public void insertProduct(String name, String brand, int price) {
//        insertProduct 메소드는 ProductMenu 클래스의 mainMenu 메소드 안에서 호출된다
//        mainMenu 메소드가 스캐너로 입력 받은 값을 insertProduct 메소드의 매개 변수로 받아온다.
//        받아온 매개 변수를, 앞서 필드로 생성한 pro객체의 생성자 매개 변수로 다시 넘겨준다.
        pro = new Product(name, brand, price);
    }

    public Product selectProduct() {
        return pro;
    }

    public void updatePrice(int newPrice) {
        pro.setPrice(newPrice);
    }
}

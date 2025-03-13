package com.multi.a_constructor;

public class Account {

    private String name;
    private int money;
    private String field;


    public Account() {} // 기본 생성자: 매개변수가 없는 생성자, 객체 생성만 할 때 사용됨.
//                                  다른 매개변수가 있는 생성자가 없을 때는 생략 가능, (묵시적으로 jvm이 생성)

//    매개 변수가 있는 생성자: 필요시 사용자가 만들어야 함. public 클래스명(매개변수) {}
//                                                              this.필드명 = 매개변수
//    객체 생성과 동시에 초기화가 필요할 때 사용
//    this => 인스턴스(생성된 객체)의 주소값을 가르킴

//    생성자 오버로딩=============
//     이름 생성자
    public Account(String name) { // 이름을 초기 설정하는 생성자;
        this.name = name;
    }

//    이름, 잔액 생성자
    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }

//    이름, 계좌 종류 생성자
    public Account(String name, String field) {
        this.name = name;
        this.field = field;
    }

//    이름, 계좌종류, 잔액 생성자
    public Account(String name, String field, int money) {
//        this.name = name;
//        this.field = field;
//        this.money = money;
        this(name, field); // this()생성자를 호출해서 사용 this(name, field) == Account(String name, String field)
//                              이미 생성된 생성자(바로 위)를 불러옴.
//                              반드시 첫 줄에, 단 한번만 호출.
        this.money = money;
    }

//    toString 오버라이딩
    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", field='" + field + '\'' +
                '}';
    }
}

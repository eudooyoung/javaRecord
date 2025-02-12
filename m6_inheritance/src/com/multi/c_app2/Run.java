package com.multi.c_app2;

public class Run {
    public static void main(String[] args) {

        HotBeverage coffee = new HotBeverage("뜨아", 4000);
        System.out.println(coffee);
        coffee.describe();

        System.out.println("----------------------------------------");

        ColdBeverage lemonade = new ColdBeverage("레몬에이드", 4500, 2, false);
        System.out.println(lemonade);
        lemonade.describe();

        System.out.println("----------------------------------------");

        ColdBeverage cola = new ColdBeverage("콜라", 3000, 3, true);
        System.out.println(cola);
        cola.describe();

        System.out.println("-----------------------------------------");
        MainDish steak = new MainDish("스테이크", 8000);
        System.out.println(steak);

        System.out.println("-----------------------------------------");
        Dessert strbrryCake = new Dessert("딸기 케이크", 5000, "Cake");
        System.out.println(strbrryCake);

        System.out.println("-----------------------------------------");
        Dessert strbrryIce = new Dessert("딸기 아이스크림", 5000, "IceCream");
        System.out.println(strbrryIce);

        System.out.println("------------------------------------------");
//        parent type으로 객체를 생성(Food 타입으로 Desset 객체생성)
        Food dessert3 = new Dessert("딸기 케이크2", 7000, "Cake"); // dessert 타입으로 자동 형변환
        System.out.println(dessert3); // Food타입에 있는 toString() 호출 (컴파일시 정적 바인딩)
//                                     ->실행시, Dessert의 toString() 메서드가 호출됨(런타임시, 동적 바인딩)

        /* 동적바인딩
         * 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가.
         * 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작하는 것을 의미한다.
         * 런타임할 때 실제 객체의 메서드가 실행됨
         *
         * 정적바인딩:
         * 컴파일하는 시점에서 메서드가 결정됨
         * */

        Beverage cola2 = new ColdBeverage("콜라", 3000, 3, true); // 객체형식 객체이름 = new 참조할 클래스?. 객체형식을 자식클래스로 받을 수 있따.
        System.out.println(cola2);
        cola2.describe();

        MenuItem cola3 = new ColdBeverage("콜라", 3000, 3, true); // 객체형식 객체이름 = new 참조할 클래스?. 객체형식을 자식클래스로 받을 수 있따.
        System.out.println(cola3);
//        cola2.describe(); MenuItem에 describe() 메소드가 정의 되어 있지 않아서 불가능

        Object cola4 = new ColdBeverage("콜라", 3000, 3, true); // 객체형식 객체이름 = new 참조할 클래스?. 객체형식을 자식클래스로 받을 수 있따.
        System.out.println(cola4);
//        cola4.describe();

        ColdBeverage cola5 = (ColdBeverage) cola2; //cola2는 현재 Beverage type(ColdBeverage의 부모 클래스)형식으로 저장되어 있음
//                                                  ColdBeverage 타입의 cola5에 저장 하려면 명시적 형변환 필요: Beverage -> ColeBeverage
        cola5.describe();
        cola5.isCarbonated(); // ColdBeverage의 메소드 호출 가능


        System.out.println("-----------------------------");
        ColdBeverageEnum cold1 = new ColdBeverageEnum("콜라", 3000, IceLevel.LOW, true); //ColdBeverageEnum으로 받아 같은 타입으로 받음
        System.out.println(cold1);
        cold1.describe();

    }
}

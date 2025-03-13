package com.multi.d_app3;

public class Run {
    public static void main(String[] args) {

        Man mark = new Man(25, "마크", 5);
        System.out.println(mark);
        mark.run();
        mark.eat();
        mark.sleep();

        Man kevin = new SuperMan(30, "케빈", 10, true);
        System.out.println(kevin);
        kevin.run();
        if(kevin instanceof SuperMan superKevin) {
            superKevin.space();
            superKevin.setFlying(false);
            superKevin.space();
        }


        Woman woman = new Woman(25, "제인", "체리케이크");
        System.out.println(woman);

        WonderWoman woman2 = new WonderWoman(28,"티미", "오믈렛", true);
        System.out.println(woman2);

        Woman woman3 = new WonderWoman(30,"라일라", "아이스크림", false);
        System.out.println(woman3);

        Object woman4 = new WonderWoman(31, "달리", "크림스프", true);
        System.out.println(woman4);
    }
}

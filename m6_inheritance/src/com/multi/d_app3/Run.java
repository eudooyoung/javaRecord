package com.multi.d_app3;

public class Run {
    public static void main(String[] args) {

        Man man1 = new Man(25, "마크", 5);
        System.out.println(man1);
        man1.run();
        man1.eat();
        man1.sleep();

        SuperMan man2 = new SuperMan(30, "케빈", 10, true);
        System.out.println(man2);
        man2.space();
        man2.run();

        Woman woman1 = new Woman(25, "제인", "체리케이크");
        System.out.println(woman1);

        WonderWoman woman2 = new WonderWoman(28,"티미", "오믈렛", true);
        System.out.println(woman2);

        Woman woman3 = new WonderWoman(30,"라일라", "아이스크림", false);
        System.out.println(woman3);

        Object woman4 = new WonderWoman(31, "달리", "크림스프", true);
        System.out.println(woman4);
    }
}

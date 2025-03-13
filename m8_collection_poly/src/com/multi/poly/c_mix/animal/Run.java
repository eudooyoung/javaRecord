package com.multi.poly.c_mix.animal;

public class Run {
    public static void main(String[] args) {

        Animal cat = new Cat("나비"); // 왜 안되는지 확인
//        Animal 클래스가 참조 타입으로 사용되었기 때문에
//        기존의 Cat 클래스의 메소드 중 Animal 클래스에 정의되어있는 메소드만 사용 가능
        cat.sleep();
//        여기서 sound 메소드는 Cat 클래스에서 오버라이드 되어 있는 sound 메소드임
        cat.sound();
//        cat.play(); 사용 불가

        Animal dog = new Dog("누렁이");
        System.out.println(dog.getName());
        dog.sleep();
        dog.sound();
    }

}

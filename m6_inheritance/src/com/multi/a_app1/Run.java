package com.multi.a_app1;

public class Run {
    public static void main(String[] args) {
        /*상속(inheritance)
         * 부모가 가지고 있는 재산(자바에서는 클래스가 가지는 멤버)을 자식이 물려받는 의미
         * 자바에서의 상속은 부모클래스의 확장(extend)의 개념
         * 물려받아서 자신의 것 처럼 사용하는 것 뿐 아니라 추가적인 멤버도 작성이 가능
         * 특히 메소드 재정의(overriding)라는 기술을 이용해서 부모가 가진 메소드를 재정의 하는 것도 가능
         *
         * 메소드 재정의(overriding)이란 부모가 가지는 메소드 선언부를 그대로 사용하면서
         * 자식클래스가 정의한 메소드대로 동작하도록 구현 몸체 부분을 새롭게 다시 작성하는 기술이다.
         * 메소드 재정의를 하면 메소드를 호출할 시 재정의한 메소드가 우선적으로 동작하게 된다.
         * */

        Car car = new FireCar(); // 생성자 안의 코드는 객체가 생성될 때 호출됨
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        System.out.println();

        RacingCar car2 = new RacingCar();
        car2.soundHorn();
        car2.run();
        car2.soundHorn();
        car2.stop();
        car2.soundHorn();

//        car2.sprayWater();

    }
}

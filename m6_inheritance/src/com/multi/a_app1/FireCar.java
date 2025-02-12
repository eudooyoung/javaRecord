package com.multi.a_app1;

public class FireCar extends Car {
    /* super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출하여 부모 클래스의 인스턴스도
     *         함께 생성하게 된다. 이 때 생성한 부모의 인스턴스 주소를 보관하는 레퍼런스 변수로
     *         자식 클래스 내의 모든 생성자와 메소드 내에서 선언하지 않고도 사용할 수 있는 레퍼런스 변수이다. >>this와 비교
     * super() : **부모 생성자**를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는
     *           부모의 생성자를 호출하게 된다. this()가 해당 클래스 내의 다른 생성자를 호출하는
     *           구문이라면, super()는 부모클래스가 가지는 private 생성자를 제외한 나머지 생성자를
     *           호출할 수 있도록 한 구문이다.
     * */

    public FireCar() {
        // super(); 상속받은 생성자의 기본생성자를 가져옴
        System.out.println("FireCar 기본생성자");
    }

    @Override
    public void soundHorn() { // Car의 soundHorn 재정의
        if (isRunning()) {
            System.out.println("사이렌소리");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비켜주세요");
        }
    }

    public void sprayWater() {
        System.out.println("불이난 곳에 물뿌리기!");
    }
}

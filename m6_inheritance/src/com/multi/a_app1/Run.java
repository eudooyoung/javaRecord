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

//        자식 클래스 생성자는 부모 클래스 생성자의 코드를 같이(먼저) 실행한다.
        Car fireCar = new FireCar();

        System.out.println(fireCar.getClass().getSimpleName());
//        fireCar 는 Car 가 아닌 FireCar 형식이라고 프린트됨...
//        컴파일 단계에서는 Car 클래스로 되어있다가, 실행 단계에서 FireCar 로 변환되는 듯?

//        FireCar 가 Car 클래스의 soundHorn 이 아닌 FireCar 에서 오버라이드된 soundHorn 메소드 호출
//        동적바인딩, 다형성
//        Car 타입 변수에 FireCar 인스턴스를 대입하면, Car 를 기준으로 인스턴스가 생성되지만, FireCar 에서 오버라이드된
//        메소드들도 모두 함께 생성. 가장 최근(가장 하위타입?)에 오버라이드된 메소드를 호출
        fireCar.soundHorn();

//        Car 의 기존 run 메소드 호출
        fireCar.run();
        fireCar.soundHorn();
        
//        Car 의 기존 stop 메소드 호출
        fireCar.stop();
        fireCar.soundHorn();

//      fireCar 는 Car 형식으로 선언되었기 때문에 FireCar 의 메소드 사용 불가
//        fireCar.sprayWater();
//        FireCar 의 모든 메소드에 접근하기 위해서는 강제 형변환 필요!
        FireCar castedFireCar = (FireCar)fireCar;
        castedFireCar.sprayWater();

        System.out.println();

        RacingCar racingCar = new RacingCar();

//        RacingCar 가 오버라이드한 sountHorn 호출
        racingCar.soundHorn();

//        RacingCar 가 오버라이드한 run 호출
        racingCar.run();
        racingCar.soundHorn();

//        RacingCar 가 오버라이드한 stop 호출
        racingCar.stop();
        racingCar.soundHorn();

//        racingCar 는 RacingCar 형식으로 선언 되었기 때문에 RacingCar 의 메소드 사용 가능
        racingCar.drift();
    }
}

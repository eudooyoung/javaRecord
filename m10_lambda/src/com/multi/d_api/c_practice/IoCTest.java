package com.multi.d_api.c_practice;

public class IoCTest {

  // IoC 컨테이너의 개념을 실습
    public static void main(String[] args) {
        BeanContainer container = new BeanContainer();

        // IoC 컨테이너에서 GreetingService 타입의 인스턴스를 가져옴
        GreetingService greetingService = container.getBean(GreetingService.class);
        if (greetingService != null) {
            greetingService.sayHello(); // 출력: Hello, IoC with Reflection only!
        } else {
            System.out.println("GreetingService 빈을 찾을 수 없습니다.");
        }
    }
}
//제어의 역전(IoC)
//객체를 직접 생성하지 않고, IoC 컨테이너(예: BeanContainer)가 객체를 대신 만들어서 관리하게 하는 것.
//이를 통해 객체 생성과 의존성 관리를 코드가 아닌 컨테이너가 담당
//
// -> 의존성 주입(DI)
//필요한 객체를 직접 생성하지 않고 외부에서 받아 사용하게 하는 방식
//Reflection을 활용한 동적 객체 생성

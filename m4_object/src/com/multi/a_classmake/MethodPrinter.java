package com.multi.a_classmake;

public class MethodPrinter {
//    메소드 출력 순서 확인
    public void methodA() {
        System.out.println("메소드 A 출력문");
        methodB();
    }
    public void methodB() {
        System.out.println("메소드 B 출력문");
        int a = methodC(100); // 메소드C를 호출: 메소드C의 코드(프린트 "메소드 C 출력문")를 수행함과 동시에, 매개변수에 따른 메소드 C의 반환값을 가져옴.
        System.out.println(a);
    }
    public int methodC(int val) { // 메소드 C의 기능이 프린트 + 리턴
        System.out.println("여기서 메소드 C가 호출되어 먼저 출력");
        System.out.println("메소드 C 출력문 " + val);
        return val + 100;
    }
}

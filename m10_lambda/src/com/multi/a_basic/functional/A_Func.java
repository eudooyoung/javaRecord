package com.multi.a_basic.functional;

//*FunctionalInterface annotation
@FunctionalInterface
public interface A_Func {
//    추상메소드
    void method();

//    메소드가 두 개 이상 있으면 함수형 인터페이스가 될 수 없음(디폴트나 스태틱은 가능)
//    void method1();

}

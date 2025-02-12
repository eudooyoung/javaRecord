package com.multi.b_override;

public class SubClass extends SuperClass {

//    오버라이드시 메소드 이름 유지
//    리턴 타입 유지
//    메소드 개수 유지

    @Override
    public void method(int num) {
        super.method(num);
    }

//    >4. private 메소드는 상속받아도 접근이 불가능. 오버라이딩 안됨
//    @Override
//    private void method(int num){}

//    >5. final 키워드가 사용된 메소드는 상속받아도 접근이 불가능. 오버라이딩 안됨
//    @Override
//    private final void finalMethod(){}

//    >6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야 한다.
//    @Override
//    void protectedMethod() { // 더 좁은 범위
//        super.protectedMethod();
//    }

//    같은 범위: protected 일 때는 가능
//    @Override
//    protected void protectedMethod() {
//        super.protectedMethod();
//    }

//    더 넓은 범위: public
    @Override
    public void protectedMethod() {
        super.protectedMethod();
    }


}

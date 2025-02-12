package com.multi.a_classmake;

public class Phone {

    /* 접근제한자
     * 클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드이다.
     * 1. public : 모든 패키지에 접근 허용. (jdk에 올라와 있는 클래스는 전부 퍼블릭)
     * 2. protected : 동일 패키지에 접근 허용. 단, 상속관계에 있는 경우 다른 패키지에서도 접근 가능
     * 3. default : 동일 패키지에서만 접근 허용. (작성하지 않는 것이 default)
     * 4. private : 해당 클래스 내부에서만 접근 허용. (클래스 내부에서 메소드를 만들 때 사용)
     *
     * 위의 네 가지 접근제한자는 클래스의 멤버(필드, 메소드)에 모두 사용 가능하다.
     * 단, 클래스 선언 시 사용하는 접근제한자는 public과 default만 사용 가능하다.
     * */

    // 필드부
    /* 1. 필드 : 객체의 속성을 저장하기위한 공간
     *
     *
     * 멤버변수 == 인스턴스변수
     * <표현법>
     * 접근제한자 [예약어] 자료형 변수명;
     *
     * 필드부에 접근제한자는 private 으로 하는게 객체지향설계원칙 중 하나이다. --> 캡슐화
     */

    //    공통적인 속성: 사이즈, 스피커

//    멤버변수는 자동 초기화
    private int size; // int의 초기값: 0
    private String speaker; // String의 초기값 nullspeaker;

    //생성부
    /*
     * 2. 생성자 (자동으로 만들어짐)
     * - 객체를 생성하기 위한 일종의 메소드
     *
     * <표현법>
     * 접근제한자 클래스명([매개변수]){
     *
     * }
     */

    // 메소드부
    /*
     * 3. 메소드
     * -기능을 구현하는 부분
     *
     * <표현법>
     * [접근제한자] [예약어] 반환형 메소드명 ([자료형 매개변수명]){
     *       //기능구현
     * }
     *
     *
     * */


    public void setSize(int size) { //set 메소드 생성, 값을 필드(멤버변수, 속성, 프로퍼티), 반환 값 필요 없음: void
        if (size >= 0) {
            this.size = size; // this는 현재 클래스(Phone)을 의미, 두번째 size는 패러미터로 받아온 size를 의미
        } else { // 사이즈 값이 마이너스일 때 출력
            System.out.println("음수 안됨");
        }
    }

    public int getSize() { // 반환 값 형식 int
        return this.size;
    }


    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getSpeaker() {
        return this.speaker;
    }

    public void makeCall() {
        System.out.println("전화로 통화한다");
    }

    public void takePhoto() {
        System.out.println("사진 찍기");
    }
}

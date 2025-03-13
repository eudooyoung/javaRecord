package com.multi.b_static;

import com.multi.a_constructor.Account;
import com.multi.a_constructor.MemberDTO;

public class NonStaticMethod {
    // 메소드
    /*
     * [접근제한자] [예약어] 반환할 값의 자료형 메소드명([자료형 매개변수명, 자료형 매개변수명, ...]) {
     *     수행내용;
     *     [return 반환값;]
     * } []: 생략 가능
     */
    //매개변수의 유무와 반환값 유무에 따른 구분

    //    1. 매개 변수가 없고, 반환 값도 없는 경우
    public void method1() {
        System.out.println("매개 변수가 없고, 반환 값도 없는 경우");
    }

    //    2. 매개 변수가 없고, 반환 값이 있는 메소드
    public String method2() {
        return "매개 변수가 없고, 반환 값이 있는 경우";
    }

    //    3. 매개 변수가 있고, 반환 값이 없는 경우
    public void method3(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    //    4. 매개 변수, 반환 값이 있는 경우
    public int method4(int num1, int num2) {
        return num1 + num2;
    }

    //    5. 객체로 매개 변수를 받을 수 있다 **확인
    public void method5(Account a1){
        System.out.println(a1.toString());
    }

//    "객체명"을 매개 변수로 받음
    public void updateMember(MemberDTO member) { // updateMember 라는 메소드에
//                                                  MembetDTO 클래스 형식의 객체를 매개 변수로 받아
//                                                  그 객체의 setName 메소드를 호출
        member.setName("리사");
        System.out.println(member.getName());
    }

//    public void changeName(Account name) {
//        name.Account("나야나");
//    }

}

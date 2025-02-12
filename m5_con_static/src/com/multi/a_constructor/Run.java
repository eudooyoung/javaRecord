package com.multi.a_constructor;

import com.multi.b_static.FieldTest2;
import com.multi.b_static.NonStaticMethod;

public class Run {
    public static void main(String[] args) {
        Account acc = new Account();
        Account acc1 = new Account("호식이");

        System.out.println(acc1);

        Account acc2 = new Account("호식이", "예금", 100000);
        System.out.println(acc2);

        MemberDTO m1 = new MemberDTO(1, "호식이", 38);
//        MemberDTO m2 = new MemberDTO(1, "", 38); // 이름을 넣지 않았을 때

        System.out.println(FieldTest2.NUM); // 객체 생성 없이 호출 가능


//        **확인
        NonStaticMethod ns = new NonStaticMethod();

        ns.updateMember(m1);
        System.out.println(m1);
    }
}

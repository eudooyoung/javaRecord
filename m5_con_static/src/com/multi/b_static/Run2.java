package com.multi.b_static;

public class Run2 {
    public static void main(String[] args) {
        FieldTest f1 = new FieldTest();

        f1.test(20);

//        FieldTest2 f2 = new FieldTest2(); static은 객체 생성 불필요

        System.out.println(FieldTest2.NUM);

        NonStaticMethod test = new NonStaticMethod();

        test.method1();
        System.out.println(test.method2());
        test.method3(5, 3);
        System.out.println(test.method4(6, 3));

//---------------Static method-------------------------
//        static 예약어가 붙어서, 객체 생성 없이 "클래스명.메소드명(전달 값)"의 형식으로 호출

        System.out.println(StaticMethod.num);

        StaticMethod.method1();

        System.out.println(StaticMethod.method2());

        StaticMethod.method3("밤톨이");

        System.out.println(StaticMethod.method4("밤송이"));

        //computer-------------------------------------------
        Computer c1 = new Computer();

        int result1 = c1.sum(1, 2, 3);
        System.out.println(result1);

        int result2 = c1.sum(1, 2, 3, 4, 5);
        System.out.println(result2);

        int[] arr = {1, 2, 3, 4, 5};
        int result3 = c1.sum(arr);
        System.out.println(result3);
    }


}

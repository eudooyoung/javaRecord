package com.multi.b_standardfunc;

import com.multi.b_standardfunc.dto.Student;

import java.util.function.Predicate;

public class E_Predicate {
    /*
     * Predicate<T> test(T t) - 파라미터 있고 리턴값(boolean) 있는 CASE
     *   - Predicate 함수적 인터페이스는 매개변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고있다.
     *   - 이 메소드들은 매개값을 조사해서 true/false를 리턴하는 역활을 한다.
     *
     */

    public void method1(){
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };

        System.out.println(predicate.test("lambda"));

        predicate = val -> val.length() > 5;
        System.out.println(predicate.test("test"));

        Predicate<Integer> predicate2 = val -> val > 1000;

        Predicate<Integer> predicate3 = val -> val > 10;

        boolean result = predicate2.and(predicate3).test(5); // and: default method
        System.out.println(result);

        boolean result2 = predicate2.or(predicate3).test(15); // or: default method
        System.out.println(result2);

        boolean result3 = predicate2.and(predicate3).test(3000);
        System.out.println(result3);

        Student student1 = new Student("밤톨이", 15, "m", 100, 95);
        Student student2 = new Student("밤순이", 14, "f", 95, 100);

        Predicate<Student> studentPredicate = student -> student.getGender().equalsIgnoreCase("m");
        System.out.println("밤순이는 남자입니까? " + studentPredicate.test(student2));
        System.out.println("밤톨이는 남자입니까? " + studentPredicate.test(student1));

    }
}

package com.multi.b_standardfunc;

import com.multi.b_standardfunc.dto.Student;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class C_Function {

    /*
     *  Function<T, R> - apply(T t) : 파라미터 있고 리턴값있는 CASE
     *   - Function 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
     *   - 주로 매개값을 리턴값으로 매핑(타입 변환)하는 역활을 한다.
     *
       @param <T> the type of the input to the function
       @param <R> the type of the result of the function

        R apply(T t) 구현
   */

    public void method01() {
//        Function<String, String> function = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s + "안녕 나야";
//            }
//        };
//
//        System.out.println(function.apply("여기야"));
//
//        Function<String, String> function1 = (String str) -> str + " 거기아니야";
//        System.out.println(function1.apply("여긴가?"));
//
//        Function<Integer, Integer> fun3 = val -> val-2;
//        int r =fun3.apply(5);
//        System.out.println(r);

//	public Student(String name, int age, String gender, int math, int english) {
        Student student = new Student("밤톨이", 15, "m", 100, 95);
        Function<Student, String> func4 = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        };

        System.out.println(func4.apply(student));
        func4 = s -> s.getName();
        System.out.println("람다식 " + func4.apply(student));

        Function<Student, Integer> funcAge = new Function<Student, Integer>() {
            @Override
            public Integer apply(Student student) {
                return student.getAge();
            }
        };

        System.out.println(funcAge.apply(student));
//        funcAge =


     /*
        Function 에서 파생된 인터페이스
        BiFunction<T,U,R> : T와 U 전달하고 R타입으로 반환
        DoubleFunction<R> : double로 전달하고 R타입으로 반환
        IntFunction<R> : int로 전달하고 R타입으로 반환
        IntToDoubleFunction : int로 전달하고 double타입으로 반환
        IntToLongFunction : int로 전달하고 long타입으로 반환
        LongToDoubleFunction : long로 전달하고 double타입으로 반환
        LongToIntFunction : long로 전달하고 int타입으로 반환
        ToDoubleBiFunction<T, U> : 객체 T와 U를 double로 반환
        ToDoubleFunction : 객체 T를 double로 반환
        ToIntBiFunction<T, U> : 객체 T와 U를 int로 반환
        ToIntFunction   : 객체 T를 int로 반환
        ToLongBiFunction<T, U>: 객체 T와 U를 long으로 매핑
        ToLongFunction : 객체 T를 long으로 반환
  */
        System.out.println("수학점수");
        printInt(s -> s.getMath(), student);

        System.out.println("영어점수: ");
        printInt(s -> s.getEnglish(), student);
    }

    public void printInt(ToIntFunction<Student> function, Student student) {
        System.out.println(function.applyAsInt(student));
    }

}

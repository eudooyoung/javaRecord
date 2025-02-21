package com.multi.b_standardfunc;

import com.multi.b_standardfunc.dto.Student;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class D_Operator {
    /*
     * Operator<T> - 파라미터있고 리턴값있는 CASE
     *   - Operator 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
     *   - Function 함수적 인터페이스와 다르게 주로 매개값을 이용해서 연산하고 동일한 타입으로 결과를 리턴하는 역할을 한다.
     */

    /*
     ( 모두 데이터타입 동일 )
      BinaryOperator<T> : BiFunction<T,U,R>  상속 : 두개의 파라미터 전달하고 반환
      UnaryOperator<T> : Function<T,R> 상속 : 하나의 파라미터 전달하고 반환
      DoubleBinaryOperator : 두개의 파라미터 double 전달하고  double 반환
      DoubleUnaryOperator     :    : 하나의 파라미터 double 전달하고 double반환
      IntBinaryOperator : 두개의 파라미터 int 전달하고  int 반환
      IntUnaryOperator    :    : 하나의 파라미터 int 전달하고 int반환
      LongBinaryOperator : 두개의 파라미터 long 전달하고  long 반환
      LongUnaryOperator   :    : 하나의 파라미터 long 전달하고 long반환
     */

    public void method1() {
        BinaryOperator<String> bo = new BinaryOperator<String>() {
            @Override
            public String apply(String s1, String s2) {
                return s1.length() == s2.length() ? "길이가 같음" : s1.length() > s2.length() ? s1 : s2;
            }
        };

        String str1 = "lambda";
        String str2 = "java17";
        String str3 = "test3";

        String result = bo.apply(str1, str2);
        System.out.println(result);
        String result2 = bo.apply(str1, str3);
        System.out.println(result2);

        IntBinaryOperator ib = ( a,  b) -> a + b;
        System.out.println(ib.applyAsInt(3,6));

        IntUnaryOperator iu = c -> c * c;
        System.out.println(iu.applyAsInt(5));

        Student student1 = new Student("밤톨이", 15, "m", 100, 95);
        Student student2 = new Student("밤식이", 14, "m", 95, 100);

        BinaryOperator<Student> funcMath = new BinaryOperator<Student>() {
            @Override
            public Student apply(Student student1, Student student2) {
                return student1.getMath() > student2.getMath() ? student1 : student2;
            }
        };

        Student highMath = funcMath.apply(student1, student2);
        System.out.println(highMath);

//        funcMath = BinaryOperator.maxBy((s1, s2)) -> Integer.compare(s1.getMath(), s2.getMath());
//        BinaryOperator<Student> funcEng = (s1, s2) -> {
//            return (student1.getEnglish() > student2.getEnglish()) ? student1 : student2;
//
//        };
    }
}

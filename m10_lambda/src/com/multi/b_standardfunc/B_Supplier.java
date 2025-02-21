package com.multi.b_standardfunc;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class B_Supplier {
    //매개 변수 없이 반환만
    /*
     * Supplier<T> - get() : 파라미터 없고 리턴값있는 CASE
     *   - Supplier 함수적 인터페이스는 매개 변수가 없고 리턴값이 있는 getXXX() 메소드를 가지고 있다.
     *   - 이 메소드들은 실행 후 호출한 곳으로 데이터를 리턴(공급)하는 역활을 한다.
     *      @param <T> the type of results supplied by this supplier
               T get() :  T 타입으로 정해진 값을 반환한
     */

    public void method01() {

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "익명객체 매개없이 반환만";
            }
        };

        System.out.println(supplier.get());

        supplier = () -> "람다식";
        System.out.println(supplier.get());


        IntSupplier intSupplier = () -> 20 + 50;
        System.out.println(intSupplier.getAsInt());
    }
}

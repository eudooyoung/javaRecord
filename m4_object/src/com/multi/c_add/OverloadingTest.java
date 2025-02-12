package com.multi.c_add;

public class OverloadingTest {
    public void test(){

    }

//    public void test(){} //메소드 이름 중복으로 인해 생성 불가

    public void test(int a) {} // 매개변수 자료형 variation

    public void test(int a, String b){}
    public void test(String a, String b){}
    public void test(int a, int b){}

//    public void test(int c, int t){} 매개변수 이름만 바뀐것으로 오버로딩 되지 않음

//    public int test(int a, int b){} 반환 형식을 바꿔도 안됨
//    private int test(int a, int b){} 접근 제한자를 바꿔도 안됨
//    **메소드이름, 매개변수 자료형, 개수, 순서 만 시그니처에 영향을 준다**

    /* 결론
     * 오버로딩 : 동일한 메소드 명을 사용하는 것  , 매개변수의 자료형과 갯수 , 순서가 다르게 작성되어야 한다. (접근제한자, 반환형은 상관없음)
     * */




}

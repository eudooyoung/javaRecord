package com.multi.a_basic;

public class PrintTest {
    public static void main(String[] args) {
        //1.숫자출력 --> 따옴표 없이
        System.out.println(123);  //정수값출력
        System.out.println(1.23); //실수값출력

        //2.문자(한글자) 출력 --> 따옴표 이용
        System.out.println('a');
        System.out.println('b');

        //3.문자열(여러글자) 출력 --> 쌍따옴표 이용 (그냥 따옴표안됨)
        System.out.println("안녕하세요");
        System.out.println("반갑습니다.");

        //4.연산한 결과 값도 출력가능
        System.out.println(123 + 456);
        System.out.println(1.23 - 0.12);

        //5.문자와 숫자 연산가능 --> ***문자와 숫자 연산시 문자를 자동으로 숫자로 인식***
        System.out.println('a' + 1);// 각 문자마다 컴퓨터가 인식하는 고유한 숫자값을 가지고 있음 // a==97

        //6.문자열 ("") 과 그외의 값을 덧셈연산 -->***문자열화됨***
        System.out.println("하이" + 'a');
        System.out.println("안녕하세요" + 123);
        System.out.println("반갑습니다" + 111 + 222);

        //7.논리형태값출력
        System.out.println(true);

        System.out.println("=========== 두 개의 문자열 합치기 ===========");
        System.out.println(9 + 9);           //18
        System.out.println("9" + 9);          //99
        System.out.println(9 + "9");          //99
        System.out.println("9" + "9");        //99

        System.out.println("=========== 세 개의 문자열 합치기 ===========");
        System.out.println(9 + 9 + "9");       //189  //'+'의 연산 방향은 왼쪽에서 오른쪽이다 (숫자부터 합쳐짐)
        System.out.println(9 + "9" + 9);       //999  //왼 쪽의 연산부터 수행하고 수행 결과를 오른쪽과 연산함
        System.out.println("9" + 9 + 9);       //999 문자열 99 에 마지막 9 더해짐


//        17버전 이상에서 사용가능한 문법. """ """
        String text = """
                자바 공부중
                멀티 캠퍼스
                
                """;

        System.out.println(text);


        String text1 = """
                {
                    "id":%d,
                    "name":%s
                }
                """.formatted(2, "test");

        System.out.println(text1);

        String str1 =
                "{\n" +
                        "\t\"id\":\"winter\",\n" +
                        "\t\"name\":\"눈송이\"\n" +
                        "}";

        String str2 = """
                {
                    "id":"winter",
                    "name":"눈송이"
                }
                """;

        System.out.println(str1);
        System.out.println("------------------------------------");
        System.out.println(str2);
        System.out.println("------------------------------------");
    }
}

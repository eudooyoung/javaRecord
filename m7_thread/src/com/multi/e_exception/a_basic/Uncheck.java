package com.multi.e_exception.a_basic;

import java.util.Scanner;

public class Uncheck {
    // - 예외(Exception) : 소스 코드 수정으로 해결 가능한 에러 (Unchecked?)

// RuntimeException이란 : 미리 정의 되어 있고 이들이 명시하는 예외 상황은
//                      프로그램의 종료로 이어지는 것이 자연스러운 경우가 많다.
//                      (예외처리를 통해 프로그램이 종료되지 않게 처리 할 수 있다.)


// - 예외 처리 방법
//      1. if문 : 간단한 예외 처리시
//            (장점은 프로그램이 종료되지 않고 그 예외 상황에 있어서는 if문이
//             실행되지 않게 하여 프로그램의 흐름을 조절할 수 있다.)
//            (단점은 if문이 너무 자주 혹은 깊이 사용되면 그게 예외 상황을 처리하는 것인지
//             프로그램 상의 주 흐름 코드인지가 구분이 안된다.)
//
//     2. try-catch문 : 예외상황이 발생할 수 있는 지역에 한해서 예외 처리를 하고
//                 어떻게 처리할지도 결정
//                 a. try블록 안은 하나의 일의 단위(트랜잭션)이다.
//                    예외 상황이 발생하는 부분
//                 b. catch 블록의 ()안은 try블록 안에서 발생한 예외클래스의
//                    인스턴스 참조변수값(객체의 주소값)이 넘어온다.(JVM이 해줌)
//
//     3. throws : 예외처리를 하지 않고 자신을 호출한 **상위 메소드에게 처리를 위임
//            main()메소드까지 위임하고 나서도 throws를 하게 되면
//            마지막엔 JVM이 예외 처리를 함


    //   RuntimeException의 후손들
// - ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 사용하는 예외상황 --> 개발자가 실수 (코드 해결하면됨)
// - ClassCastException : 허용할 수 없는 형변환이 진행되는 예외 상황 --> 개발자가 실수 (코드 해결하면됨)
// - NegativeArraySizeException : 배열 선언 과정에서 배열의 크기를 음수로 지정하는 예외상황 --> 개발자가 실수 (코드 해결하면됨)
// - NullPointerException : 참조변수가 null로 초기화 된 상황에서 메소드를 호출하는 예외상황 --> 개발자가 실수 (코드 해결하면됨)
// - ArithmeticException : 나누기 연산에서 부모가 0인 경우 발생하는 예외 상황 --> 개발자가 실수 (코드 해결하면됨)
//
//--> 이러한 RuntimeException 관련된 예외는 충분히 예측가능한 상황에 있어서
//    아예 애초에 예외가 발생이 안되게끔 if문 조건으로 충분히 처리 가능
    private Scanner sc = new Scanner(System.in);

    public void method01() {

        //ArithmeticException

        System.out.println("정수 1 : ");
        int num1 = sc.nextInt();

        System.out.println("정수 2 : ");
        int num2 = sc.nextInt();

        int result = 0;

/*
 * * try catch 방법
 *
 * try {
 *     예외가 발생될 수 있는 구문;
 *
 *      }catch(발생될예외클래스 매개변수) {
 *     해당 예외가 발생되는 경우 처리할 구문;
        }
 */

//        try {
//            result = num1 / num2; // 예외가 발생할 수 있는 코드를 try 안에 넣고
//        } catch (ArithmeticException e) { // 예외 타입 catch 안에 기입
//            System.out.println("0으로 나눌 수 없습니다."); // 예외가 발생할 경우 출력:
//        }
//
//        System.out.println("result: " + result);

        if (num2 != 0) {
            result = num1 / num2;
        }

        System.out.println("result: " + result);


    }

    public void method02() {
        System.out.println("배열의 길이: ");

        int num = sc.nextInt(); // 배열의 크기 입력

        try {
            int arr[] = new int[num]; // arr[]의 크기를 num의 값으로 설정
            System.out.println("배열이 잘 생성됨");
        } catch (NegativeArraySizeException e) { // NegativeArraySizeException : 배열 선언 과정에서 배열의 크기를 음수로 지정하는 예외상황
//            코드를 돌려보면 Exception의 종류를 알려줌
            System.out.println("배열의 크기는 음수가 될 수 없습니다.");
        }
        System.out.println("배열의 크기: " + num);

        if (num > 0) {
            int arr[] = new int[num];
            System.out.println("배열이 잘 생성됨");

        }

        System.out.println("배열의 크기: " + num);
    }

    public void method03() {

        Object obj = 'a'; // char type 변수, (char -> (autoBoxing) -> Character 클래스로 변환 후 Object 클래스 형식으로 저장
        int[] arr = new int[2];

        try {
//            String str = (String) obj; // runtime 에러
            String str = String.valueOf(obj); // String type으로 클래스 변환
            arr[0] = 1;
            arr[1] = 2;
//            arr[2] = 3;
            String str1 = null; // null일 때는 method를 사용할 수 없음
            int length = str1.length();
//        } catch (ClassCastException e) {
//            System.out.println("형변환 잘못 했으니 다형성, 스트링 메소드 찾아보기");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("배열 크기 설정 오류: 배열 확인");
        } catch (ClassCastException|ArrayIndexOutOfBoundsException|NullPointerException e) { // Exceoption을 '|'를 이용해 한 줄에 붙여서 샤용
            e.printStackTrace(); //오류의 유형, 경로, 에러 메시지
            System.out.println("--------------------------");
            System.out.println(e.getMessage()); // 에러 메시지
            System.out.println(e); // 유형 + 에러 메시지
//            System.out.println(e.toString());

//            return; finally까지 실행 수 호출한 메소드로 돌아감
//            System.exit(0); 이곳에서 프로그램 바로 종료
        } finally {
            System.out.println("여전히 실행중.. 꼭 실행 되어야 하는 코드 작성"); // 오류의 유무와 관계 없이 항상 실행되는 코드
        }

        System.out.println("코드 끝");
    }
}

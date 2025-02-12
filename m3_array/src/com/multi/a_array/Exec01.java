package com.multi.a_array;

import java.util.Random;

public class Exec01 {
    public static void main(String[] args) {
        int[] jumsu = new int[1000]; //인덱스는 크기 -1까지
// object class 확인
        System.out.println(jumsu.toString());//toString을 적지않아도 내부적으로 호출함
        System.out.println(jumsu);// jvm이 자동으로 변수 toString()호출하여 주소값 출력

        jumsu[0] = 100;
        jumsu[1] = 999;
        jumsu[999] = 1000;
//        point [1000] = 1000; ArrayIndexOutOfBoundsException 배열크기보다 더 큰 인덱스 호출 오류
//        빨간 줄, 노랑 줄 차이 확인
        System.out.println("첫번째 값: " + jumsu[0]);
        System.out.println("11번째 값: " + jumsu[10]);
        System.out.println("마지막 값: " + jumsu[999]);
        System.out.println("500번째 값: " + jumsu[499]); //초기값 0

        System.out.println(jumsu.length); //메소드 형식이 아님
        System.out.println(jumsu[jumsu.length - 1]);// 레퍼런스 변수명[크기 -1]: 마지막 인덱스에 저장된 데이터 출력

        /* 기본적으로 배열을 선언하고 할당하게 되면
         * 배열의 각 인덱스에는 자바에서 지정한 기본값으로 초기화가 된 상태가 된다.
         * heap영역은 값이 없는 빈 공간이 존재할 수 없다.
         * */

        /* 값의 형태 별 기본값
         * 정수 : 0
         * 실수 : 0.0
         * 논리 : false
         * 문자 : \u0000
         * 참조 : null
         * */
//        char[] c = new char[100];
//        System.out.println(c);
//
//        c[0] = 'A';
//        c[1] = 'B';
//
//        System.out.println(c); //char 배열은 배열의 해시코드(주소 값)이 아닌 배열에 저장된 데이터를 추력함(내부적으로 그렇게 설계됨)


//        로또 만들기
//        공간 6개 생성
//        값은 랜덤 45개 값

        int[] lotto = new int[6]; //방 생성
        Random random = new Random();// 랜덤 객체 생성
        for (int i = 0; i < lotto.length; i++) { //배열 길이만큼 반복
            lotto[i] = random.nextInt(45) + 1; //lotto의 i번째 배열에 랜덤 객체로 생성한 난수를 지정
        }                                             //난수의 첫 수는 1, 1부터 45개: 1부터 45사이의 난수 생성


        // for each문 for (들어있는 데이터의 타입  변수명 : 돌려보고자 하는 객체의 주소(변수 명))
        // 배열의 각 인덱스에 저장된 데이터를 전부 차례대로 출력
        for (int i : lotto) {
            System.out.print(i + " ");
        }

//        만들고자 하는 배열의 크기와 값이 정해져 있다면 {}안에 값을 넣어서 선언과 동시에 총기화
        System.out.println();
        int[] scores = {100, 20, 90};
//        배열 항목의 총합 구하기
        {
            int sum = 0; //총합 초기화
            for (int i : scores) { //for each 현재 scroes 배열에는 int형 데이터가 저장되어 있고, 그 데이터를 int i(index)에 순서대로 저장.
                sum += i;
            }
            System.out.println(sum);
        }
//        배열 항목의 평균 구하기
        {
            int sum = 0;
            double avg = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i];
                avg = (double) sum / (i + 1);
            }
            System.out.println(avg);
        }

        /* 랜덤한 카드를 한 장 뽑아서 출력해보자 */
        /* 먼저 모양과 카드 숫자별로 값을 저장할 두 종류의 배열을 만들자 */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int indexShapes = random.nextInt(4); //shapes.length: shapes 배열의 길이, 배열의 0번째 index 부터 난수를 생성해야함
        int indexNumbers = random.nextInt(13); //cardNumbers.length: cardNumbers 배열의 길이

        System.out.println("당신이 뽑은 카드는 " + shapes[indexShapes]
                + " " + cardNumbers[indexNumbers] + " 카드 입니다.");

//        dialog로 정수로 점수 5개 입력 받아 합을 출력
//        {
//            int[] score = new int[5];
//            for (int i = 0; i < score.length; i++) {
//                score[i] = Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요"));
//            }
//            int sum = 0;
//            for (int i : score) {
//                sum += i;
//            }
//            System.out.println(sum);
//        }

//        1000개의 공간에 100까지의 숫자중 랜덤한 값을 넣어 80보다 큰 값 갯수 출력
        {
            int[] total = new int[1000];//배열 초기화
            int count = 0;//카운트 초기화
            for (int i = 0; i < total.length; i++) {
                total[i] = random.nextInt(100) + 1;// 1부터 100까지 숫자중 랜덤으로 난수 하나를 생성하여 total배열의 i번째 자리에 저장
                if (total[i] > 80) count++;//저장된 값이 80보다 크면 카운트
            }
            System.out.println(count);
        }

    }
}

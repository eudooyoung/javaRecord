package com.multi.a_array;

import java.util.Arrays;

public class Exec03 {
    public static void main(String[] args) {
//  두 변수의 데이터 바꾸기
        int num1 = 10;
        int num2 = 20;

        int temp;
        temp = num1; //num1의 데이터 임시저장
        num1 = num2; //num1에 num2의 데이터 덮어씌움
        num2 = temp; //num2에 temp에 저장되어있던 num1의 원래 데이터 덮어씌움

        System.out.println(num1);
        System.out.println(num2);


        int[] arr = {2, 1, 3};
        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

//        for(int i : arr){
//            System.out.println(i);
//        }

        System.out.println(Arrays.toString(arr)); //Arrays사용

//        최소값
        int[] num = {55, 22, 11, 99, 33};
        int min = num[0]; //최소값 초기화
        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) { // 현재 최소값이 배열의 n번째 값보다 크다면,
                min = num[i]; // 최소값 갱신
            }
        }
        System.out.println(min);

//        for each 활용
        for (int i : num) { // for each문 구조: for(대상 배열과 같은 타입의 인덱스 선언 : 대상 배열의 이름)
            if (min > i) min = i; // 반복문 내용, i에는 num[i]값이 저장됨
        }
        System.out.println(min);

//      최댓값
        int max = num[0]; // 최댓값 초기화
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) { // 현재 최댓값이 배열의 n번재 값보다 작으면,
                max = num[i]; // 최댓값 갱신
            }
        }
        System.out.println(max);

//        for each 활용
        for (int i : num) {
            max = Math.max(max, i); //Math 클래스 max 메소드 사용. 현재 최댓값과 num[i]를 비교하여 더 큰 값 반환
        }
        System.out.println(max);


        int count = 0; //index를 세기 위한 변수 선언 및 초기화
        for (int i = 0; i < num.length; i++) {
            if (num[i] == max) {
                System.out.println("MAX의 위치 " + i);
                count++;
            }
        }
        System.out.println("Max의 개수 " + count);

//        정렬
        Arrays.sort(num); //오름차순 정리
        System.out.println(Arrays.toString(num)); //저장된 배열값을 문자열로 변환해서 출력

//        내림차순 정렬
//         직접 구현해야함
//        {55, 22, 11, 99, 33};
        for (int i = 0; i < num.length / 2; i++) {//가운데 값은 정렬할 필요 없음
            int temp1 = num[i]; //임시값 저장
            num[i] = num[num.length - 1 - i]; //i가 0일때는 num[0](첫번째 데이터)과 num[num.length - 1 - i](마지막 데이터)와 바꿈
            num[num.length - 1 - i] = temp1; //데이터 교환
        }
        System.out.println(Arrays.toString(num));

//        문자열을 배열로 저장
        String s1 = "감자, 고구마, 양파";
        String[] sArr = s1.split(",");
        System.out.println(Arrays.toString(sArr));
    }
}

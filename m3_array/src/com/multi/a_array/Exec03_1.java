package com.multi.a_array;

import java.util.Arrays;

public class Exec03_1 {
    public static void main(String[] args) {
        int[] test = {35, 27, 46, 13, 88};

        // 처음 넣어준 순서대로 배열 값 출력
        System.out.println(Arrays.toString(test));

        // 오름차 순으로 정렬한 후 출력
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));

        // 내림차 순으로 정렬한 후 출력
        // 우선 오름차 순으로 정렬한 후, 진행
        for(int i = 0; i < test.length / 2; i++){  // 배열 크기가 홀수면 가운데 값은 바꾸지 않아도 됨. 짝수면 배열 크기를 반으로 나눈 수 만큼 반복
            int temp = test[i];                    // 값을 교체 하기 위한 임시 저장 변수
            test[i] = test[test.length - (1 + i)]; // 배열의 첫번째 자리에, 배열의 마지막 값(가장 큰 값) 대입. 두번째 반복할 때는 배열의 두번째 자리에, 배열의 마지막에서 두번째값 대입...
            test[test.length - (1 + i)] = temp;    // 배열의 마지막 자리에, 저장해둔 배열의 첫번째 값(가장 작은 값) 대입. 이런 식으로 배열의 i번째 자리와 끝에서 i번째를 계속 교체해 나감.
        }
        System.out.println(Arrays.toString(test));

    }
}

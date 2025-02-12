package com.multi.c_practice;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        String[] sbName = {"국어", "영어", "수학", "컴퓨터", "회화"}; //스트링타입 배열, 동시에 초기화
        int[] term1 = {44, 66, 22, 99, 100};
        int[] term2 = term1.clone(); //클론 메소드를 이용해 깊은 복사
        for (int i = 0; i < term2.length; i++) {
            term2[i] = (i == 0) ? 22 : //배열의 각 자리에 원하는 점수 할당
                    (i == 1) ? 66 :
                            (i == 2) ? 88 :
                                    (i == 3) ? 99 : 100;
        }

        int imprvCount = 0; //점수가 오른 과목 세기
        int rmnCount = 0; //점수가 동일한 과목 세기
        int lwrCount = 0; //점수가 내려간 과목 세기

        for (int i = 0; i < term1.length; i++) {
            if (term2[i] > term1[i]) imprvCount++; //2학기가 1학기보다 크면 카운트
            if (term1[i] == term2[i]) rmnCount++; //2학기와 1학기가 같으면 카운트
            if (term1[i] > term2[i]) lwrCount++; //1학기가 2학기보다 크면 카운트
        }
        System.out.println(Arrays.toString(sbName)); // 과목 출력
        System.out.println("1학기");
        System.out.println(Arrays.toString(term1)); // 1학기 점수 출력
        System.out.println("2학기");
        System.out.println(Arrays.toString(term2)); // 2학기 점수 출력
        System.out.println("성적이 동일한 과목 수: " + rmnCount); // 각 카운트 결과 출력
        System.out.println("성적이 오른 과목 수: " + imprvCount);
        System.out.println("성적이 낮아진 과목 수: " + lwrCount);


    }
}

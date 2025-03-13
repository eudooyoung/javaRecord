package com.multi.thisisjava;

public class ex08 {
    public static void main(String[] args) {
//        주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성하시오.
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

//        전체 배열 항목의 크기 초기화
        int totalCount = 0;

//        저장된 값의 총합 초기화
        int totalSum = 0;

        for(int i = 0; i < array.length; i++){
            totalCount += array[i].length; // 첫번째 배열(int[][] 에서 int [])의 각 크기를 totalCount 에 더해준
            for(int j = 0; j < array[i].length; j++){
                totalSum += array[i][j]; // 각 배열의 인덱스에 저장되어 있는 값을 totalSum 에 저장
            }
        }

//        평균값 계산
        double avg = (double) totalSum/totalCount;

//        결과 출력
        System.out.println("총합: " + totalSum);
        System.out.println("평균: " + avg);
    }
}

package com.multi.thisisjava;

public class ex07 {
    public static void main(String[] args) {
//        주어진 배열 항목에서 최대값을 출력하시오.
        int[] array = {1, 5, 3, 8, 2};
        int maxNum = 0;
        for(int i = 0; i < array.length; i++){
            if(maxNum < array[i]) maxNum = array[i];
        }
        System.out.println(maxNum);
    }
}

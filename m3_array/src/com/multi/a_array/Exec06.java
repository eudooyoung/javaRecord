package com.multi.a_array;

import java.util.Arrays;

public class Exec06 {
    public static void main(String[] args) {
        /* 다차원 배열
         * 다차원 배열은 2차원 이상의 배열을 의미한다.
         * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
         * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
         * 더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 차원의 배열은 사용 빈도가 현저히 적다. (인지 범위 초과)
         *  */

        /* 2차원 배열을 사용하는 방법
         * 1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack)
         * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
         * 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
         * 4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용
         * */

//        자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이];

        int[][] iarr1 = new int[6][]; // 행의 갯수는 반드시 지정

        int iarr2[][] = new int[6][]; // 다양한 선언방식
        int[] iarr3[] = new int[6][];

        int[] iarr4[] = new int[3][5]; // 열의 크기가 같을때의 선언방식, 다를때는 뒤를 비워둠

        for (int i = 0; i < iarr4[0].length; i++) {
            System.out.print(iarr4[0][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < iarr4.length; i++) {// 행의 갯수[]생략 가능
            System.out.println();
            for (int j = 0; j < iarr4[i].length; j++) {
                System.out.print(iarr4[i][j] + " ");
            }
        }
        System.out.println();

//        정변배열

        int[][] iarr5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        for (int y = 0; y < iarr5.length; y++) {
            System.out.println();
            for (int x = 0; x < iarr5[y].length; x++) {
                System.out.print(iarr5[y][x] + " ");
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(iarr5));

//        행의 인덱스를 지정해주면 일차원 배열처럼 사용 가능
        System.out.println(Arrays.toString(iarr5[1]));

//        2차원 배열을 세로로 뽑아 보고 싶으면 이런 식으로 구현
//        2차원 배열에서 인덱스 지정 없이 array.length는 항상 행의 크기를 반환 한다. (다차원 배열에서는 아마도 가장 상위 차원)
        for(int i = 0; i < iarr5.length; i++) {
            System.out.println(Arrays.toString(iarr5[i]));
        }

//        가변배열

        int[][] iarr6 = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        for (int y = 0; y < iarr6.length; y++) {
            System.out.println();
            for (int x = 0; x < iarr6[y].length; x++) {
                System.out.print(iarr6[y][x] + " ");
            }
        }

        //가변배열 : 행은 정해져있으나 각행에 대한 열의 갯수가 다름,(정해져있지 않은 상태 가변
        int[][] seat1 = new int[3][];
        //2차원 배열은 1차원 배열을 연결!
        int[] s1 = {1, 2, 3};
        int[] s2 = {1, 2, 3, 4};
        int[] s3 = {1, 2, 3, 4, 5};

        seat1[0] = s1;
        seat1[1] = s2;
        seat1[2] = s3;

        System.out.println();
        System.out.println(Arrays.toString(iarr6)); //내부배열의 각 주소를 배열로 출력
        System.out.println(Arrays.deepToString(iarr6)); // 다차원 배열에서 내부 값을 호출하려면 Arrays.toString이 아닌 Arrays.deepToString을 호출해야 한다.
        System.out.println();

        int[][] original = {{1, 2}, {3, 4}};
        int[][] copy = original.clone();

        copy[0][0] = 10;
        System.out.println(Arrays.deepToString(original)); // [[10, 2], [3, 4]]
        System.out.println(Arrays.deepToString(copy));     // [[10, 2], [3, 4]]

//      깊은복사
//        배열의 본 주소는 다름
        System.out.println("original: " + original);
        System.out.println("copy: " + copy);

//      얕은복사
//         다차원 배열에서 각 행에 저장된 배열의 주소는 같다?
        System.out.println("original: " + original[1]);
        System.out.println("copy: " + copy[1]);
        System.out.println(copy == original);


    }
}

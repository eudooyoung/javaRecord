package com.multi.c_loop;

public class Exec05 {
    public static void main(String[] args) {
//        구구단
//        세로출력 해보기
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 8; x++) {
                System.out.printf("%d x %d = %-3d ", x + 2, y + 1, (x + 2) * (y + 1));
            }
            System.out.println();
        }
    }
}

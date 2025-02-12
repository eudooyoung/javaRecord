package com.multi.c_practice;

public class Ex04 {
    public static void main(String[] args) {
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        int imprvCount = 0;
        int rmnCount = 0;

        for (int i = 0; i < term1.length; i++) {
            if (term2[i] > term1[i]) imprvCount++;
            if (term1[i] == term2[i]) rmnCount++;
        }
        System.out.println("성적이 오른 학생 수: " + imprvCount);
        System.out.println("성적이 동일한 학생 수: " + rmnCount);

    }
}

package com.multi.practice.c_;

public class BbsUse {
    public static void main(String[] args) {
        Bbs[] p = new Bbs[3]; //객체를 배열 형태로 생성 가능하다.
        p[0] = new Bbs("java", "fun java", "park"); // 각 배열에 들어갈 객체는 new를 이용해 생성
        p[1] = new Bbs("jsp", "fun jsp", "hong");
        p[2] = new Bbs("spring", "fun spring", "kim");

        System.out.println("게시판");
        System.out.println("-------");
        System.out.printf("%-3s\t%-4s\t%-8s\t%-5s\t\n", "no", "title", "content", "writer");
        for (int i = 0; i < Bbs.getCount(); i++) {
            System.out.printf("%-3d\t%-5s\t%-8s\t%-5s\t\n", i + 1, p[i].getTitle(), p[i].getContent(), p[i].getWriter());
        }
    }
}

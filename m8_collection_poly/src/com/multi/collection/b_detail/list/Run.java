package com.multi.collection.b_detail.list;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();// Board 타입만 받을 수 있게 고정 <>안에는 클래스 타입만 기입. 더 큰타입(List 타입으로 ArrayList를 받음)

        list.add(new Board("제목1", "내용1", "글쓴이")); // 리스트안에 보드타입의 객체를 넣는다.
        list.add(new Board("제목2", "내용2", "글쓴이"));
        list.add(new Board("제목3", "내용3", "글쓴이"));
        list.add(new Board("제목4", "내용4", "글쓴이"));
        list.add(new Board("제목5", "내용5", "글쓴이"));

        int size = list.size();
        System.out.println(size);

        Board b2 = list.get(2);
        System.out.println(b2.getSubject() + b2.getContent());

        System.out.println();
        // for
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i).getSubject() + list.get(i).getContent());
        }

        System.out.println();
        // for each
        for (Board b : list) {
            System.out.println(b.getSubject() + b.getContent());
        }

        System.out.println();
        // 객체 두개 삭제
        list.remove(0);
        list.remove(0);
        for (Board b : list) {
            System.out.println(b.getSubject() + b.getContent());
        }
    }
}

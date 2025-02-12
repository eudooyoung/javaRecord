package com.multi.d_file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File f = new File("test.txt"); // 파일 객체 생성, 프로젝트 안을 기본 경로로 설정함.
        //  IOException
        try {
            f.createNewFile(); //빨간줄: 컴파일오류, createNewFile 메소드가 예외사항을 던저주게 작성됨
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boolean isExist = f.exists(); // 존재하는지 확인
        System.out.println(isExist);
        System.out.println(f.isDirectory()); // 경로인지 확인
        System.out.println(f.isFile()); // 파일인지 확인
        System.out.println(f.getAbsolutePath()); // 절대경로
        System.out.println();

        File folder = new File("parent"); // 확장자가 없으면 폴더 생성

        folder.mkdir(); // make directory

        System.out.println(folder.isDirectory());
        System.out.println(folder.getName());


    }
}

package com.multi.d_file;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("날짜 입력");
        String s2 = JOptionPane.showInputDialog("제목 입력");
        String s3 = JOptionPane.showInputDialog("내용 입력");

        FileWriter file = null; //참조형 자료는 null 값을 포함할 수 없다.(있다?)
//        null포인트 익셉션 확인

        try {
            file = new FileWriter(s1 + ".txt");

            file.write(s1 + "\n"); //\n이면 엔터를 넣어준다.
            file.write(s2 + "\n");
            file.write(s3 + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(file != null) {
                try {
                    file.close(); //반드시 필요함
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

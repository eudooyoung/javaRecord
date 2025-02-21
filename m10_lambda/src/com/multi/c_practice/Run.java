package com.multi.c_practice;

public class Run {
    public static void main(String[] args) {

        Button button = new Button();

        button.setClickListener(() -> {
            System.out.println("Ok 버튼이 클릭 되었습니다.");
        });

        button.click();

        Button cButton = new Button();

        cButton.setClickListener(() -> {
            System.out.println("취소 버튼이 클릭 되었습니다.");
        });

        cButton.click();
    }
}

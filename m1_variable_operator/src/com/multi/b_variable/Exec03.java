package com.multi.b_variable;

import javax.swing.*;

public class Exec03 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("이름입력");
        System.out.println("당신의 이름은 " + name + "이시군요!!");
        JOptionPane.showMessageDialog(null,"당신의 이름은 " + name + "이시군요!!");

    }
}

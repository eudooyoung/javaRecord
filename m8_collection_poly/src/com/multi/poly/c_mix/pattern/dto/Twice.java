package com.multi.poly.c_mix.pattern.dto;

public class Twice implements Singer{

    public void sing() {
        System.out.println("노래부르는 사나 ");
    }

    public void compose() {
        System.out.println("작곡하는 사나 ");
    }

    @Override
    public void dance() {
        System.out.println("춤추는 사나");
    }

}

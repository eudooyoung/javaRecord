package com.multi.poly.c_mix.pattern.dto;

public class BlackPink implements Singer{

    public void sing() {
        System.out.println("노래부르는 제니 ");
    }

    public void compose() {
        System.out.println("작곡하는 제니 ");
    }

    @Override
    public void dance() {
        System.out.println("춤추는 제니");
    }

}

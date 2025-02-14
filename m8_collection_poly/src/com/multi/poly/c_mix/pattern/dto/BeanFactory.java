package com.multi.poly.c_mix.pattern.dto;

public class BeanFactory { // 개발자가 객체를 선택해서 생성하게 하기위한 전용 객체

    public static Object getBean(String name) {
        Singer singer = null;
        if(name.equals("twice")) {
            singer = new Twice();
        } else {
            singer = new BlackPink();
        }
        return singer;
    }
}

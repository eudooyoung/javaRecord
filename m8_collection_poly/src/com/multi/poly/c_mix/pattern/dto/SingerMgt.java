package com.multi.poly.c_mix.pattern.dto;

public class SingerMgt {

    private Singer singer; // 인터페이스를 참조용으로 생성?

    public Singer getSinger() {
        return this.singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public void perform() {
        if (singer != null) {
            singer.sing();
            singer.compose();
            singer.dance();
        } else {
            System.out.println("가수를 선택하세요!");
        }
    }
}

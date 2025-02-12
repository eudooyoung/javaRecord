package com.multi.a_classmake;

public class Tv {
    //    채널, 볼륨
//    온, 오프
    private String channel;
    private int volume;

    public void setChannel(String channel) { // 채널 설정
        this.channel = channel;
    }

    public void setVolume(int volume) { // 볼륨 설정
        if (0 < volume && volume < 10) {
            this.volume = volume;
        } else {
            System.out.println("1 에서 10 사이로 볼륨을 입력하세요");
        }
    }

    public String getChannel() {
        return this.channel;
    }

    public int getVolume() {
        return this.volume;
    }

    public void on() {
        System.out.println("전원을 킵니다.");
    }

    public void off() {
        System.out.println("전원을 끕니다.");
    }

    @Override // Object toString 매소드 재정의
    public String toString() {
        return "Tv " + channel + ", " + volume;
    }
}

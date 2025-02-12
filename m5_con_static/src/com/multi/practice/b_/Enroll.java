package com.multi.practice.b_;

public class Enroll {
//    필드
    private String sub;
    private String schedule;
    private String name;

//    생성자
    public Enroll() {
    }

//    매개 변수 생성자
    public Enroll(String sub, String schedule, String name) {
        this.sub = sub;
        this.schedule = schedule;
        this.name = name;
    }

//    getter and setter...
    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    toString override
    @Override
    public String toString() {
        return "Enroll{" +
                "sub='" + sub + '\'' +
                ", schedule='" + schedule + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

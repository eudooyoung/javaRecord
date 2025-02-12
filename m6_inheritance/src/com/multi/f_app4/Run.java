package com.multi.f_app4;

public class Run {
    public static void main(String[] args) {

        Person p = new Person();
        Person e = new Employee();
        Person m = new Manager();
        Person d = new Director();

        p.work();
        e.work();
        m.work();
        d.work();
    }
}

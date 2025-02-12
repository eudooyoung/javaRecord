package com.multi.practice.d_;

public class Found {
    public static void main(String[] args) {
//        객체를 배열로 생성하는 또 다른 방법. 이게 더 보기 좋은 듯.
        Employee[] work = {
                new Employee("밤순이", 25, 'f'),
                new Employee("밤식이", 24, 'm'),
                new Employee("밤실이", 26, 'f')
        };

        System.out.println(Employee.getCount());
        for (int i = 0; i < Employee.getCount(); i++) {
            System.out.println(work[i]);
        }
        System.out.println(Employee.getAvgAge());
    }

}

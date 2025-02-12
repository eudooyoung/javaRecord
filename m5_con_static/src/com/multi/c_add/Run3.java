package com.multi.c_add;

public class Run3 {
    public static void main(String[] args) {

        Employee member1 = new Employee("m01", "p011234567", "밤톨이", 35, 10000, 'm', "m1@test.com");

        System.out.println(member1);

        Employee member2 = new Employee("m02", "p021234567", "밤식이", 30, 10000, 'm', "m2@test.com");

        System.out.println(member2);

        Employee member3 = new Employee("m03", "p031234567", "밤순이", 33, 10000, 'f', "m3@test.com");

        System.out.println(member3);

        System.out.println(Employee.getTotalMembers());
        System.out.println(Employee.getAvgSalary());
        System.out.println(Employee.getSumSalary());

    }
}

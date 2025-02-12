package com.multi.practice.d_;

public class Employee {
    private String name;
    private int age;
    private char gender;

    private static int count;
    private static int sumAge;

    public Employee() {
        count++;
    }

    public Employee(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
        sumAge += age;
    }

    public static double getAvgAge() {
        return (sumAge / count);
    }



    public static int getSumAge() {
        return sumAge;
    }

    public static void setSumAge(int sumAge) {
        Employee.sumAge = sumAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

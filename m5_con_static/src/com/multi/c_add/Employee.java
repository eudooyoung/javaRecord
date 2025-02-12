package com.multi.c_add;

public class Employee {
    // 인스턴스 변수 (객체마다 개별적으로 가짐)
    private String id;
    private String pwd;
    private String name;
    private int age;  // 나이
    private double salary;  // 급여
    private char gender;    // 성별 ('M' 또는 'F')
    private String email;

    // static 변수 (모든 객체가 공유)
    private static int count;  // 총 회원 수
    private static double sumSalary;  // 총 급여 합계

    public Employee() { // selectnone: 기본 생성자 생성.. **필수**
        count++;
    }

    //    매개 변수가 있는 생성자
    public Employee(String id, String pwd, String name, int age, double salary, char gender, String email) {
        this.setId(id);
        this.setPwd(pwd);
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);

        this.gender = gender;
        this.email = email;

        count++;
    }

    //    필요 메소드
    //    총 회원 수 계산
    public static int getTotalMembers() {
        return count;
    }

    //    급여 평균 계산
    public static double getAvgSalary() {
        if (count == 0) { // 0으로 나누는 오류가 발생하지 않게
            return 0;
        } else {
            return sumSalary / count;
        }
    }

    //    getter setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("필수 값 입니다.");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd != null && pwd.trim().length() >= 6) {
            this.pwd = pwd;
        } else {
            throw new IllegalArgumentException("비밀번호를 6자리 이상으로 설정하세요.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("필수 값 입니다.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("나이를 0 이상으로 입력하세요");
        }
    }

    public double getSalary() {
        return salary;
    }

    //    **확인**
    public void setSalary(double salary) {
        if (salary >= 0) {
            if (this.salary > 0) {
                sumSalary -= this.salary; // 급여 교체
            }
            this.salary = salary;
            sumSalary += salary;
        } else {
            throw new IllegalArgumentException("급여는 0 이상으로 입력하세요");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public static double getSumSalary() {
        return sumSalary;
    }

    public static void setSumSalary(double sumSalary) {
        Employee.sumSalary = sumSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }

}

package com.multi.a_constructor;

/**
 * packageName    : com.multi.c_add.dto
 * fileName       : MemberDTO
 * author         : uni
 * date           : 2025-02-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-06        uni       최초 생성
 */
public class MemberDTO {
    private int number;            //회원번호
    private String name;            //회원명
    private int age;                //나이
    private char gender;            //성별 //male, female   남 /여  M ,F
    private double height;            //키
    private double weight;            //몸무게
    private boolean isActivated;    // 회원탈퇴여부 (활성화여부)

    //생성자 확인하기
    public MemberDTO() {
    } // 기본 생성자

    public MemberDTO(int number) {

        this.number = number;
    } // 회원 번호 받아오는 생성자

    public MemberDTO(int number, String name, int age) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("이름을 넣으세요");// 예외 처리, 유효성 검사
        }

        this.number = number;
        this.name = name;
        this.age = age;
    }

    public MemberDTO(String name, int age) {
        this.name = name;
        this.age = age;
    } // 회원명, 나이 받아오는 생성자

    public MemberDTO(String name, int age, char gender) { // 기존 생성자와 매개 변수가 겹치는 생성자
        this(name, age); // 겹치는 매개 변수를 가져오는 생성자: 순서 같아야 함
        this.gender = gender; // 추가로 받아오는 매개변수 저장
    }

    /*
     * 설정자(setter) 작성 규칙
     * : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
     *   호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
     *
     * [표현식]
     * public void set필드명(매개변수) {
     *     필드 = 매개변수;
     * }
     *
     * [작성예시]
     * public void setName(String name) {
     *     this.name = name;
     * }
     *
     * 접근자(getter) 작성 규칙
     * : 필드의 값을 반환받을 목적의 메소드 집함을 의미한다.
     *   각 접근자는 하나의 필드에만 접근하도록 한다.
     *   필드에 접근해서 기록된 값을 return을 이용하여 반환하며, 이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
     *
     * [표현식]
     * public 반환형 get필드명() {
     *     return 반환값;
     * }
     *
     * [작성예시]
     * public String getName() {
     *     return this.name;
     * }
     */

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException();// 예외 처리, 유효성 검사
        }
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", isActivated=" + isActivated +
                '}';
    }


}

package com.multi.c_add.dto;

public class Run {
    public static void main(String[] args) {
//DTO(Data Transfer Object)
        MemberDTO member = new MemberDTO(); // 멤버 객체

        member.setNumber(1);
        member.setName("까마귀");
        member.setAge(30);
        member.setGender('m');
        member.setHeight(182.5);
        member.setWeight(75);
        member.setActivated(true);

        System.out.println(member); // 오버라이딩된 toString 메소드, Object의 toString을 사용하면 현재 객체의 이름?이 저장된 주소값을 출력한다.


    }
}

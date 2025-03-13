package com.multi.e_enum;

public enum Day {

//    SUNDAY, MONDAY, TUESDAY,
//    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY

//    멤버 필드에 매개변수와 같이 선언?
//    멤버 필드 하나 하나가 다 객체 인듯?
//    본 예제에서는 String 타입을 매개변수로 받는 객체
    MONDAY("월요일"),
    TUESDAY("화요일"),
    FRIDAY("금요일");

    private final String koreanDay;

//     멤버필드 매개변수를 넘겨줘서 koreanDay 값을 지정해 주는 생성자
    Day(String koreanDay) {
        this.koreanDay = koreanDay;
    }


    public String getKoreanDay() {
        return koreanDay;
    }
}

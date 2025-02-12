package com.multi.e_enum;

public enum Day {
//    SUNDAY, MONDAY, TUESDAY,
//    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY

    MONDAY("월요일"),
    TUESDAY("화요일"),
    FRIDAY("금요일");

    private final String koreanDay;

    Day(String koreanDay) {
        this.koreanDay = koreanDay;
    }


    public String getKoreanDay() {
        return koreanDay;
    }
}

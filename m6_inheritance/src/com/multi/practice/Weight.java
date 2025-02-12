package com.multi.practice;

public enum Weight {
    LIGHT, MEDIUM, HEAVY;

    public String getWeight() {
        return switch(this) {
            case LIGHT -> "가벼운 파충류 입니다.";
            case MEDIUM -> "보통 파충류 입니다.";
            case HEAVY -> "무거운 파충류 입니다.";
        };
    }
}

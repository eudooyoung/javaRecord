package com.multi.practice;

public enum Size {
    SMALL, MEDIUM, BIG;

    public String getSize() {
        return switch (this) {
            case SMALL -> "작은 파충류 입니다.";
            case MEDIUM -> "보통 파충류 입니다.";
            case BIG -> "큰 파충류 입니다.";
        };
    }
}

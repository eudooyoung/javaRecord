package com.multi.practice;

public class MyCafe2 {
    public static void main(String[] args) {
        CafeCal2 cal = new CafeCal2();
        int price = 7000; //??
        int count1 = 5; // 오전 방문 고객
        int count2 = 4; // 오후 방문 고객

        cal.setCstmr(count1, count2);
        System.out.println(" 오늘 온 손님의 총 합은 " + cal.getCstmr() + "명 입니다.");
        cal.setCstmrDiff(count1, count2);
        System.out.println("손님 수 차이는 " + cal.getCstmrDiff() + "명 입니다.");
        cal.setAmTotal(count1, price);
        System.out.println("오전 결제 금액은 " + cal.getAmTotal() + "원 입니다.");
        cal.setPmTotal(count2, price);
        System.out.println("오후 결제 금액은 " + cal.getPmTotal() + "원 입니다.");
        cal.setTotal(cal.getAmTotal(), cal.getPmTotal());
        System.out.println("오늘 하루 총 결제 금액은 " + cal.getTotal() + "원 입니다.");
        cal.setDivTotal(cal.getTotal(), cal.getCstmr());
        System.out.println("1인당 결제 금액은 " + cal.getDivTotal() + "원 입니다.");

    }
}

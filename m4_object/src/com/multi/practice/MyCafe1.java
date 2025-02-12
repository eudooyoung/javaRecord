package com.multi.practice;

public class MyCafe1 {
    public static void main(String[] args) {
        CafeCal1 cal = new CafeCal1(); // 계산 객체 생성

        cal.sum1(2000, 5); // 커피 가격: 2000원, 총 주문 수량: 5
        cal.sum2(3000, 2); // 밀크티 가격: 3000원, 총 주문 수량: 2
        cal.total(cal.getSum1(), cal.getSum2()); // 총 결제 금액 계산
        cal.div(cal.getTotal(), cal.getCount()); // 인당 결제 금액 계산

        System.out.println("커피: " + cal.getSum1() + " 원");
        System.out.println("밀크티: " + cal.getSum2() + " 원");
        System.out.println("총: " + cal.getTotal() + "원");
        System.out.printf("인당 결제 금액: %.2f", cal.getDiv());
    }
}

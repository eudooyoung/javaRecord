package com.multi.practice;

public class CafeCal1 {
    private int sum1; // 메뉴 1  결제 금액
    private int sum2; // 메뉴 2  결제 금액
    private int count;
    private int total; //총 결제 금액
    private double div; // 각 메뉴 당 개인 결제 금액


    public void sum1(int price, int count) { // 메뉴 가격, 주문 수량을 받아와서
        this.sum1 = price * count; // 곱한 값을 메뉴 당 결제금액에 저장
        this.count += count; // 주문 수량++
    }

    public void sum2(int price, int count) { // 메뉴 가격, 주문 수량을 받아와서
        this.sum2 = price * count; // 곱한 값을 메뉴 당 결제금액에 저장
        this.count += count; // 주문 수량++
    }

    public void total(int sum1, int sum2) { // 메뉴 당 결제 금액을 각각 받아와서
        this.total = sum1 + sum2; // 총 결제 금액 계산
    }

    public void div(int total, int count) { // 총 결제 금액, 총 주문 수량을 받아와서
        this.div = (double) total / count; // 인당 결제금액을 더블형으로 계산
    }

    public int getSum1() { // 메뉴 1 결제 금액 반환
        return this.sum1;
    }

    public int getSum2() { // 메뉴 1 결제 금액 반환
        return this.sum2;
    }

    public int getTotal() { // 총 결제 금액 반환
        return this.total;
    }

    public double getDiv() { // 인당 결제 금액 반환
        return this.div;
    }

    public int getCount() { // 총 주문 수량 반환
        return this.count;
    }

}

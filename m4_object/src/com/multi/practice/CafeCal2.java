package com.multi.practice;

public class CafeCal2 {
    private int cstmr; // 총 방문 고객
    private int cstmrDiff; // 오전, 오후 방문 고객 수 차이
    private int amTotal; // 오전 결제 금액
    private int pmTotal; // 오후 결제 금액
    private int total; // 총 결제 금액
    private int divTotal; // 인당 결제 금액

    public int getCstmr() { // 총 방문 고객 반환
        return cstmr;
    }

    public void setCstmr(int count1, int count2) { // 총 방문 고객 계산
        this.cstmr = count1 + count2;
    }

    public int getCstmrDiff() { // 오전 오후 방문 고객 수 차이 반환
        return cstmrDiff;
    }

    public void setCstmrDiff(int count1, int count2) { // 오전 오후 방문 고객 수 설정
        if (count1 >= count2) { // 차이가 음수가 되지 않게 설정
            this.cstmrDiff = count1 - count2;
        } else {
            this.cstmrDiff = count2 - count1;
        }
    }

    public int getAmTotal() { // 오전 결제 금액 반환
        return amTotal;
    }

    public void setAmTotal(int count1, int price) { // 오전 결제 금액 설정
        this.amTotal = count1 * price;
    }

    public int getPmTotal() { // 오후 결제 금액 반환
        return pmTotal;
    }

    public void setPmTotal(int count2, int price) { // 오후 결제 금액 설정
        this.pmTotal = count2 * price;
    }

    public int getTotal() { // 총 결제 금액 반환
        return total;
    }

    public void setTotal(int amTotal, int pmTotal) { // 총 결제 금액 설정
        this.total = amTotal + pmTotal; // 오전 결제 금액 + 오후 결제 금액
    }

    public int getDivTotal() { // 인당 결제 금액 반환
        return divTotal;
    }

    public void setDivTotal(int total, int cstmr) { // 인당 결제 금액 설정
        this.divTotal = total / cstmr; // 총 결제 금액을 총 방문 고개 수로 나눔
    }
}

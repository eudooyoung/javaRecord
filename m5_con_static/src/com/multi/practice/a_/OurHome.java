package com.multi.practice.a_;

public class OurHome {
    public static void main(String[] args) {
        Daughter.setDadWallet(10000); // 아빠 지값 금액 설정
        Daughter d1 = new Daughter("밤순", 'f'); // 첫째 딸
        Daughter d2 = new Daughter("밤실", 'f'); // 둘째 딸

        System.out.println(d1); // 첫째 딸 정보 출력
        System.out.println(d2); // 둘째 딸 정보 출력

        System.out.println(Daughter.getCount()); // 딸 몇 명인지 출력
        System.out.println(Daughter.getDadWallet()); // 현재 아빠 지갑 금액 출력
    }


}

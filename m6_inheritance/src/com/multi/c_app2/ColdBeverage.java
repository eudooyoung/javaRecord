package com.multi.c_app2;

public class ColdBeverage extends Beverage {

    private int iceLevel; // 얼음의 양 (0: 얼음 없음, 1: 적게, 2: 보통, 3: 많이)
    private boolean isCarbonated;

    public ColdBeverage(String name, int price, int iceLevel, boolean isCarbonated) {
        super(name, price, false); // isHot은 항상 false로
        this.iceLevel = iceLevel;
        this.isCarbonated = isCarbonated;
    }

    public Boolean isCarbonated() {
        return isCarbonated;
    }

    @Override
    public void describe() {
        super.describe(); // Beverage의 describe 함수호출
        System.out.println("이 음료는 차가운 상태로 제공됩니다.");

        // 얼음의 양에 따른 설명
        System.out.println(switch (iceLevel) {
            case 0 -> "얼음 없이 제공됩니다.";
            case 1 -> "얼음이 적게 들어갑니다.";
            case 2 -> "얼음이 보통으로 들어갑니다.";
            case 3 -> "얼음이 많이 들어갑니다.";
            default -> "얼음 양을 알 수 없습니다.";
        });

        // 탄산 여부에 따른 설명
        if (isCarbonated) {
            System.out.println("이 음료는 탄산이 포함되어 있습니다.");
        } else {
            System.out.println("이 음료는 탄산이 포함되어 있지 않습니다.");
        }
    }
}

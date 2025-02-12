package com.multi.c_app2;

public class ColdBeverageEnum extends Beverage {

    private IceLevel iceLevel; // 얼음의 양 (0: 얼음 없음, 1: 적게, 2: 보통, 3: 많이)
    private boolean isCarbonated;

    public ColdBeverageEnum(String name, int price, IceLevel iceLevel, boolean isCarbonated) {
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
//        System.out.println(switch (iceLevel) {
//            case NONE -> "얼음 없이 제공됩니다.";
//            case LOW -> "얼음이 적게 들어갑니다.";
//            case MEDIUM -> "얼음이 보통으로 들어갑니다.";
//            case HIGH -> "얼음이 많이 들어갑니다.";
//            default -> "얼음 양을 알 수 없습니다.";
//        });
        System.out.println(iceLevel.getDesc());

        // 탄산 여부에 따른 설명
        if (isCarbonated) {
            System.out.println("이 음료는 탄산이 포함되어 있습니다.");
        } else {
            System.out.println("이 음료는 탄산이 포함되어 있지 않습니다.");
        }
    }
}

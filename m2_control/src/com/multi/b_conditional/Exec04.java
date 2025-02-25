package com.multi.b_conditional;


import java.util.Scanner;

public class Exec04 {
    public void method1() {
        /* switch문을 이용한 간단한 자판기 */
        System.out.println("=== Uni vending machine ===");
        System.out.println("  사이다   콜라   환타   바카스  생수  핫식스  ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");

        /* 원하는 음료를 문자열로 입력받음 */
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        /* 원하는 음료에 맞는 가격을 저장할 변수 */
        int price = 0;
// 화살표 표현으로 바꿔보기
        switch (selectedDrink) {
            case "사이다":
                price = 5000;
                break;
            case "콜라":
                price = 3000;
                break;
            case "환타":
                price = 2000;
                break;
            case "바카스":
                price = 1500;
                break;
            case "생수":
            case "핫식스":
                price = 2000;
                break;
            default:
                System.out.println("잘못 입력하였습니다.");
//                break;
                return;// 현재 메소드 코드를 더이상 실행하지 않고 이 메소드를 호출한 곳으로 빠져나감
        }

        int price1 = switch (selectedDrink) {
            case "사이다" -> 5000;
            case "콜라" -> 3000;
            case "환타" -> 2000;
            case "바카스" -> 1500;
            case "생수", "핫식스" -> 5000;
            default -> 0;
        };

        System.out.println(selectedDrink + "를 선택하였습니다.");
        System.out.println(price1 + "원을 투입하세요");

        sc.close(); // scanner에 사용된 스트림 닫기
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

//        switch (month) {
//            case (1):
//            case (2):
//            case (12):
//                System.out.println("겨울 입니다.");
//                break;
//            case (3):
//            case (4):
//            case (5):
//                System.out.println("봄 입니다");
//                break;
//            case (6):
//            case (7):
//            case (8):
//                System.out.println("여름 입니다.");
//                break;
//            case (9):
//            case (10):
//            case (11):
//                System.out.println("가을 입니다.");
//                break;
//            default:
//                System.out.println("잘못 입력하였습니다.");
//        }

        System.out.println(switch (month){
            case 1, 2, 12 -> "겨울입니다.";
            case 3, 4, 5 -> "봄입니다.";
            case 6, 7, 8 -> "여름입니다.";
            case 9, 10, 11 -> "가을입니다.";
            default -> "잘못 입력하였습니다";
        });
    }
}

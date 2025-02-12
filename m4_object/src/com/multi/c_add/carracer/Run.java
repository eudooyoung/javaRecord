package com.multi.c_add.carracer;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        /** 1. 자동차는 처음에 멈춘 상태로 대기하고 있는다.
         * 2. 카레이서는 먼저 자동차에 시동을 건다. 이미 걸려있는 경우 다시 시동을 걸 수 없다.
         * 3. 카레이서가 엑셀레이터를 밟으면 시동이 걸린 상태일 경우 자동차는 시속이 10km/h 증가하며 앞으로 나간다.
         * 4. 자동차가 달리는 중인 경우 브레이크를 밟으면 자동차의 시속은 0으로 떨어지며 멈춘다.
         * 5. 브레이크를 밟을 때 자동차가 달리는 중이 아니라면 이미 멈춰있는 상태라고 안내한다.
         * 6. 카레이서가 시동을 끄면 더 이상 자동차는 움직이지 않는다.
         * 7. 자동차가 달리는 중이라면 시동을 끌 수 없다. */

        /*객체는 카레이서와 자동차 객체이다.
         * 카레이서가 수신할 수 있는 메세지는 카레이서가 해야 할 일과 동일하다.
         * 1. 시동을 걸어라
         * 2. 엑셀레이터를 밟아라
         * 3. 브레이크를 밟아라
         * 4. 시동을 꺼라
         *
         * 자동차가 수신할 수 있는 메세지는 자동차가 해야 할 일과 동일하다.
         * 1. 시동을 걸어라
         * 2. 앞으로 가라
         * 3. 멈춰라
         * 4. 시동을 꺼라
         * */

        CarRacer racer = new CarRacer(); // 객체 생성
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======= 카레이싱 프로그램 ========");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            int no = sc.nextInt();
            switch (no) {
                case 1:
                    racer.startUp();
                    break;
                case 2:
                    racer.stepAccelator();
                    break;
                case 3:
                    racer.stepBreak();
                    break;
                case 4:
                    racer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
//                    sc.close();
//                    break continue 차이 확인
                    break;
                default:
                    System.out.println("잘못 선택하였습니다");
                    break;
            }
        }
    }
}

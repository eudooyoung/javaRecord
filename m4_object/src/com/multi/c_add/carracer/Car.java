package com.multi.c_add.carracer;

public class Car {

    private boolean isOn; // 초기값: false
    private int speed; // 초치값: 0

    public void startUp() {
        if (isOn) {
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true; // 호출되면 수행
            System.out.println("시동이 걸렸습니다.");
        }
    }

    public void go() {
        if (isOn) {
            System.out.println("차가 앞으로 나갑니다.");
            this.speed += 10;
            System.out.println("현재 차 시속은 " + this.speed + " km/h 입니다.");
        } else {
            System.out.println("시동이 걸려있지 않습니다. 시동을 걸어주세요.");
        }
    }

    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다");
            } else {
                System.out.println("차가 이미 멈춰 있습니다.");
            }
        } else {
            System.out.println("시동이 걸려있지 않습니다. 시동을 걸어주세요.");
        }


    }

    public void turnOff() {
        if (isOn) {
            if (this.speed > 0) {
                System.out.println("달리는 중에는 시동을 끌 수 없습니다. 먼저 차를 멈춰주세요.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜 주세요.");
            }
        } else {
            System.out.println("시동이 걸려 있지 않습니다.");
        }
    }
}

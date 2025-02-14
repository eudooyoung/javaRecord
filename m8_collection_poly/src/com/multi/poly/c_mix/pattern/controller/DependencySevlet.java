package com.multi.poly.c_mix.pattern.controller;

import com.multi.poly.c_mix.pattern.dto.BeanFactory;
import com.multi.poly.c_mix.pattern.dto.Singer;
import com.multi.poly.c_mix.pattern.dto.SingerMgt;

import java.util.Scanner;

public class DependencySevlet {

    public void doGet() {

//        Twice singer1 = new Twice();
//        singer1.compose();
//        singer1.sing();
//
//        BlackPink singer2 = new BlackPink();
//        singer2.compose();
//        singer2.sing();

//        인터페이스를 사용하여 결합도 낮추기
//        Singer singer = new Twice();
//        singer.compose();
//        singer.sing();
//        singer.dance();

//        팩토리 패턴:
//        객체 생성을 직접 생성하지않고 캡슐화해서 만들어 주는 방식
//        Scanner sc = new Scanner(System.in);
//        System.out.println("가수를 입력하세요");
//        String name = sc.nextLine();
//
//        Singer singer = (Singer) BeanFactory.getBean(name);
//        singer.compose();
//        singer.sing();
//        singer.dance();

//        전략 패턴:
//        객체의 행위를 바꾸고 싶은 경우 직접 수정하지 않고
//        컨텍스트 안에서 바꿔주면서 상호 교체가 가능하게 만드는 패턴

        Scanner sc = new Scanner(System.in);
        SingerMgt singerMgt = new SingerMgt();


        while(true) {
            System.out.println("가수를 입력하세요");
            String name = sc.nextLine();

            if(name.equalsIgnoreCase("exit")) break;

            Singer singer = (Singer) BeanFactory.getBean(name);
            singerMgt.setSinger(singer);
            singerMgt.perform();

        }
        sc.close();
    }
}

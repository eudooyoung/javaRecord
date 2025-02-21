package com.multi.d_api.c_practice;

@Service // IoC 컨테이너에 등록할 클래스
public class GreetingServiceImpl implements GreetingService {
    @Override
    public void sayHello() {
        System.out.println("Hello, IoC!");
    }
}

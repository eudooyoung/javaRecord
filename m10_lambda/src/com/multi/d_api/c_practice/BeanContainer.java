package com.multi.d_api.c_practice;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class BeanContainer {
    private final Map<Class<?>, Object> beans = new HashMap<>(); // 인터페이스 타입과 인스턴스를 저장할 맵

    public BeanContainer() {
        initializeBeans("com.multi.d_api.c_practice"); // 초기화 메서드 호출 시 패키지 이름 전달
    }

    // 지정된 패키지의 모든 클래스를 스캔하여 빈으로 등록하는 메서드
    private void initializeBeans(String packageName) {
        try {
            // 패키지 이름을 파일 시스템 경로로 변환
            String path = packageName.replace('.', '/');
            URL packageUrl = getClass().getClassLoader().getResource(path); // 패키지 경로 URL 가져오기

            if (packageUrl != null) { // URL이 유효한 경우
                // URL을 파일 디렉토리로 변환 (UTF-8로 디코딩)
                File directory = new File(URLDecoder.decode(packageUrl.getFile(), "UTF-8"));
                if (directory.exists() && directory.isDirectory()) { // 디렉토리가 존재하고 유효한 경우
                    // 디렉토리 내의 모든 파일을 탐색
                    for (File file : directory.listFiles()) {
                        // .class 파일인 경우에만 처리
                        if (file.getName().endsWith(".class")) {
                            // 파일 이름에서 클래스 이름을 추출
                            String className = packageName + "." + file.getName().replace(".class", "");
                            registerClass(className); // 클래스 등록 메서드 호출
                        }
                    }
                }
            }
        } catch (UnsupportedEncodingException e) { // 디코딩 예외 처리
            e.printStackTrace();
        }
    }

    // 클래스 이름을 받아 클래스 로드 후 어노테이션 확인 및 인스턴스 생성
    private void registerClass(String className) {
        try {
            Class<?> clazz = Class.forName(className); // 클래스 이름을 기반으로 Class 객체 생성
            // @Service 어노테이션이 붙어있고, 추상 클래스가 아닌 경우만 처리
            if (clazz.isAnnotationPresent(Service.class) && !Modifier.isAbstract(clazz.getModifiers())) {
                for (Class<?> interfaceClass : clazz.getInterfaces()) { // 클래스가 구현한 인터페이스 반복
                    Object instance = clazz.getDeclaredConstructor().newInstance(); // 인스턴스 생성
                    beans.put(interfaceClass, instance); // 인터페이스 타입을 키로, 인스턴스를 값으로 맵에 저장
                }
            }
        } catch (Exception e) { // 클래스 로드 및 인스턴스 생성 예외 처리
            e.printStackTrace();
        }
    }

    // 인터페이스 타입으로 등록된 인스턴스를 반환
    public <T> T getBean(Class<T> type) {
        return type.cast(beans.get(type)); // Map에서 타입에 맞는 인스턴스를 가져와 반환
    }
}

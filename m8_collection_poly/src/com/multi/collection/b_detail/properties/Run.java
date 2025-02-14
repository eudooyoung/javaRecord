package com.multi.collection.b_detail.properties;

import java.io.IOException;
import java.util.Properties;

public class Run {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();  //map의 형태
        properties.load(Run.class.getResourceAsStream("db.properties")); // 런클래스와 동일한 경로(클래스path)에 있는 파일을 읽어드린다.

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);




    }
}

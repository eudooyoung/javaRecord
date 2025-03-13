package com.multi.f_lib;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Crawling {
//    사이트연결
//    html 가져오기
//    원하는 데이터 추출 사용해보기

    public static void main(String[] args) {
//        Jsoup 라이브러리 커넥션 사용
        Connection con = Jsoup.connect("https://www.naver.com/");

        System.out.println("사이트 연결 성공");

        try {
            Document doc = con.get();
            System.out.println("페이지 다운로드 ------------");
            System.out.println(doc);

            Elements lists = doc.select("a");
            System.out.println(lists.size());

            for(int i =0; i < lists.size(); i++){
               Element tag = lists.get(i);
                System.out.println(i + ": " + tag.text());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        Jsoup 은 커넥션을 스스로 닫음.
    }
}

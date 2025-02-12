package com.multi.practice.c_;

public class Bbs {
    private String title;
    private String content;
    private String writer;

    private static int count;

    public Bbs() {
        count++;
    }

    public Bbs(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        count++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Bbs.count = count;
    }

    @Override
    public String toString() {
        return "Bbs{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}

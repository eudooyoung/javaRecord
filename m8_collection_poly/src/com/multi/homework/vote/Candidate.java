package com.multi.homework.vote;
//아래 후보자 클래스를 만들고 이전에 투표시스템을
//ArrayList로 후보자를 받아서 구현하는 방식으로 변경해보세요

public class Candidate {
    private final String name;  // 후보 이름
    private int votes;    // 후보의 득표수

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;  // 초기 득표수는 0
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void addVote() {
        votes++;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", votes=" + votes +
                '}';
    }
}

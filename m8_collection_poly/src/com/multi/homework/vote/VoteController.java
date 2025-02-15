package com.multi.homework.vote;

import java.util.ArrayList;
import java.util.List;

public class VoteController {

//    ArrayList 컬렉션 생성
    private List<Candidate> candidatelist = new ArrayList<>();

//    후보자 등록
    public boolean registerCandidate(String name) {
        boolean isRegistered = false; // 반환값 초기화

        if (candidatelist.isEmpty()) {  // 목록이 비어있을 경우 바로 등록
            Candidate candidate = new Candidate(name);
            candidatelist.add(candidate);
            isRegistered = true;
        } else { // 목록이 비어있지 않을 경우
            if (!hasSame(name)) { // 동일한 이름의 후보자가 없을 경우에만 새로 등록
                Candidate candidate = new Candidate(name);
                candidatelist.add(candidate);
                isRegistered = true;
            }
        }
        return isRegistered; // 중복된 후보자가 있을 경우 초기값 false를 그대로 반환
    }

//    내부 사용 메소드: 동일한 후보 목록이 있는지 여부를 불리언 값으로 반환
    private boolean hasSame(String name) {
        boolean hasSame = false;
        for (Candidate candidate : candidatelist) {
            if (candidate.getName().equalsIgnoreCase(name)) {
                hasSame = true; // 중복된 후보자가 있을 경우 초기값을 true로 변경하고 반복문 종료
                break;
            }
        }
        return hasSame;
    }

//    현재 사용중인 List 반환 메소드
    public List<Candidate> getCandidateList() {
        return this.candidatelist;
    }

//    후보자 삭제 메소드
    public boolean removeCandidate(String name) {
        boolean isRemoved = false; // 반환값 초기화
        for (int i = 0; i < candidatelist.size(); i++) {
            if (candidatelist.get(i).getName().equalsIgnoreCase(name)) { // 삭제 대상 후보자의 index를 특정하여 삭제
                candidatelist.remove(i);
                isRemoved = true;
                break;
            }
        }
        return isRemoved;
    }

//    투표 메소드
    public boolean voteCandidate(String name) {
        boolean isVoted = false;
        for (Candidate candidate : candidatelist) {
            if (candidate.getName().equalsIgnoreCase(name)) {
                candidate.addVote();
                isVoted = true;
                break;
            }
        }
        return isVoted;
    }

//    우승자 선정 메소드
    public void getWinner() {
        if (!isValid()) { // 모든 후보자의 투표수가 0일 경우
            System.out.println("아무도 투표를 하지 않은 것 같군요.");
        } else {
            StringBuffer winner = new StringBuffer(); // StringBuffer 객체 생성
            int maxVote = 0; // 초기값 할당

            for (int i = 0; i < candidatelist.size(); i++) {
                System.out.println(candidatelist.get(i));
                if (candidatelist.get(i).getVotes() > maxVote) {
                    maxVote = candidatelist.get(i).getVotes();
                    winner.setLength(0); // **StringBuffer 사용법 확인
                    winner.append(candidatelist.get(i).getName());
                } else if (candidatelist.get(i).getVotes() == maxVote) {
                    winner.append(", ").append(candidatelist.get(i).getName());
                }
            }
            System.out.printf("우승자: %s 총 득표수: %d표 \n축하합니다!", winner, maxVote);
        }
    }

//    투표가 유효한지 확인하는 메소드
    private boolean isValid() {
        boolean isValid = false;
        for (Candidate candidate : candidatelist) {
            if (candidate.getVotes() != 0) { // 투표수가 1이상인 후보자가 하나라도 있을 경우 유효
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}

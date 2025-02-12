package com.multi.pracitce;

public class practice1 {
    public static void main(String[] args) {
////        1-1 사각형 면적-------------------------------------------------------------------
//        {
//            int width = Integer.parseInt(JOptionPane.showInputDialog("사각형 가로의 길이를 입력하세요"));
//            int height = Integer.parseInt(JOptionPane.showInputDialog("사각형 세로의 길이를 입력하세요"));
//
//            System.out.println("사각형의 넓이는 " + (width * height) + " 입니다.");
//        }
////        1-2 적정 몸무게 계산-----------------------------------------------------------------
//        {
//            double height = Double.parseDouble(JOptionPane.showInputDialog("키를 입력하세요"));
//            double apprWeight = (height - 100) * 0.9;
//            System.out.printf("당신의 적정 몸무게는 %.2f 입니다.\n", apprWeight);
//        }
//          1-3 통신사 가입-------------------------------------------------------------------------
//        {
//            String carrier = JOptionPane.showInputDialog("통신사를 입력하세요");
//            String phoneNum = JOptionPane.showInputDialog("전화번호를 입력하세요(ex 010-1234-1234)");
//            String name = JOptionPane.showInputDialog("가입자 이름을 입력하세요");
//
//            String result = name + "님은 " + carrier + "에 " + phoneNum;
//            JOptionPane.showMessageDialog(null,result + "로 가입 되셨습니다.");
//
//        }
////        2. 친구소개--------------------------------------------------------------------------
//        {
//            String name = "홍길동";
//            int age = 200;
//            String addr = "홍천";
//            double weight = 88.8;
//            boolean isProgrammer = true;
//            char favColor = 'y';
//
//            String result = """
//                    {
//                    친구의 이름은 %s이고 나이는 %d이다.
//                    %s에 살고 있고, 몸무게는 %.1f이다.
//                    좋아하는 색은 %c가 들어가는 색이고, 프로그래머 여부는 %b이다.
//                    }
//                    """.formatted(name, age, addr, weight, favColor, isProgrammer);
//            System.out.println(result);
//        }
////         3-1 연산자 확인 -------------------------------------------------------------------------
//        {
//            int pw = 1234;
//            int inputPw = Integer.parseInt(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
//            boolean isCorrect = (pw == inputPw);
//            System.out.println((isCorrect) ? "PASS!" : "재입력");
//
//            double lastWeight = Double.parseDouble(JOptionPane.showInputDialog("어제 몸무게를 입력하세요"));
//            double presentWeight = Double.parseDouble(JOptionPane.showInputDialog("오늘 몸무게를 입력하세요"));
//            double diff = lastWeight - presentWeight;
//            boolean isSuccess = diff >= 2;
//            System.out.println(isSuccess ? "다이어트 성공" : "");
//
//            System.out.println((isCorrect && isSuccess) ? "오늘은 성공!" : "내일 다시 도전!");
//        }
////         3-2 성적 평균 구하기-----------------------------------------------------------------
//        {
//            int pE = Integer.parseInt(JOptionPane.showInputDialog("1학기 체육 점수를 입력하세요"));
//            int math = Integer.parseInt(JOptionPane.showInputDialog("1학기 수학 점수를 입력하세요"));
//            int eng = Integer.parseInt(JOptionPane.showInputDialog("1학기 영어 점수를 입력하세요"));
//            int kor = Integer.parseInt(JOptionPane.showInputDialog("1학기 국어 점수를 입력하세요"));
//
//            double avg = (double) (pE + math + eng + kor) / 4;
//            System.out.printf("1학기 평균 성적은 %.2f 입니다./n", avg);
//        }
////         3-3 원 넓이 구하기----------------------------------------------------------------------
//        {
//            double pi = 3.14;
//            double radius = Double.parseDouble(JOptionPane.showInputDialog("반지름을 입력하세요"));
//
//            double area = pi * (radius * radius);
//            System.out.printf("반지름의 길이가 %.2f인 원의 넓이는 %.2f 입니다/n", radius, area);
//        }
////         4-1 class 문제풀이----------------------------------------------------------------------
//        {
//            String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
//            String afterClass = JOptionPane.showInputDialog("오늘은 무엇을 하실 예정인가요?");
//
//            String plan = """
//                    오늘 %s에 수업 후, 나는 %s할 예정
//                    """.formatted(today, afterClass);
//            JOptionPane.showMessageDialog(null, plan);
//        }
////         4-2 class 문제풀이----------------------------------------------------------------------
//        {
//            int num1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 수를 입력하세요."));
//            int num2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 수를 입력하세요."));
//
//            int sum = num1 + num2;
//            double div = (double) num1 / num2;
//            int remain = num1 / num2;
//
//            String result = """
//                    두 수를 더한 값은 %d 입니다.
//                    두 수를 나눈 몫은 %.2f 이고, 나머지는 %d 입니다.
//                    """.formatted(sum, div, remain);
//            JOptionPane.showMessageDialog(null, result);
//        }
////        5-1 커피 계산
//        {
//            int orderCount = Integer.parseInt(JOptionPane.showInputDialog("커피를 몇 잔 주문하시겠어요?"));
//            int total = orderCount * 1000;
//            boolean isDiscount = total >= 20000;
//            String result = isDiscount ? "할인해 드릴게요." : "총 " + total + "원 입니다";
//            JOptionPane.showMessageDialog(null, result);
//        }
////        5-2 나이계산
//        {
//            int myAge = Integer.parseInt(JOptionPane.showInputDialog("현재 나이를 입력하세요"));
//            int nextAge = ++myAge;
//            boolean isOver = nextAge >= 100;
//            String result = isOver ? "이제부터 시작" : "아직 젊어요";
//            JOptionPane.showMessageDialog(null, result);
//        }
////        5-3 총액 계산
//        {
//            int waterCount = Integer.parseInt(JOptionPane.showInputDialog("생수의 개수를 입력하세요"));
//            int maskCount = Integer.parseInt(JOptionPane.showInputDialog("마스크의 개수를 입력하세요"));
//
//            int waterTotal = waterCount * 1000;
//            int maskTotal = maskCount * 2000;
//            int total = waterTotal + maskTotal;
//
//            String result = """
//                    생수값 %d 원, 마스크값 %d원 , 총 %d 원 입니다.
//                    """.formatted(waterTotal, maskTotal, total);
//
//            JOptionPane.showMessageDialog(null, result);
//        }
////        5-4 나는 짱
//        {
//            String sentence = "나는 짱";
//            for (int i = 0; i < 100; i++) {
//                System.out.println((i + 1) + "번째 " + sentence);
//            }
//        }
////        5-5 총합과 평균
//        {
//            int kor = 75;
//            int math = 50;
//            int sum = kor + math;
//            double avg = (double) (kor + math) / 2;
//            System.out.printf("국어점수와 수학점수의 총합은 %d, 평균은 %.2f 입니다.", sum, avg);
//        }
    }
}

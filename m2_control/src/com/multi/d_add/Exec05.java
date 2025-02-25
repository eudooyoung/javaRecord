package com.multi.d_add;

// String 메소드
// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
public class Exec05 {
	public static void main(String[] args) {

		//length() 문자열길이
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}


		//substring 문자열추출
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);


		String subject = "자바 프로그래밍";
		// indexOf 위치
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);

		location = subject.indexOf("자바");
		// 자바가 저장된 문자열을 찾을 수 없을 경우
//		문자열의 위치가 -1이 될수 없으므로 찾고자 하는 단어가 없다고 간주 할 수 있다.
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
        //contains 포함여부
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}

		//replace 교체
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		System.out.println(newStr);


	}
}

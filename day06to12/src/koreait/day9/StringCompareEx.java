package koreait.day9;

import java.util.Scanner;

public class StringCompareEx {
//문자열 찾기 기능을 연습 :한글 단어-> 영문 단어 출력
	public static void main(String[] args) {
		// 처리 조건 : 똑같은 문자열이 저장되지않게.
		String[] engArray = { "continue", "exit", "switch", "constant", "identifier", "array", "break", "print" };
		String[] korArray = { "계속", "종료", "선택", "상수", "식별자", "배열", "탈출", "출력" };

		Scanner sc = new Scanner(System.in);

		// String 클래스의 메소드 : equals(문자열 전체 비교), contains(문자열 부분적인 포함)
		String find; // 사용자 입력한 문자열 참조할 변수
		System.out.print("찾을 문자열을 입력해주세요(한글):");
		find = sc.nextLine();

		int i;
		for (i = 0; i < korArray.length; i++) {
			// 배열 인덱스 0~마지막까지 각각 참조문자열과 find 문자열 동일한지 비교.
			System.out.println("i=" + i + ",비교결과 =" + korArray[i].equals(find));

			// 사용자가 입력한 문자열이 배열 인덱스 몇번 문자열과 같은지 찾기

			if (korArray[i].equals(find)) {
				break;
			}
		}
		if (i < korArray.length) { //if(i==korAarray.length)
			System.out.println("find 입력 문자열은 " + i + "번 인덱스에 있습니다");
			System.out.println("영문 키워드는 "+engArray[i]+"입니다");
		} else {
			System.out.println("find 입력 문자열은 존재하지 않습니다");
		}
	}
}

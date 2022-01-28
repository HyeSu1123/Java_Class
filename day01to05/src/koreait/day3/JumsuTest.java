package koreait.day3;

import java.util.Scanner;

public class JumsuTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int korean = 0;
		int english = 0;
		int science = 0;
		int sum;
		
		
		System.out.println("[[성적 집계: 평균과 총점 구하기]]");
		System.out.println("성적을 입력하세요");
		System.out.print("국어->");
		korean = sc.nextInt();
		System.out.print("영어->");
		english =sc.nextInt();
		System.out.print("과학->");
		science =sc.nextInt();
		
		System.out.println("\n[처리되었습니다]");
		sum = korean + english + science;
		System.out.printf("총 점: %d\n",sum);
		System.out.printf("평 균: %d점 (%.2f점),과목수: %d\n",sum / 3,(double)sum / 3,3);
		//두번쨰 수식은 강제 casting이 필요하다
		//나눗셈 결과 실수가 되려면 데이터 적어도 1개가 실수 형식이어야 한다.
		
		sc.close();
	}

}











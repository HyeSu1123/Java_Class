package koreait.day3;

import java.util.Scanner;

public class IfTest {//boolean 자료형과 관계연산을 이용한 조건제어 연습

	public static void main(String[] args) {
		//if 문 형식1.if(조건관계식){...A...} else{...B...}
		// A는 조건관계식이 참일 때 실행하는 명령문들
		// B는 조건관계식이 거짓일 때 실행하는 명령문들
		// A,B가 명령문이 1개일 때는{ } 생략가능하다
		
		//응용: point가 100점 이상이면 회원등급이 VIP, 100점 미만일때는 일반회원
		int point;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("포인트를 입력하세요: ");
		point = sc.nextInt();
		
		//if문 사용
		System.out.print("회원등급: ");
		if(point >= 100) {
			System.out.println("VIP");
		}
		else
			System.out.println("일반회원");
		
		//point가 70 이상이면  +100을 추가 적립, 70미만이면 +110을 추가적립
		//70이상이면 "감사합니다"출력 미만이면 "또 오세요" 출력
		//실행할 명령이 2문장 이상일때 { } 사용
		if(point >=70) {
//			point = point + 100;
//			축약연산 -=, +=, *=, /=
			point += 100;
			System.out.print("감사합니다.😘");
		}else {
//			point = point + 110;
			point += 100;
			System.out.print("👐또 오세요~");
		}
		System.out.println("현재 포인트: " + point+ "입니다");
		
	}
}














package koreait.day3;

import java.util.Scanner;

public class ElseIfTest {

	public static void main(String[] args) {
		//if 문 형식2.
//		if(조건관계식){...A...}//조건 관계식1이 참일때
//		else if(조건관계식2){...B...}//조건 관계식1이 거짓,조건 관계식2는 참일때
//		else{...C...}//조건관계식1은 거짓,조건관계식2는 거짓일(모두 거짓일때)
		
		//응용 : point가 150이상이면 사과세트,100~149이면 귤세트, 50~99 과자세트를
		//0~49이면 5000원 상품권
		
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
		
		System.out.print("설날맞이 이벤트: ");
		if(point >= 150) {
			System.out.println("사과세트 증정😘");
		}
		else if(100 <= point) {//150보다 작은 경우
			System.out.println("귤 세트 증정👍");
		}
		else if(50 <= point ) {//100보다 작은 경우
			System.out.println("과자세트 증정👏");
		}else {	//50보다 작은 경우
			System.out.println("5000원 상품권 증정👐");
		}
		sc.close();
		
		//리소스(자원) : 입출력 클래스는 메모리 등 추가적인 자원을 사용하므로 해제가 필요하다.
	}

}

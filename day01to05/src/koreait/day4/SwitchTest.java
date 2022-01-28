package koreait.day4;

import java.util.Scanner;

public class SwitchTest {//if문을 switch문으로 바꾸는 연습

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.println("[[사용자 메뉴]]");
		System.out.println("1:장바구니  2:상품목록  3:결제  4:배송조회   5:종료");
		System.out.print("선택하세요: ");
		menu = sc.nextInt();
		
		//import 한번에하는 단축키:Crtl+Shift+o
		
		if	(menu == 1) {
			System.out.println("장바구니로 이동합니다");
		}
		else if(menu == 2) {
			System.out.println("상품목록으로 이동합니다");
		}
		else if(menu == 3) {
			System.out.println("결제화면으로 이동합니다");
		}
		else if(menu == 4) {
			System.out.println("배송조회로 이동합니다");
		}
		else if(menu == 5) {
			System.out.println("프로그램 종료합니다");
		}
		else {
			System.out.println("잘못된 번호입니다");
		}
		System.out.println("[[if문 프로그램을 종료합니다]]");
		
		//위의 조건식은 ==(같다) 비교로 여러개의 else if를 사용한다
		// -> 이런 경우 switch문을 사용할 수 있다
		System.out.println("\n\n --switch로 동일한 테스트입니다.--");
		switch (menu) {
		case 1:// 비교값으로 사용할 수 있는 데이터 형식: 정수형식, char, String(""기호 문자열)으로 표기한다
			System.out.println("장바구니로 이동합니다");
			break;// switch 종료
		case 2:
			System.out.println("상품목록으로 이동합니다");
			break;
		case 3:
			System.out.println("결제화면으로 이동합니다");
			break;
		case 4:
			System.out.println("배송조회로 이동합니다");
			break;
		case 5:
			System.out.println("프로그램 종료합니다");
			break;
		default://1,2,3,4,5 중 해당되는 값이 없을때 실행
			System.out.println("잘못된 번호입니다");

			break;
		}
		System.out.println("[[switch문 프로그램을 종료합니다]]");

		
		sc.close();
		
	}
//들여쓰기 자동 : Ctal + Shift + f
}


package koreait.day3;

import java.util.Scanner;// java.util 패키지의 Scanner 클래스를 메모리에 로드한다.
						// java.lang 패키지의 클래스들은 기본 클래스 - import 안한다.

public class KeyInputTest {// 키보드 입력으로 변수에 값을 저장하는 연습

	public static void main(String[] args) {
		// 키보드 입력은 표준 입력 : System 클래스 in 필드를 사용
		// -> 편하게 입력을 처리하기 위해 Scanner 클래스를 사용
		
		// 화면 출력은 표준 출력 : System 클래스 out 필드를 사용
		System.out.println();
			
		// import 필요
		Scanner sc = new Scanner(System.in);//필수로 외우기
		// sc는 변수 기본형 변수가 아니고 참조형(클래스타입)변수
		
		//입력실행을 위한 코드
		//키보드 입력 -> 변수에 저장
		int data;
		
		System.out.print("정수값 1개 입력하세요: ");
		data = sc.nextInt(); // 입력된 값을 정수로 변환(nextInt메소드)하고 data 변수에 저장
		
		System.out.println("입력하신 값은 "+ data +"입니다");
		
		//느낌으로 하는 미션..실수를 입력 받아서 출력(소수점 이하 4자리)
		double data2;
		System.out.print("\n실수값 1개 입력하세요: ");
		data2 = sc.nextDouble();
		System.out.printf("입력하신 값은 %.4f입니다",data2);
		
		sc.close();
	}
	//키보드 입력: 실행을 하면 커서가 보인다. 커서자리에 입력
	
}

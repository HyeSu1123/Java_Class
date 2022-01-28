package koreait.day15;

import java.util.Scanner;


public class ExceptionTest {

	public static void main(String[] args) {
		//Exception 요약 : 문법 오류는 아님..실행하면서 발생하는 오류이다.(발생 가능성을 고려해서 프로그래밍을 해야한다.)
		//-> 원인에 따라 다른 이름 XXXException 이 발생하고 이들은 Exception 클래스의 자식 클래스이다.
		//-> Exception이 실행중에 발생하게 되면 프로그램이 그 시점부터 중단된다.
		//->따라서 Exception을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야한다.
		
		
		//Exception 예시4 : Wrapper 클래스 (Short, Integer, Double)에는 문자열을 기본형타입으로 변환하는 메소드가 있다.
//		int b = Integer.parseInt("abc"); //Integer.parseInt("123");- >정상실행
		//정수로 변환할 수 없는 문자열 NumberFormatException이 발생한다.
//		System.out.println("b="+b);
		
		double c= Double.parseDouble("123,456,000.123");//Double.parseDouble("1234.567");//정상실행
		System.out.println("c="+c);
		
		
		
		//Exception 예시3
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //키보드 입력을 정수로 변환해서 변수에 저장한다.
		//사용자가 입력한 문자에 숫자외의 것이 있을때 InputMismatchException이 발생한다.
		
		
		//Exception 예시2
		int[] nums = new int[5]; //배열선언 : 요소 5개
		nums[5] = 100; 
		//실행 시 ArrayIndexOutOfBoundsException이 발생 -> 이유 : 인덱스 0~4만 됨.
		
		
		//Exception 예시1
		String message = null;
		char temp = message.charAt(0); // message 문자열에서 첫번째 글자 가져오기
		//실행 시 NullPointerException이 발생한다.-> 이유 : message 참조객체가 null이기 떄문이다.
		
		
		
	}

}

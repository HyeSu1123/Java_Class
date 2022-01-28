package koreait.day4;

import java.util.Scanner;

public class StringTest {
	//문자열 다루는 클래스 String 연습
	public static void main(String[] args) {
		System.out.println("Hi Java");//문자열 리터럴 "Hi Java"

		
		//문자열을 변수로 지정하고 싶다. 그러나 문자열은 int,double 같은 기본형식이 없고 클래스가 있다
		
		//name 변수는 int, double 기본타입이 아니고 클래스타입(참조타입) 변수입니다
		String name = "kim";//name 변수의 타입은 String(클래스)
		System.out.println("name = " + name);//문자열에서 + 연산은 문자열과 연결연산입니다.
		
		name = "choi";
//	메소드 형식 반환값 형식: 패키지명.클래스명.메소드명(인자형식)	
		//String 타입의 객체로 실행하는 메소드
		System.out.println("name = " + name);
		//void: println() 메소드 실행결과로 반환되는 데이터의 형식, 실행결과 반환값 없음
		System.out.println(name.length());		//int 타입 반환
		//int: length() 메소드 실행결과로 반환되는 데이터의 형식,실행결과 정수값 반환
		System.out.println(name.charAt(0));		//char 타입 반환, 지정된 위치의 문자
		//char: charAt()메소드 실행결과로 반환되는 데이터의 형식, 실행결과 문자 반환
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		
		char result = name.charAt(3);//charAt 메소드의 char 변환값 저장을 위한 변수서언
		System.out.println(result);//i
		
		System.out.println(name.equals("kim"));	//boolean 타입 반환, name과 같은지 비교
		//boolean: equals()메소드 실행결과로 반환되는 데이터의 형식, 실행결과 논리값
		System.out.println(name.equals("choi"));
		
		//문자열 입력
		Scanner sc = new Scanner(System.in);
		String nickname; //String 타입의 객체 즉 문자열을 참조하는 변수 -> nickname
		
//		nickname = sc.next(); //키보드로 입력 받은 문자열을 메모리에 저장하고 그 주소를 nickname이 참조한다.
		nickname = sc.nextLine(); 
		
		//next 메소드는 공백 또는 엔터까지만 저장
		//nextLine 메소드는 엔터 이전까지 저장
		System.out.println("nickname = "+ nickname);
		System.out.println("nickname length = "+ nickname.length());
		System.out.println("nickname equals = "+ nickname.equals("James"));
		System.out.println("일부 추출 = "+nickname.substring(4));//위치 4부터 끝까지
		System.out.println("일부 추출 = "+nickname.substring(4,8));//위치 4부터 8이전까지(8은 미포함)
		
		sc.close();
	}

}

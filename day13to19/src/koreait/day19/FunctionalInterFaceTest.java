package koreait.day19;

import java.util.Random;

public class FunctionalInterFaceTest {
//함수형 인터페이스 : 인터페이스 중에 추상메소드가 1개인 것은 다른 프로그래밍 언어에서 사용되는 함수 형식으로 표현할 수 있다.
//	자바에서는 람다식이라고도 부른다. 가독성, 간결성을 위해서 사용한다.
	public static void main(String[] args) {
		//WdbSearch 인터페이스는 함수형 인터페이스이다.
		//메소드 이름은 생략하고 (인자선언) -> {메소드의 실행내용} 과 같은 형식으로 작성한다.
		
		WebSearch w = new WebSearch() {
			
			@Override
			public void search(String url) {
				System.out.println("당신의 서치는"+url+"입니다");
				
			}
		};
		
		w.search("네이버(naver)");
		
		//함수형 인터페이스를 익명클래스보다 더 간단한 형식으로 하는 람다식은 아래와 같다.
		
		w = (String url) -> {System.out.println("your searching:"+url+"!!");};
		
		w.search("Youtube");

		//1.FuncInterfaceA를 익명클래스로 객체 생성한다.
		
		FuncInterfaceA fia = new FuncInterfaceA() {
			
			@Override
			public int methodA(int a, int b) {
				System.out.println("이 메소드는 2개 인자값을 곱해서 결과를 리턴한다");
				return a*b;
			}
		};
		int result = fia.methodA(11, 12);	//리턴값이 있는 메소드는 출력 or 변수에 저장
		System.out.println("결과는: "+result);
		//2.람다식으로 객체를 생성한다.: 추상메소드는 두개의 정수값을 범위로 하여 난수를 만들고 리턴한다.
		//						 추상메소드가 여러개인 인터페이스는 람다식으로 못한다. 익명클래스는 가능하다.
		fia = (int a, int b) -> {
			Random r = new Random();
			return r.nextInt(b-a+1)+a;
		};
		System.out.println("결과:"+fia.methodA(10, 45));
		

	}

}

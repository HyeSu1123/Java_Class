package koreait.koreitday_interface;

public interface InterfaceA {

	//인터페이스 (클래스의 상속, 추상 클래스의 추상메소드 관련성있는 내용이다.)
	/*자바 인터페이스의 특징
	 * 1. 객체를 생성하지 않는다.		
	 * 2. 필드는 상수만 있다			public static final 생략한다. 무조건 상수라서
	 * 3. 추상메소드를 가지고 있다		public abstract 키워드 생략 
	 * 4. static 메소드와 인스턴스 메소드(반드시 키워드default)도 사용할 수 있다
	 * 
	 * 객체지향 프로그래밍 특징 : 다형성. 인터페이스는 다형성 구현을 위한 대표적인 방법입니다.
	 * */
	
	//2.
	int SIZE=10;
	
	//3.
	void methodA();
	int methodB(int num);
	
	//4. 접근 한정자: public
	static void methodC() {
		System.out.println("나는 static 메소드입니다");
	}
	
	default void methodD(String message) {
		System.out.println("수신된 메세지는"+message+"입니다.");
	}
	
	
}

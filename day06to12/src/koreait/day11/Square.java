package koreait.day11;

public class Square extends Shape{


	protected String color; 	//자식 클래스 Sqare만 갖는 필드
								//Square 클래스가 부모, 그 자식 클래스들은 다른 패키지에서도 사용할 수 있는 필드
	
//	public Square(String color) {
//		//super() 자동 호출 -> 오류
//		this.color = color;
//	}

	public Square(String shapeName, int width, int height, String color) {
		super(shapeName, width, height);
		this.color = color;
	}
	
	public Square(String color) { //자식 클래스는 상속 필드, 상속 메소드 외에 다른 필드와 메소드를 정의할 수 있다
		super("정사각형",10,10);
		this.color = color;
	}
	
	public void printWidth() {
		System.out.println("정사각형 너비 = "+ getWidth()); //부모 클래스의 필드와 메소드는 자식 클래스가 바로 접근할 수 있다(super 키워드 생략)
	}
	public void printEtc() {
		System.out.println("기타정보 : "+etc); //부모 클래스의 필드와 메소드는 자식 클래스가 바로 접근할 수 있다(super 키워드 생략)
	}
	
	public int getArea() {	//오버라이드 메소드(재정의)
		return getWidth()*getWidth();
	}
	
}

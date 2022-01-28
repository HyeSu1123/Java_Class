package koreait.day11a;

import koreait.day11.Shape;

public class Triangle2 extends Shape{

	public Triangle2(String shapeName, int width, int height) {
		super(shapeName, width, height);
		
	}

	public void print() { //getShapeName( ): Shape 클래스의 필드가 private 접근자이기문에 저렇게 사용
		System.out.println("도형이름 : "+ getShapeName() 
		+ ",너비"+ getWidth() +",높이"+ getHeight());
		
		System.out.println("특별한 변수 테스트-(ShapeTest에서 출력)------");
//		System.out.println("기타정보 : "+ etc);	//다른 패키지 클래스의 기본 접근자 필드는 사용 못한다.
		System.out.println("카운트"+count);		//다른 패키지 클래스이지만 자식 클래스이므로 사용 
		
	}
	public int getArea() {		/***부모클래스가 정의한 형식의 메소드를 수정(변경)한다: override(오버라이드)***/
		return(getHeight() * getWidth())/2;
	}
	public double getAreaDouble() {	//같은 이름의 서로 다른(형식) 메소드가 있으면 오류
		return(double)(getHeight() * getWidth())/2;
	}
	}
	

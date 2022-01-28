package koreait.day13;

public class AbstractTest {

	public static void main(String[] args) {
		
//		Ashape ash = new AShape();//추상클래스는 new로 객체 생성 못한다. 오류
		
		AShape tri = new ATriangle(); //ATriangle()은 자식클래스지만 부모타입으로 참조할수있다
		tri.setShapeName("작은 삼각형1");
		
		ATriangle atri = (ATriangle) tri;
		atri.setWidth(20);
		atri.setHeight(40);
		
		System.out.println("넓이1 :"+tri.getArea());
		System.out.println("넓이2 :"+atri.getArea());
		
		//새로만든 triangle()메소드는 어떤 참조변수로 실행해야 할까 atri
		System.out.println("테스트 메소드 실행:"+atri.triangle());
		
		
		AShape square = new ASquare();
		square.setShapeName("사각형");
		ASquare asq = (ASquare) square;
		
		System.out.println("테스트 메소드 실행:"+asq.square());
		
		asq.setWidth(30);
		System.out.println("넓이1:"+square.getArea());
		System.out.println("넓이2:"+asq.getArea());
		
		
	}

}

package koreait.day11;

public class Shape {	//상위클래스 -> 상속받은 클래스는 Triangle, Square

	static final int MAX_WIDTH=100;	//변하지 않는 값.(상수) 모든 객체가 같은 값 사용
	static final int MAX_HEIGHT = 200;
	
	private String shapeName;	//도형이름
	private int width;;			//도형의 크기 중 너비
	private int height;			//도형의 크기 중 높이
	String etc = "연습용";			//기본 접근자 (패키지같은 클래스에 사용할 수 있다.
	protected int count = 12;	//자식 클래스이면 어느 패키지 이던지 사용할 수 있다
	
	
	//필드 초기화 생성자 : 필드값은 생성자로만 초기화한다.(예시 : 요구 조건은 초기화된 필드값은 변경 하지 않는다)
	public Shape(String shapeName, int width, int height) {
		this.shapeName = shapeName;
		this.width = width;
		this.height = height;
	}
	
	//getter 메소드만 허용 (setter 는 허용 안함(요구 조건은 초기화된 필드값은 변경 하지 않는다))
	public int getHeight() {
		return height;
	}
	public String getShapeName() {
		return shapeName;
	}
	public int getWidth() {
		return width;
	}
	
	//넓이를 구해서 리턴해주는 메소드 : getArea
	public int getArea() {
		return width * height;
	}
	//기본 생성자를 사용할 수 없는 클래스
}

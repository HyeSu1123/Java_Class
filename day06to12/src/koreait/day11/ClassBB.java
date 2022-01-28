package koreait.day11;

public class ClassBB extends ClassB{

	//부모 (상위클래스) 클래스가 사용하지 않는 생성자를
	//자식 (하위클래스) 클래스가 사용할 수 없다.
	// -> ClassBB는 커스텀 생성자(인자 1개) 만 가능
//	public ClassBB() {
//		// 오류 : super(); 호출하는데 부모클래스의 생성자가 없다.
//	}
	
	public ClassBB(int ab) {
		super(ab);		//super : 부모클래스의 생성자 호출
		super.ab=ab; //부모 클래스에 기본 생성자 있을때 가능.
		
	}
	//this : 현재 자신의 객체
	//super : 상위클래스 객체
}
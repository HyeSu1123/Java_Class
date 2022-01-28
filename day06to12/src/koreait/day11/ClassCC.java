package koreait.day11;

public class ClassCC extends ClassC{
	
	int cc; //자식 클래스만의 필드
	
//	public ClassCC(int c) {
//		super(c); //부모 클래스의 생성자를 부르는건데 ClassC에는 커스텀클래스가 없다
//	}
	
	public ClassCC(int cc) {
		this.cc = cc; //현재 자식 클래스의 필드를 다루는 것을 가능
	}
}
//super() : 부모클래스 생성자 CalssC() 호출
//super(c) :  부모클래스 생성자 CalssC(c)호출
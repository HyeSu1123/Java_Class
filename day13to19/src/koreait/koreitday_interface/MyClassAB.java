package koreait.koreitday_interface;

//이 클래스는 2개의 인터페이스를 사용한다.
//상속의 다중상속이 불가하지만 인터페이스는 다중구현이 가능하다.
public class MyClassAB implements InterfaceA,InterfaceB{
//인터페이스의 추상메소드 구현
	
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int methodB(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void methodBa() {
		// TODO Auto-generated method stub
		
	}
	
	

}

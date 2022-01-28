package koreait.day14;

public class Puppy extends Animal{ 

	static final String TYPE="강아지";
	
	public Puppy() {}
	
	public Puppy(String name, String color) {
		super(name,color);
	}
	
	@Override
	public void sound() { //인스턴스 메소드는 현재 객체의 필드값으로 처리한다.
		//추상메소드 구현
		System.out.println("멍멍🐕");
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-Type:"+TYPE;//super는 Animal클래스 toString
	}
	
}

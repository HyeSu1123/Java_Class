package koreait.day11;

public class Puppy extends Animal {
	
	private String type;
	
	//생성자 생략 가능하다 - default 생성자 super()호출
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void test() {
		System.out.println("Puppy : test 메소드");
	}
	
	@Override// @ : 어노테이션은 명령실행에 도움을 주는 주석
	public void sound() {
//		super.sound(); //원하지 않는다면 지우면 된다.
		System.out.println("🐶멍멍");
	}

}

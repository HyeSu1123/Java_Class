package koreait.day11;

public class Cat extends Animal{

	
	public Cat() {
		//생략된 실행 명령어는 super()
		System.out.println("냐옹이가 생성되었습니다");
	}
	public void sound() {
		System.out.println("🐱야옹야옹" + getName());
	}
}

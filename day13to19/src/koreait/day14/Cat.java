package koreait.day14;

public class Cat extends Animal {

	static final String TYPE="고양이";
	
	public Cat() {}
	
	public Cat(String name, String color) {
		super(name,color);
		
	}

	@Override
	public void sound() {
		System.out.println("야옹🐱");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-Type:"+TYPE;//super는 Animal클래스 toString
	}
	
}

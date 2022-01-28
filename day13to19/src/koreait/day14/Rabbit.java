package koreait.day14;

public class Rabbit extends Animal {
	static final String TYPE="토끼";
	
	public Rabbit() {
	}
	
	public Rabbit(String name, String color) {
		super(name,color);
	}
	
	@Override
	public void sound() {
		System.out.println("조용하길래 봤더니 풀을 먹고있다.🍀🐇");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-Type:"+TYPE;//super는 Animal클래스 toString
	}
}

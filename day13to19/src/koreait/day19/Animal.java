package koreait.day19;

public abstract class Animal { 
								//abstract 메소드는 유,무 와 상관없이 객체는 직접 생성 못한다.(구체화 되지 않은 상태이기 때문에)
								//abstract 클래스는 abstract 메소드를 갖는것이 일반적이다
								//추상 메소드를 자식클래스가 구현하면 구체화 된 것이다.
								//*추상클래스 요약: 추상클래스는 클래스의 상속에서만 다룬다, 추상클래스는 부모 클래스.(추상화된 상태)
								// 자식 클래스는 부모클래스에 추상메소드가 있을 때 반드시 재정의(구현)해야한다.
								//이렇게 구현 했을때 구체화 된것이고 객체 생성할 수 있다.
								//(참고) 객체생성 연산자는 new이다.*/
	static final String TYPE = "아직모름";
	
	//필드 :  공통적인 값
	private String name;
	private String color;
	
	//생성자
	public Animal() {
		System.out.println("새로운 반려동물이 태어났습니다");
	}
	public Animal(String name) {
		this();//	자기자신 객체의 기본 생성자 메소드 호출
		this.name=name;
	}
	
	
	public Animal(String name, String color) {
		this(name); 
		this.color=color;
	}
	
	//추상메소드
	public abstract void sound();
	
	//Object 클래스의 toString() 메소드 오버라이드
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]-Type: ";
		//TYPE 필드값을 여기서 출력하면 이 코드가 있는 Animal의 TYPE이 출력된다
		//자식 클래스의 TYPE필드값을 출력 안한다.
		//결론 TYPE 필드는 각각 자식 클래스 toString에서 출력한다
	}
	
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}

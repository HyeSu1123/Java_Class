package koreait.day10;

public class MyClass3Test {
	
	public static void main(String[] args) {
		MyClass3 my = new MyClass3();
		my.setAge(19);//age 필드값 저장
		my.print();
		int age = my.getAge();//age 필드값을 가져올때
		System.out.println("나이"+age);
		
		my.score=123;// 자바에서는 사용하지 않는방법. 상수만 필드를 직접 사용한다 static final 
	}

}

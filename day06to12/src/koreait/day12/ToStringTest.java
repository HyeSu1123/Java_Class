package koreait.day12;

public class ToStringTest {

	public static void main(String[] args) {
		Member member = new Member();
		member.id = 20220100;
		member.name = "누누";
		member.print();
		//member.print(); 지금까지 만들었던메소드: 필드 출력용도.
		
		System.out.println("toString 결과:"+member.toString());
		//오버라이드 하기전 결과 
		//koreait.day12.Member@251a69d7(패키지명.클래스명@객체구별값16진수) 
		
		//재정의하고 나서 toString 결과
		//Member [id=20220100, name=누누]
		
//		System.out.println("toString 생략:"+member);
	}

}

package koreait.day10;

public class MyClass2 {

		//접근 권한 연습
		private int age;	//private : 다른 클래스에서 사용못한다. 나(현재클래스)만 사용
		String name;		//default(package) : 다른 패키지에서 사용못한다. 이웃처럼 사용
		public int score;	//public : 어디서나 사용가능. 공공의, 공용의, 다같이 사용 
		
		
		//생성자 메소드 : public, default 에 따라 접근권한이 설정된다. 
		//(자동으로 숨어있는)기본생성자 메소드의 접근권한 public
/*		
		MyClass2() {
			이렇게 수정하면 다른 패키지에서 객체생성을 못한다.
		}*/
	}

package koreait.day1;

public class PrintTest2 {

	public static void main(String[] args) {
		
		//day02: 출력메소드 종료
		System.out.print("Hello Java");//줄바꿈 없음
		System.out.print("------\t--------\n");
		//\n은 줄 바꿈문자
		//\t는 탭문자
		System.out.printf("%s","End");
		//printf: format적용(%기호 사용해서 무엇을 사용할지 결정하는것)
		System.out.printf("%10s\n","End");//printf : format(서식)적용
		System.out.printf("%-10s %5s\n","End","**");
		//s는 문자열
		//데이터 형식: 문자열(문장)," " 기호 안에 작성. String
		
	}

}
//1. 클래스 : 대문자로 시작한다. 특정기능을 갖고있다.->메소드로 제공한다.(String,System)
//2. 메소드 : 소문자로 시작한다. ()소괄호가 이름 뒤에 나온다.(println)
//()안에는 실행에 필요한 추가적인 데이터가 작성되기도 한다.
//형식은 클래스.메소드() 와 같다
//3. System.out.ptintln은 특별한 경우. 문법설명은 이후 진도에서...
//println 메소드는 out에 속해있다.
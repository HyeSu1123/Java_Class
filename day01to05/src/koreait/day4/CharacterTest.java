package koreait.day4;

public class CharacterTest {
//언어별로 사용하는 문자는 컴퓨터로 처리하는 문자 인코딩을 위한 문자 코드가 있다
//가장 많이 사용한는 문자 코드 : UTF-8, 영문자/숫자/기호 : ASCII(아스키코드)와 같다
	public static void main(String[] args) {
		//char 형식은 문자형입니다
		char ch1 = 'a'; //리터럴은 작은 따옴표
		char ch2 = 97; //char 형식은 정수값으로는 0~65535까지 저장할 수있다(2바이트)
		
		//예를 들면 한글은 AC00~D7A3
		char ch3 = '\uac00';//16진수 표기, 유니코드 표시:\\u 이고 ac00은 16진수 값 1자리 4비트
		char ch4 = 44032;//위의 ac00에 해당하는 10진수 값(일반적인 정수값)
		char ch5 = '가';
		
		//char 변수 출력은 대입 리터럴과 상관없이 모두 문자
		System.out.println("ch1="+ ch1);
		System.out.println("ch2="+ ch2);
		System.out.println("ch3="+ ch3);
		System.out.println("ch4="+ ch4);
		System.out.println("ch5="+ ch5);

		System.out.println("한글 UTF-8코드 마지막 글자:힣");
		ch3='힣';
		ch4='\ud7a3';
		ch5=55203;
		
		System.out.println("ch3="+ ch3);
		System.out.println("ch4="+ ch4);
		System.out.println("ch5="+ ch5);
		
		System.out.println("한글 코드는 모두 몇개일까?"+(ch5-44032+1)+"개");
		
		
		//char 형식의 데이터 연산 : 정수 데이터로 하는 연산 가능
//		ch1 = (char)(ch1+1);//오류? -> ch1 = ch+1; 
		
		ch1++; //ch1 변수값에 1을 더해서 다시 ch1에 저장한다
		ch3='가';
		ch3++;
		System.out.println("\n\nchar 변수에 1을 더한 결과");
		System.out.println("ch1="+ ch1+" 문자코드값="+(int)ch1);
		//char 형식을 int로 캐스팅하면 결과는 문자코드값
		System.out.println("ch3="+ ch3+" 문자코드값="+(int)ch3);

		
	}

}

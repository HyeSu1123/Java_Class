package koreait.day6;

public class VariableTest {
//변수가 선언되는 위치로 특성을 이해하는 연습
//static , final(최종적인)키워드 이해하기

	static int gval = 34;	//클래스 소속으로 선언된 변수(필드), 위치로 보면 전역(global)변수
	int dval=123; //전역변수는 필드
	
	final int fval=23;
	static final int fval2=456; //값을 변경할 수 없는 변수 :상수
//	final int test; //오류? final 변수는 꼭 초기값을 저장한다.
	
	public static void main(String[] args) {
		
		int sum=100;
		
		//1. while, for, if {} <- 블록 안에서 선언된 변수: 지역변수
		//2. method{} 블록 안에서 선언된 변수: 지역변수
		
		while(true) {
			int k=12;
			System.out.println("k="+k);
			if(k==12) break;
			System.out.println("sum="+sum);//main 메소드{}안에서는 어디에서나 사용가능
	
			
		}	
		
//		System.out.println("k="+k);//오류 : 선언된 {} 지역을 벗어났습니다
		System.out.println("전역변수 gval= "+gval);
		
		System.out.println("final 변수 fval2="+fval2);
//		fval2=123; //오류 final 변수는 값을 변경 못한다.
		
		//static final 예시
		System.out.println("Byte 정수의 메모리의 할당크기: "+ Byte.BYTES);
		System.out.println("Byte 정수의 최소값: "+ Byte.MIN_VALUE);
		System.out.println("Byte 정수의 최대값: "+ Byte.MAX_VALUE);
		
		//상수 : 의미있는 값(변하지 않는 값)들을 이름으로 표기
		//클래스의 일반적으로 기본형 상수필드를 대문자로 표기한다.
		
	}
	//3. 메소드 인자로 선언된 변수: 해당 메소드 {} 안에서 사용하는 지역변수
	static void methodA(int a) {
		int b=3; //methodA()의 지역변수
		System.out.println("b="+b);
		System.out.println("전역변수 gval= "+gval);
//		nonStatic(123); static이 없어서 오류
	}
	
	void nonStatic(int a) {
		System.out.println("nonStatic-------");
		System.out.println("전역변수 dval="+dval);
		System.out.println("전역변수 gval= "+gval);
		methodA(123);
		
		System.out.println(fval);
		System.out.println("-------------------");
//		fval=100;//오류?fval 변수는 값을 변경할 수 없다 -> final 키워드를 사용하고 있기때문에
	}
	//static에서는 static만
	//nonstatic에서는 static, nonstatic 둘다 사용

}

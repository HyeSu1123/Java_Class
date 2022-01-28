package koreait.day2;

public class DoubleVarTest {

	public static void main(String[] args) {
		//실수 타입 변수를 연습
		//1. 선언
		float p1;
		double p2;
		//2. 데이터 저장
		p1 = 3.1415F;//float 형식으로 데이터를 표시할 때에서는 F를 표기
		p2 = 3.1415;
		//3. 변수 사용:연산
		p2 = p2 * 1.1;
//		p1 = p1 * 1.1;//등호 오른쪽 사칙연산 결과는 double 이다.
		//double 결과를 float에 저장 못하기떄문. 
//		작은방에 큰방을 넣을수는 없다
		
		//p2 출력
		System.out.println("변수 p2 = "+p2);//+ 는 연결기호이다
		System.out.println("변수 p1 = "+p1);
		
		//실제 기계어로 실수를 표현하고 연산하는 방식은 복잡한 형식이 있다.
		//그래서 실제 결과와는 다를 수도 있다
		System.out.println(0.1+1.6);
		System.out.printf("%4.2f",(0.1+1.6));//%f는 실수 형식. 전체 4자리, 소수점이하 2자리
		System.out.println();
		//실수의 특별한 연산 결과
		System.out.println("Infinity(무한대) : 0.0으로 나눌 때");
		System.out.println(3.0/0.0);
		System.out.println("NaN(Not a Number : 제수,피젯수 모두 0.0으로 나눌 때)");
		System.out.println(0.0/0.0);
		System.out.println("0.0 : 0.0을 다른 수로 나눌 때");
		System.out.println(0.0/3.0);
		
		System.out.println();
		
		System.out.println("정수는 부모가 0이면 나눌수가 없다");
//		System.out.println(3/0);
//		System.out.println(0/0);
		System.out.println(0/3);
		
		//정수와 비교할 내용
		short s1 = 11;
//		s1 = s1 + s1;	//11+11결과를 s1에 저장하려고 한다
		
		float f1 = 1.2F;
		p1 = p1 + p1;
		
		//데이터 형식의 변환 : 캐스팅
	}
}

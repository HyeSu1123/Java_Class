package koreait.day4;

public class ForTest1 {
//반복되는 명령들을 실행하는 for문을 연습
	public static void main(String[] args) {
		
		//명령문의 반복 1
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		//명령문의 반복 2
		System.out.println("Hello!(1)");
		System.out.println("Hello!(2)");
		System.out.println("Hello!(3)");
		System.out.println("Hello!(4)");
		System.out.println("Hello!(5)");
	//i를 for() 안에서 선언하면 for에서만 사용할수있다
		for(int i=0;i<5;i++) {//반복 횟수 제어를 위한 변수 i : i는 0이 초기값, 조건:i<5, 증감 i++
			System.out.println("Hello!!!!!");//반복되는 부분
		}
		for(int i=0;i<0;i++) {//조건 i<0 -> 0<0??처음부터 조건이 거짓이라서 찍히지않음
			System.out.println("헬로우~!!!!!");
		}
		for(int i=0;i<5;i++) {
			System.out.println("헬로우("+i+")");
			//i=0, 0<5 참 -> 출력실행 ->i증가
			//i=1, 1<5 참 -> 출력실행 ->i증가
			//i=2, 2<5 참 -> 출력실행 ->i증가
			//i=3, 3<5 참 -> 출력실행 ->i증가
			//i=4, 4<5 참 -> 출력실행 ->i증가
			//i=5, 5<5 거짓 -> for문 종료
		}
		//직접 테스트 13~17 for으로 출력
		for(int i=1;i<=5;i++) {//초기값을 1로 하고 조건식 i<6,또는 i<=5도 가능
			System.out.println("*Hello!("+i+")");//(i+1)도 가능
		}
		// 조건식에 변수를 활용
		int end = 100;
		for(int i=1;i<end;i+=2) {//i=i+2
			System.out.println("i="+i);
			//초기값 i가 0일때 짝수값 1일때 홀수값
		}
	}
}

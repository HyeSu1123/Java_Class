package koreait.day5;

public class WhileTest {

	public static void main(String[] args) {
		System.out.println(" for문 출력");
		for(int i=0;i<5;i++)			//i를 for() 안에서 선언하면 for에서만 사용할수 있습니다.
			//i는 0부터 4까지 변경되면서 실행합니다.
			System.out.println("헬로우 ! (" + i + ")");	//i=0 , 0<5 참 -> 출력 실행 -> i++
														//i=1 , 1<5 참 ->    " -> i++
														//i=2, 2<5 참 ->     "    -> i++
														//	:
														//i=5, 5<5 거짓 -> for종료
	//while 반복문
		System.out.println("\n while 출력1");
	int j=0; //10<5거짓이면 실행을 하지않음
	while(j<5) { //조건식 j<5가 참인 동안에 while {}반복 부분을 실행한다.
		System.out.println("헬로우("+j+")");
		j++;
	}
	
	System.out.println("\n while 출력2");
	while(true) { //무한 반복 무한 루프
		System.out.println("하이자바-"+j);
		j++;
		if(j==100) break; //탈출
	}
	
	System.out.println("\n while 출력3");
	boolean isOk =true;
	while(isOk) {
		System.out.println("j= "+j);
		for(int i=0;i<5;i++) {
			System.out.print("\t"+i);
		}
		System.out.println();
		
		j++;
		if(j==105) isOk=false; //while 종료
	}
	
	
	
	
	}

}

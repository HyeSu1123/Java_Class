package koreait.day3;

public class LogicalOpTest {//논리연산을 연습합닌다
	//논리연산: and(&&), or(||), not(!) -> 연산결과는 boolean타입
	//-> 관계연산을 복합적으로 검사할때 사용
	public static void main(String[] args) {
		//응용: 국어점수 90이상이고 총 점이 250이상이면 국어 특기 우수학생
		int korean, sum;
		
		korean = 92;
		sum = 260;
		
		if(korean >= 90 && sum >= 250) 
			System.out.println("국어 특기 우수 학생");
			
		//else 없는 if 형식도 가능
		
		//국어 점수가 80점 이상이거나 총점이 200점 이상이면pass
		korean = 67;
		sum = 190;
		
		if(korean >= 80 || sum >= 200) 
			System.out.println("pass");
		
		System.out.println("끝");
		
		System.out.println("논리연산 결과 확인하기 : and");
		System.out.println("true and true = "+(true && true));
		System.out.println("true and false = "+(true && false));
		System.out.println("false and true = "+(false && true));
		System.out.println("false and false = "+(false && false));
		
		System.out.println("\n논리연산 결과 확인하기 : or");
		System.out.println("true or true = "+(true || true));
		System.out.println("true or false = "+(true || false));
		System.out.println("false or true = "+(false || true));
		System.out.println("false or false = "+(false || false));

		System.out.println("\n논리연산 결과 확인하기 : not");
		System.out.println("not true = "+ !true); //true 값을 반대(not)값으로 바꿈
		System.out.println("not false = "+!false);//false 값을 반대(not)값으로 바꿈
		
		//Quiz : korean 국어점수가 40~69인 학생들은 "선생님 면담"출력
		//단 if문은 한번만
		korean =67;
		if(korean >= 40 && korean <70)
			System.out.println("선생님 면담");
		//korean 국어점수가 0~100이 아닌 값은 "잘못된 값"출력
		korean =104;
		if(!(korean >= 0 && korean <=100))// 첫번째 방법
			System.out.println("잘못된 값");
		if(korean < 0 || korean > 100)// 두번째 방법
			System.out.println("잘못된 값");
	}

}
















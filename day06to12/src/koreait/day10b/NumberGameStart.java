package koreait.day10b;

import java.util.Scanner;

public class NumberGameStart {
//NumverGame 실행 -  게임 기록도 저장
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		NumberGame[] result = new NumberGame[5];	//게임 기록 저장 최대 5번
		int k=0;		//result 배열의 인덱스 변수
		
		System.out.println("숫자 맞추기 게임입니다");
		System.out.println("게임을 시작하려면 당신의 이름을 쓰시오");
		String gamer = sc.nextLine();
		
		
		do {
			NumberGame ng = new NumberGame(gamer);//게임기록 저장하는 클래스
			int[] numbers = new int[10]; //사용자 시도 숫자값 저장 배열(최대 10개)
			System.out.println("이제 시작합니다. 컴퓨터는 숫자를 결정했습니다.");
			int random = ng.makeNumber(101, 200);
			//static 메소드 사용시 NumberGame.makeNumber(101,200)로 사용
			
			System.out.println("맞춰보세요(101~200)"); //난수범위 최대값 최소값 인자로 전달
			
			int i=0;		//numbers 배열 -  (사용자 입력 숫자 지정)의 인덱스
			do {
				
				System.out.print("생각한 숫자 입력: ");
				numbers[i] = sc.nextInt();
				if (random > numbers[i]) {
					
					System.out.println("아닙니다. 더 큰 값입니다.");
				} else if (random < numbers[i]) {	
					
					System.out.println("아닙니다. 더 작은 값입니다.");
				}else {	//random과 numbers[i] 같을 때 -> 정답일때
					ng.setSuccess(true);
				}
				i++; //시도한 값
				
				if (i == 10) 	break;
				
			}while(!ng.isSuccess()); //!을 붙여서 거짓으로 만든다 
			
			//위의 반복을 어떻게 종료한것이냐에 따라 2가지
			ng.setCount(i); //시도한 값을 넣어준다
			if(ng.isSuccess()) {
				
				System.out.print("딩동댕~정답입니다. 지금까지 시도한 횟수\n");
				for(int j=0;j<i;j++) {
					System.out.print(numbers[j]);
					System.out.print(j!=(i-1)? ",":" ");
				}
				
				System.out.println(".."+ng.getCount() +"번만에 정답입니다");
			}
			else {
				System.out.print("실패입니다 모든 기회가 소진되었습니다.");
				System.out.println("정답은 "+random+"이었습니다.");
			}
			result[k]=ng;
			k++;		//게임 기록 저장result 배열 인덱스 증가
			
			System.out.print("게임을 계속 하시겠습니까? 계속하려면 0을 입력하세요: ");
		}while(sc.nextInt()==0);
		//게임 기록 result배열값 출력
		System.out.println(":::::게임 스코어:::::");
		for(int j=0;j<k;j++) {
			result[j].print();
		}
		
		System.out.println("---Game End---");
	}

}

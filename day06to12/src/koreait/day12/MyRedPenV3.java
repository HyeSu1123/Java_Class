package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class MyRedPenV3 {

	public static void main(String[] args) {
		
		ArrayList<MathProblem> addList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int ans;
		int cnt=0; //맞은 갯수 카운트
		int exit;
		
		System.out.println("--------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("--------------------------");
		System.out.println("시작합니다.");
		//여기서부터
		while(true) {
			
		for(int i=0;i<5;i++) {
		MathProblem p1 =new MathProblem('+');
		addList.add(p1);
		p1.makeProb(); //문제 만드는 메소드 : 연산 종류에 따라 숫자가 난수로 만들어진다. 
		
		System.out.print("문제"+(i+1)+". "+p1+" 답 입력: "); //toString 재정의한 예제
		ans = sc.nextInt();
		
		if(ans == p1.showAnswer()) {
			cnt++;
			p1.setCorrect(true);
			
		}
		}//for end
		System.out.println("--------------------------");
		System.out.println("채점합니다. 맞은개수" + cnt + " (" + (cnt * 20) + " 점)");
		System.out.println("-------틀린문제 다시보기-------");
		for(MathProblem prob : addList) {
			if(!prob.isCorrect()){
				System.out.println(prob+" 정답"+prob.showAnswer());
				
			}
		}
		System.out.println("문제를 계속 풀겠습니까? (계속:아무숫자, 종료:0)");
		exit = sc.nextInt();
		addList.clear();
		if(exit == 0) {
			System.out.println("종료되었습니다.");
			break;}
		}//계속할까요? -> 연산자 선택하는 기능을 추가해서 V4를 만들어보자
		
	}

}

package koreait.day10;

import java.util.Random;
import java.util.Scanner;

public class MyRedPen2 {

	public static void main(String[] args) {
		// 초기화 필요한 변수 구별해서 넣기
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] x1 = new int[10]; // 뎃셈의 첫번째 값 저장 배열
		int[] x2 = new int[10]; // 덧셈의 두번째 값 저장 배열
		int[] no = new int[10]; // 문제 번호
		int n1, n2, ans;
		int cnt = 0;

		System.out.println("--------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("--------------------------");
		System.out.println("시작합니다.");

		//int i; for 지역변수로 사용 될때에는 for에서 선언하기 -> for문이 많을 때변수명 고민이 줄어듬
		for (int i = 0; i < 10; i++) {
			// for문의 지역변수로 선언해도 되는 변수는 n1,n2 ans
			n1 = r.nextInt(89) + 11;// 랜덤 공식 nextInt(max-min+1)+min;
			n2 = r.nextInt(89) + 11;// 랜덤 공식 nextInt(max-min+1)+min;
			System.out.print("문제" + (i + 1) + ". " + n1 + "+" + n2 + "= 답 입력: ");
			ans = sc.nextInt();

//			if(ans == n1+n2) {cnt++;} //맞은걸 카운트 하는것보단(변수를 추가해야함) 틀린개수를 카운트해서 사용
			if (ans != n1 + n2) { // 틀린 문제를 cnt++
				// 3개 배열에 틀린문제 내용 저장하기
				no[cnt] = i + 1;
				x1[cnt] = n1;
				x2[cnt] = n2;
				cnt++;
				// 틀린 갯수는 cnt , 맞은 갯수 10-cnt -> 문제 총 10개
			}

		}

		System.out.println("--------------------------");
//		System.out.println("채점합니다. 맞은개수" + cnt + " (" + (cnt * 10) + " 점)");
		System.out.println("채점합니다. 맞은개수" + (10-cnt) + " (" + ((10-cnt) * 10) + " 점)");

		// 틀린문제에 대해 번호, 문제, 정답 보여주기
		System.out.println("-------틀린문제 다시보기------");
		for(int i=0; i<cnt;i++) {
			System.out.println("문제" + no[i] + ". " + x1[i] + "+" + x2[i] + "= "+(x1[i]+x2[i])); 
			
		}
	}
	//발전 방향 : x1,x2 no 배열 -> 2차원배열(단순히 값만저장), 클래스(값저장+메소드)
}

package koreait.day4;

import java.util.Scanner;

public class StarPint {
//예를 들어 영화 감상 후기 1~5 평점 입력 , 3 :★★★ 방법2 ★★★☆☆️
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int point;
		
		System.out.println("[[영화감상 후기]]");
		System.out.println("평점을 몇점 주시겠습니까?(1~5):");
		point = sc.nextInt();
		
		System.out.println("방법1");
		for(int i=0;i<point;i++) {
			System.out.print("★");
		}
		
		System.out.println("\n방법2-1");
		for(int i=0;i<point;i++) {
			System.out.print("★");	
			}
		for(int i=0;i<5-point;i++) {
			System.out.print("☆");
		}
		
		System.out.println("\n방법2-2");
		for(int i=0;i<5;i++) {
			if(i<point) {
				System.out.print("★");
			}
			else {
				System.out.print("☆");
			}
		}//for문이 종료되면 i 변수는 사용 못한다.
		
		System.out.println("\n방법2-3");
		int k;
		for(k=0;k<point;k++) {
			System.out.print("★");
		}//위의 for를 종료하면 k는 point 값과 같다
		for(;k<5;k++) {//초기값식을 생략. k=point
			System.out.print("☆");
		}//밖에 int를 선언했기 떼문에 생략해도 된다.
		
//		for(int i=0;;i++) {//무한반복
//			System.out.println("test");
//		}
		
		
		
	}
}

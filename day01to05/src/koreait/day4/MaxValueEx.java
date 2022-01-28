package koreait.day4;

import java.util.Scanner;

public class MaxValueEx {
//	3개 정수 중 최대값 구하는 연습 문제: MaxValueEx.java
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0,n2=0,n3=0;
		
		System.out.println("3개의 정수를 입력해주세요");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("max:"+n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("max:"+n2);
		}
		else {
			System.out.println("max:"+n3);
		}
	}

}

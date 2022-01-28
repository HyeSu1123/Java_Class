package koreait.day5;

import java.util.Scanner;

public class MaxMinValueEx {
//	3개 정수 중 최대값 구하는 연습 문제: MaxValueEx.java
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0,n2=0,n3=0;
		int max;
		int min;
		
		System.out.println("3개의 정수를 입력해주세요");
		System.out.print("n1: ");
		n1 = sc.nextInt();
		System.out.print("n2: ");
		n2 = sc.nextInt();
		System.out.print("n3: ");
		n3 = sc.nextInt();
		
//		if(n1 > n2) {
//			max = n1;//n1,n2 2개값중에서 큰값을 max의 중간결과값
//			min = n2;//n1,n2 2개값중에서 작은값을 min의 중간결과값
//		}
//		else {
//			max = n2;
//			min = n1;
//		}
//		
//		if(max < n3) max = n3;
//		
//		if(min > n3) min = n3;//내용이 한줄이면 {}생략 가능
//		
//		
//		System.out.println("최대값 ="+max);
//		System.out.println("최소값 ="+min);
//		//조건 연산자(3항연산자)로 변경
//		max = (n1>n2)? n1:n2;
//		min = (n1<n2)? n1:n2;
//		max = (max < n3)? n3:max;
//		min = (min > n3)? n3:min;
		
		max = (n1>n2)? n1:(n2>n3)? n2:n3;
		min = (n1<n2)? n1:(n2<n3)? n2:n3;
		
		System.out.println("더 큰값:"+max + "\n더 작은값:"+min);
	}

}

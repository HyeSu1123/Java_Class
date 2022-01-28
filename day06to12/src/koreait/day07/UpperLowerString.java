package koreait.day07;

import java.util.Scanner;

public class UpperLowerString {

	public static void main(String[] args) {
		String message;
		String upper;
		String lower;
		int k=0;
		int j=0;
		char[] uppers = new char[20];
		char[] lowers = new char[20];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력받습니다(단 영문자만)");
		message = sc.nextLine();
		
		for(int i=0;i<message.length();i++) {
			char temp = message.charAt(i);
			if( temp >= 65 && temp <= 90) {
				uppers[k] = temp;
				k++; //다음 대문자 저장될 인덱스 증가
			}
			else if(temp >='a' && temp <='z') {
				lowers[j] = temp;
				j++;
			}
		}
		upper = String.valueOf(uppers);
		lower = String.valueOf(lowers);
		
		System.out.println("upper: "+upper);
		System.out.println("lower: "+lower);
		
	}

}

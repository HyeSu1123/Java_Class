package koreait.day07;

import java.util.Scanner;

public class EvenOddString4 {
	//입력문자열 , 결과문자열 모두 문자열 상태로 처리합니다.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String src_string;
		String even_string="";
		String odd_string="";
		System.out.print("문자열(공백과 기호,숫자 포함)을 입력하세요. ->");
		src_string = sc.nextLine();
		
		for(int i=0;i<src_string.length();i++) {              
			if(i%2==0) even_string +=src_string.charAt(i);
			else odd_string+=src_string.charAt(i);
		}
		
		System.out.print("\n[[결과]] ");
		System.out.println("짝수 문자열 ....." + even_string);
		System.out.println("홀수 문자열 ....." + odd_string);
		
	}

}

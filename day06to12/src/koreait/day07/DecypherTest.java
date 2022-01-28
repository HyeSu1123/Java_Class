package koreait.day07;

import java.util.Scanner;

public class DecypherTest {
//내용 : 쯔위가 모모가 보낸 암호 메세지를 받고 해독해서 확인합니다 key값 약속된 7값을 알고 있다
	//p'ht
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int key = 7;
		String decypherString;
		String message;
		char[] temp; // 배열 사용 안하고 하는 방법도있다 하지만 배열 쓰는게 더 좋은 방법이다
		
		System.out.print("전달받은 암호 메세지 입력: ");
		decypherString = sc.nextLine();
		
		temp = decypherString.toCharArray();
		
		for(int i=0;i<temp.length;i++) {
			temp[i] -= key;
		}
		
		System.out.println(temp);
		
		message = String.valueOf(temp);
		System.out.println("모모의 메세지 : "+ message);//p'ht
		
		
	}
	//예제 결론 : String 을 char[] 배열로 변환 시킬수 있다 -> 문자열.toCharArray()
	//char[] 배열을 String으로 변환 시킬수있다 -> String.valueOf(문자배열)
}

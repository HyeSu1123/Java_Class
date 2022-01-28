package koreait.day07;

import java.util.Scanner;

public class CypherTest {
//연습 예제
	//내용 모모가 쯔위에게 메세지를 전달하는데 비밀 메세지로 암호화를 합니다
	//모모와 쯔위는 암호를 푸는 key값으로 7이라는 숫자를 정했다(복호화)
	//고대 암호 : 문자하나+key = ? 새로운 문자 -> 이 방법으로 메세지를 암호화 해보자
	public static void main(String[] args) {
		//원본 메세지 : 키보드 입력
		//암호메세지 : cypherString를 출력
		Scanner sc= new Scanner(System.in);
		int key = 7;
		String message;
		String cypherString;//암호메세지
		
		char[] temp; //초기값 선언과 배열크기 선언도 없이 할 수도 있다
		
		System.out.print("보내고 싶은 원본 메세지 입력: ");
		message = sc.nextLine();
		
		//message를 temp로 변환하여 참조한다
		temp = message.toCharArray();
		
		//문자하나 +key 결과값은 temp 배열에 저장
		for(int i=0;i<temp.length;i++) {
//			temp[i] = temp[i] + key;
			temp[i] += key; //축약 연산자는 강제캐스팅 안하고 대입이 가능하다
		}
		
		System.out.println(temp);
		
		//추가 기능 : temp 문자 배열을 문자열로 변환 참조
		cypherString = String.valueOf(temp);//String.valueOf 메소드는 여러타입 데이터를 문자열로 변환시킨다
		System.out.println("암호 메세지 : "+ cypherString);//p'ht
		
		
		
	}
}

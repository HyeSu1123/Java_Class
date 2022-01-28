package koreait.day5;

import java.util.Scanner;

public class WhileDay5Exam {
//Day5Exam.java 를 반복실행-> isPass가 true일떄까지
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password= "";
		int upper_cnt = 0, lower_cnt = 0, numeric_cnt = 0, symbol_cnt = 0;
		boolean isPass = false;// password 규칙에 맞는지 논리값 저장
		String message = ""; // passwdord 규칙 불만족 조건 메세지

		// 연산에 사용되는 변수는 반드시 초기값을 저장한다.
		System.out.print("[[패스워드 검사]]");
		
		while(!isPass) { //isPass 거짓이면 !(Not)연산 
			upper_cnt = 0; // 패스워드 다시 입력하면 초기화를 해준다
			lower_cnt = 0;
			numeric_cnt = 0;
			symbol_cnt = 0;
			message="";
			
			System.out.print("패스워드를 입력해주세요: ");
	
			password = sc.nextLine();
	
			if (password.length() < 8) {
				message = "*) 8글자 이상으로 작성해주세요";
	
			}
			// 추가 요구사항 처리를 위한 변수선언
			boolean isUseless = false;
			for (int i = 0; i < password.length(); i++) {
	//			System.out.print(password.charAt(i));
				char temp = password.charAt(i);
	
				if (temp >= 'A' && temp <= 'Z') {// 'A'~'Z' 범위검사
					upper_cnt++;
				} else if (temp >= 'a' && temp <= 'z') {// 'a'~'z'범위검사
					lower_cnt++;
				} else if (temp >= '0' && temp <= '9') {// 0~9 범위검사
					numeric_cnt++;
				}
				// 분류: 특수기호 범위체크, (문자 또는 코드값) 코드값 32~47,58~64,91~96, 123~126
	
				else if (temp >= 32 && temp <= 47 || temp >= 58 && temp <= 64 || temp >= 91 && temp <= 96
						|| temp >= 123 && temp <= 126) {
					// 추가 요구 사항 처리
					if (temp == '>' || temp == '<' || temp == '(' || temp == ')' || temp == ';' || temp == '%'
							|| temp == '\\' || temp == ' ')
						isUseless = true;
					else
						symbol_cnt++;
	
				}
	
			}
			// 사용할 수 없는 기호 >, <, (,), ;, %, / 공백을 추가해보자
			System.out.println("대문자 개수: " + upper_cnt);
			System.out.println("소문자 개수: " + lower_cnt);
			System.out.println("숫자 개수: " + numeric_cnt);
			System.out.println("기호 개수: " + symbol_cnt);
	
			if (upper_cnt < 1) {
				message += "\n*) 영대문자 1개 이상 포함해주세요"; // 문자연결
			}
			if (lower_cnt < 1) {
				message += "\n*) 영소문자 1개 이상 포함해주세요"; // 문자연결
			}
			if (numeric_cnt < 1) {
				message += "\n*) 숫자 1개 이상 포함해주세요"; // 문자연결
			}
			if (symbol_cnt < 1) {
				message += "\n*) 특수문자 1개 이상 포함해주세요"; // 문자연결
			}
	//		if(!isUseless && symbol_cnt < 1) //이렇게 해도 된다
			if (isUseless) {// 추가요구사항 처리
				message += "\n*) 기호 >, <, (,), ;, %, \\ 공백은 사용할수 없습니다";
			}
	
			if (password.length() >= 8 && upper_cnt >= 1 && lower_cnt > 1 && numeric_cnt >= 1 && symbol_cnt >= 1
					&& !isUseless) {
				isPass = true;
			}
	
			System.out.println(message);
			System.out.println("결과:" + (isPass ? "사용할 수 있는 패스워드 입니다." : "패스워드 작성규칙에 맞지 않습니다"));
			// 삼항 연산자 -> isPass 참일때 : 앞에 문자열을 출력 거짓이면 뒤에 문자열을 출력
		}//while 끝
		System.out.println("사용할 패스워드:"+password);
		sc.close();
	}
	// 불필요한 변수는 사용을 줄이고 반복되는 코드도 없도록 한다
	// 다른 사람이 이해하기 쉬운 코드로 작성한다

}

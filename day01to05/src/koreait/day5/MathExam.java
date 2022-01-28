package koreait.day5;

import java.util.Scanner;

public class MathExam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("[[수학 공부 도우미]]");
		while (true) {
			int num = 0, value1 = 0, value2 = 0,result = 0;
			char op=' ';
			System.out.println("연산을 선택해주세요 1. 덧셈\t2. 뺄셈\t 3. 곱셈\t 4. 종료");
			num = sc.nextInt();
			if (num == 4) {
				System.out.println("프로그램을 종료 합니다.Bye,,👍👍\n");
				break;
			}else if(num <1 || num >3) {
				System.out.println("✔잘못된 연산값입니다.다시 선택하세요.");
				continue;//반복문 처음으로 돌아가기, 아래 명령어들 실행을 안한다
			}
			System.out.print("✏️  값 1 을 입력하세요. ->");
			value1 = sc.nextInt();
			System.out.print("✏️  값 2 을 입력하세요. ->");
			value2 = sc.nextInt();

			if (num == 1) {
				op = '+';
				result = value1 + value2;
			} else if (num == 2) {
				op = '-';
				result = value1 - value2;
			} else if (num == 3) {
				op = '*';
				result = value1 * value2;
			}else {
				System.out.println("연산자 번호를 다시 입력해주세요");
			}
			System.out.print("정답  : "+value1 +op+value1+"=" + result +" 입니다.\n\n");
		}
	}
}

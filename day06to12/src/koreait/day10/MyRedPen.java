package koreait.day10;

import java.util.Scanner;

public class MyRedPen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyRedPenclass question = new MyRedPenclass();

		int[] numbers = new int[10];// 문제번호
		MyRedPenclass num1 = new MyRedPenclass(numbers);
		MyRedPenclass num2 = new MyRedPenclass(numbers);

		int result;

		int score = 0;
		int count = 0;

		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("---------------------------");
		System.out.println("이제 시작합니다.");
		int i;
		while (true) {
			for (i = 0; i < 10; i++) {
				int random1 = question.makeNumber(11, 99);
				int random2 = question.makeNumber(11, 99);
				System.out.print("문제" + (i + 1) + "." + random1 + "+" + random2 + "=");
				result = sc.nextInt();

				if (result == random1 + random2) {
					count++;
					score += 10;
				} else {
					numbers[i]++;

				}

			}
			System.out.println("채점합니다.맞은개수: " + count + "(총 점수:" + score + ")");
			System.out.println("종료를 원한다면 0번을 눌러주세요");
			if (sc.nextInt() == 0) {
				break;
			} else {
				continue;
			}

		}
		System.out.println("틀린문제 다시보기");
		for (int k = 0; k < numbers.length; k++) {
			System.out.print((k+1)+"번: "+num1.wrong[k]);
			System.out.print(k!=(i-1)? ",":" ");
			
		}

	}
}

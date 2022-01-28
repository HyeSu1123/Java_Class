package koreait.day9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("숫자 맞추기 게임을 시작합니다");

		System.out.println("컴퓨터가 숫자를 결정했습니다. 정답을 맞춰보세요");
		int comNum;
		int myNum;
		int count = 1;
		
		
		comNum = r.nextInt(200) + 100;

		while (true) {
			System.out.print("생각한 숫자입력: ");
			myNum = sc.nextInt();
			int[] temp;
			temp = new int[count];
			for (int i = 0; i < count; i++) {
				temp[i]=myNum;
			}
			if (comNum == myNum) {
				System.out.println("딩동댕 정답입니다.");
				System.out.println("지금까지 시도한 값: " + Arrays.toString(temp) + count + "번만에 정답입니다.");
				break;
			} else if (comNum > myNum) {
				System.out.println("아닙니다. 더 큰 값입니다.");
				count++;
				continue;
			} else if (comNum < myNum) {
				System.out.println("아닙니다. 더 작은 값입니다.");
				count++;
				continue;
			}
		}

	}

}
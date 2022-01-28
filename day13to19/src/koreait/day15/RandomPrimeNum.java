package koreait.day15;

import java.util.Random;

public class RandomPrimeNum {

	public static void main(String[] args) {
		// 주어진 난수 범위에서 소수를 7개 만든다 소수 7개는 배열에 저장하여 출력
		// -> 주어진 정수값이 소수인지 판별하는 메소드를 만들어보자(메소드 이름 isPrime,리턴형식은 boolean, 인자 1개 타입은 정수
		// 범위 100~999 -> 수식 만들기
		int[] prime = new int[7];
		Random r = new Random();

		for (int i = 0; i < prime.length; i++) {
			int num = r.nextInt(900) + 100;
			System.out.println(num);
			if (isPrime(num)) {
				System.out.println(num + "은 소수입니다.");
			} else
				System.out.println(num + "은 소수가 아닙니다");
		}

	}

	// 메소드
	static boolean isPrime(int num) {
		boolean isPrime = true;

		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) { // 나눠 떨어진다(나머지 0)
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}

package koreait.day15;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNum3 {
	static final int NUM=10;
	public static void main(String[] args) {
		// 주어진 난수 범위에서 소수를 7개 만든다 소수 7개는 배열에 저장하여 출력
		//-> 주어진 정수값이 소수인지 판별하는 메소드를 만들어보자(메소드 이름 isPrime,리턴형식은 boolean, 인자 1개 타입은 정수
		//범위 100~999 -> 수식 만들기
		Random r = new Random();
		
		long start = System.currentTimeMillis();
		
		int[] prime = new int[NUM];
		int cnt = 0, max=999999999,min=333333333;
				
		while(cnt<NUM) {
			int temp = r.nextInt(max-min+1)+min;
			if(isPrime(temp)) {
				prime[cnt++] = temp;
				
			}
			
		}
		long end = System.currentTimeMillis();
		System.out.println("실행시간 ="+(end-start) + "ms 소요되었습니다");
		
		System.out.println(Arrays.toString(prime));
	}

	
	//메소드
	static boolean isPrime(int num) {
		boolean isPrime = true;
		
		for(int i=2; i<Math.sqrt(num);i++) { 
			if(num % i ==0) { //나눠 떨어진다(나머지 0)
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}

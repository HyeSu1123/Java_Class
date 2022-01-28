package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest2 {
//int 값 저장하는 배열을 활용하는 1연습
	public static void main(String[] args) {
		
		//배열의 크기는 20 -> 메모리 할당하기
		int[] scores = new int[20];
		
		//배열의 값은 난수1~100 범위
		Random r1 = new Random();
		for(int i=0;i<scores.length;i++) {
			scores[i] = r1.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));//배열값 출력
		
		int cnt =0; //카운트 변수 : 조건에 맞는 경우 +1 증가
		//저장된 20개 배열의 값중에서 70이상값을 검색
		//인덱스와 값을 출력
		for(int i=0;i<scores.length;i++) {
			//scores[0] , scores[1] ,scores[2],..scores[19]까지검사
			if(scores[i] >= 70) {
				System.out.println("i ="+i+"\t점수 = "+scores[i]);
				cnt++;
			}
		}
		//70이상인 값의 개수를 출력하려면?//카운트 변수 사용
		System.out.print("70이상 값의 개수:"+cnt);
		
		
		
	}

}

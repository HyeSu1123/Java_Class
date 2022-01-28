package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest4 {
//int 값 저장하는 배열을 활용하는 3연습
	public static void main(String[] args) {
		
		//배열의 크기는 20 -> 메모리 할당하기
		int[] scores = new int[20];
		
		//배열의 값은 난수1~100 범위
		Random r1 = new Random(System.currentTimeMillis()); //난수 발생에 필요한 seed값 설정 
		for(int i=0;i<scores.length;i++) {
			scores[i] = r1.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));//배열값 출력
//값의 분포 개수를 90~100, 80~89, 70~79, 76~69, 50~59, 40~49, 40미만 범위로 출력
//카운트 변수 4개 초기화 ->분포가 더 다양하다면 변수가 더 많이 필요하다..
//그래서 cnt 변수값도 배열로 사용하자.
		int[] cnts = new int[7];
		//위 분포 순서대로 인덱스를 사용하자.
		
		
		for(int i=0;i<scores.length;i++) {
			//scores[0] , scores[1] ,scores[2],..scores[19]까지검사
			int temp = scores[i];
			if(temp >= 90) cnts[0]++;
			
			else if(temp >= 80) cnts[1]++;
			
			else if(temp >= 70) cnts[2]++;
			
			else if(temp >= 60) cnts[3]++;
			
			else if(temp >= 50)	cnts[4]++;
			
			else if(temp >= 40) cnts[5]++;
			
			else cnts[6]++;
			
		}
		//결과 출력 : 연습문제 - 출력을 반복문으로 수정하기(90, 100, 80,89 출력되는 숫자를 수식으로 가능한가?)
		System.out.println("점수 분포 요약-----");
		System.out.println("90~100 :"+cnts[0]);
		System.out.println("80~89 :"+cnts[1]);
		System.out.println("70~79 :"+cnts[2]);
		System.out.println("60~69 :"+cnts[3]);
		System.out.println("50~59 :"+cnts[4]);
		System.out.println("40~49 :"+cnts[5]);
		System.out.println("40미만 :"+cnts[6]);//마지막 출력문장은 따로
		
	}

}

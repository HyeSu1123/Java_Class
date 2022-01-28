package koreait.day4;

public class SumTest {
//for문을 이용하여 1부터 100까지 합계
	public static void main(String[] args) {
		int sum = 0;//반드시 초기화가 필요
		for(int i=1; i<=100;i++) {
			sum += i;
			//sum = sum+i
			System.out.println("i = "+ i+", sum = "+sum);//중간 결과값
		}
		System.out.println("sum = "+sum);//최종 결과값
	}

}

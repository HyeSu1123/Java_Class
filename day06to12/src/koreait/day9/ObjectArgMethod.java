package koreait.day9;

import java.util.Arrays;
import java.util.Random;

public class ObjectArgMethod {
//int 배열의 정수값 중에서 최대값 최소값 구하는 메소드 - 참조값을 인자로 전달하는 연습
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();// 난수 범위는 1~100

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
		}

		System.out.println(Arrays.toString(arr));		//정수 배열을 인자로
		int max; // max 초기값 : 1. 배열의 인덱스 0번값 2. 비교될 다른값들보다 작은값
					// 비교범위 : 1.배열 인덱스 1~마지막 인덱스까지 2.0~마지막 인덱스까지
		max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {// 최대값은 다른 값들보다 큰값이 되어야 하므로,그렇지 않을 경우
				max = arr[i];// max 의 값을 그 값으로 변경합니다
			}
		}
		System.out.println("최대값 : " + max);

		int min;// min 초기값 : 1. 배열의 인덱스 0번값 2. 비교될 다른값들보다 큰 값
				// 비교범위 : 1.배열 인덱스 1~마지막 인덱스까지 2.0~마지막 인덱스까지
		min = 999;// 100으로 해도된다. 2번으로 구현
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {// 최대값은 다른 값들보다 작은값이 되어야 하므로,그렇지 않을 경우
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
		//메소드로 실행해보기
		System.out.println("메소드로 구한 최대값: "+arrayMaxValue(arr));
		System.out.println("메소드로 구한 최소값: "+arrayMinValue(arr));
		System.out.println("메소드로 구한 합계: "+arraySumValue(arr));
		System.out.println("메소드로 구한 평균: "+arrayAvgValue(arr));
		
		double[] darr = new double[10];
		for(int i=0;i<darr.length;i++) {
//			darr[i] = r.nextDouble(); //0~1사이의 실
//			darr[i] = r.nextDouble()*10; //0~10사이의 실수
			darr[i] = r.nextDouble()*9+1; //1~9사이의 실수 +1을 하면 1~10사이의 실수
		}
		System.out.println("Arrays.toString 메소드 오버로딩 확인");
		System.out.println(Arrays.toString(darr));//실수 배열을 인자로
		//최대값 & 최소값을 구하는 메소드 : 메소드 오버로딩(Overloading) - 메소드 이름은 같으나, 인자 형식이 다르다
		//반환값은 같은형식
		//대표적인 메소드 - Arrays.toString() 메소드
	}
//메소드 작성으로 구현해보기 : 최대값/최소값을 구하기 위해 다른 데이터는 배열에 있다 -> 배열의 변수는 참조변수.
	//				  : 메소드 인자가 참조 타입이 된다. -> 데이터 자체를 전달하지 않고 데이터 저장 주소를 전달
	//메소드의 변환값은 최대값 또는 최소값 결과를 변환값으로 한다
	static int arrayMaxValue(int[] array) { //인자의 변수선언은 전달된 데이터 타입을 지정
		int max;
		max = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;//최대값
	}
	static int arrayMinValue(int[] array) {
		int min;
		min = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;//최소값
	}
	//합계를 구하는 메소드
	static int arraySumValue(int[] array) {
		int sum =0;
		for(int i=0;i<array.length;i++) {
			sum +=array[i]; //배열 인덱스 0~마지막까지 순차적으로 sum 변수에 누적하면서 더한다
		}
		return sum;
	}
	
	//평균을 구하는 메소드
	static double arrayAvgValue(int[] array) {
		int sum =0;
		for(int i=0;i<array.length;i++) {
			sum +=array[i];
		}//위의 sum = arraySumValue(array); 메소드 호출하는 방법도 있다
		
		return (double)sum/array.length;
	}
	
}

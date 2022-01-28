package koreait.day14;

import java.util.Arrays;

public class OverLoadingTest {

	public static void main(String[] args) {
		//메소드 오버로딩 예제
		
		//min 메소드는 다른형식 int, long, double 등 여러 형식인자를 전달 받는다.-> 메소드 오버로딩
		int r1 = Math.min(134,56);		//인자에 따라 리턴타입이 다른 메소드이다
		double r2 = Math.min(6.789, 3.45);
		
		System.out.println("작은값 r1="+r1);
		System.out.println("작은값 r2="+r2);
		
		int[] arr1 = {67,45,23,76};
		String[] arr2 = {"sanha","eunwoo","mj","빈이"};
		double[] arr3 = {7.8,12.45,3.14};
		
		String r3 = Arrays.toString(arr1); //toString 메소드 리턴 타입이 String 이다.
		String r4 = Arrays.toString(arr2);
		String r5 = Arrays.toString(arr3);
		
		System.out.println("r3문자열 ="+r3);
		System.out.println("r4문자열 ="+r4);
		System.out.println("r5문자열 ="+r5);
		
		//인자의 타입이 Object 일때는 모든 클래스 타입이 된다.(String, Member,...)
		//Object는 자바 클래스의 조상(최상위 부모클래스)
		Member[] members = {new Member("eunwoo",26),new Member("sanha",23),new Member("mj",29)};
		
		String r6 = Arrays.toString(members);
		System.out.println("r6문자열="+r6);
		
		//내가 만든 MyMath 오버로딩 메소드를 테스트하기 - arr1정수배열, arr3 실수배열로하기
		
		System.out.println("arr1배열 최대값="+MyMath.arrayMaxValue(arr1));
		System.out.println("arr3배열 최대값="+MyMath.arrayMaxValue(arr3));
		
		
		System.out.printf("arr1배열 평균=%.2f\n",MyMath.arrayAvgValue(arr1));
		System.out.printf("arr3배열 평균=%.2f\n",MyMath.arrayAvgValue(arr3));
		
		
	}

}

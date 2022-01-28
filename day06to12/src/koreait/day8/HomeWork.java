package koreait.day8;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
//		정수형 배열의 값 중에서 최대값/최소값 찾기
		int[] arr;
		int num;
		int max = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 정수의 개수:");
		num = sc.nextInt();
		arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("비교할 정수를 입력해 주세요:");
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);

		}
		max = arr[0];
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}

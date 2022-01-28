package sort;

import java.util.Arrays;

public class IntDescendingSortTest2 {

	public static void main(String[] args) {
		int[] datas = {45,34,78,65,99,14};
		
		System.out.println("배열초기상태:"+Arrays.toString(datas));
		for(int i=0;i<datas.length;i++) {
//i=datas.length-1일때 즉 마지막 인덱스 일때는 아래 for문은 조건식이 처음부터 거짓이므로 실행이 안된다
			for(int k=i+1;k<datas.length;k++) {
				if(datas[i] < datas[k]) {
					//교환
					int temp = datas[k];
					datas[k] = datas[i];
					datas[i] = temp;
				}
			}//k변수 for문
			System.out.println("i="+i+",중간결과:"+Arrays.toString(datas));
		}//i변수 for문
		
	}

}

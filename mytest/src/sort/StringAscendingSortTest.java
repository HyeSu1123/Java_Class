package sort;

import java.util.Arrays;

public class StringAscendingSortTest {

	public static void main(String[] args) {
		
		String[] names = {"iu","boa","twice","nayeon","zun","nana"};
		//오름차순으로 정렬하기
		
		System.out.println("처음 결과:"+Arrays.toString(names));
		for(int i=0;i < names.length; i++) {
			for(int k=i+1; k < names.length; k++) {
				if(names[i].compareTo(names[k]) > 0) {
					String temp = names[k];
					names[k] = names[i];
					names[i] = temp;
				}
			}
			System.out.println("i="+i+",중간결과:"+Arrays.toString(names));
		}
	}

}

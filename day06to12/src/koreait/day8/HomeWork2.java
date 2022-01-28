package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class HomeWork2 {

	public static void main(String[] args) {
//		LottoTest.java 의 while문을 do~ while 문으로 변경해보세요.
//		-> isOk 변수 사용하지 않습니다.
		int[] lotto = new int[6];
		Random r1 = new Random();
		int temp = 0;
		int i;
		int j;
		do {
			for (i = 0; i < lotto.length; i++) {
				temp = r1.nextInt(44) + 1;
				for (j = 0; j < i; j++) {
					if (temp == lotto[j]) {
						break;
					}
				}
			}
			System.out.println(Arrays.toString(lotto));
		} while (true);

//		for (int i = 0; i <lotto.length; i++) {
//			int temp = 0;
//			
//			while (true) {//종료조건이 언제 나올지 예측이 안될 때 사용
//				temp = r1.nextInt(45) + 1;// 1~46
//				System.out.println("만든값: "+temp);
//				int j;
//				
//				for (j=0;j<i;j++) {
//					if (temp == lotto[j]){//같은 값을 만나면 탈출
//						System.out.println("*"+temp+"*");
//						break;
//					}
//				} // for - j end
//				if(j==i) break; //**비교하는 동안 같은 값이 없을때!
//				
//			} // while - end
//			
//			lotto[i] = temp;
//			
//		} // for - i end
//		System.out.println(Arrays.toString(lotto));
		
	}

}

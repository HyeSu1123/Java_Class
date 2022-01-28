package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		// 난수 1~45범위의 값을 중복된 값이 없도록 6개 생성하고 배열에 저장
		int[] lotto = new int[6];
		Random r1 = new Random();
//		boolean isOk = true;

		for (int i = 0; i <lotto.length; i++) {
			int temp = 0;
//			isOk = true; //새로운 i 인덱스로 검사할 때 초기화
			
			while (true) {//종료조건이 언제 나올지 예측이 안될 때 사용
				temp = r1.nextInt(45) + 1;// 1~46
				System.out.println("만든값: "+temp);
				int j;
				
				for (j=0;j<i;j++) { //j==i 이면 for 종료
					// 배열 인덱스 i값의 앞에 있는 배열값들과 인덱스 temp 배열값을 비교
					if (temp == lotto[j]){//같은 값을 만나면 탈출
						System.out.println("*"+temp+"*");
						break;//for - j를 탈출
							 //i는 4로 예를 들면 1) j가 2의 배열값이 temp와 같다면
							//for - j 탈출 했을때 아래** 부분의 조건은 참? 거짓? 거짓
							//2) j=0~3까지 배열값 비교했을때 모두 temp 와 다른 값이라면
							// 그때 아래 ** 부분의 조건은 참? 거짓? 참
					}
				} // for - j end
				if(j==i) break; //**비교하는 동안 같은 값이 없을때!
				
			} // while - end
			
			lotto[i] = temp;
			
		} // for - i end
		System.out.println(Arrays.toString(lotto));
	}

}

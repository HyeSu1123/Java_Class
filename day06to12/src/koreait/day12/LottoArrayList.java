package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class LottoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>(); //선택된 숫자저장
		ArrayList<Integer> balls = new ArrayList<>(); //45개의 공을 저장하는 리스트 1개씩줄어들기
		
		//1.balls 리스트에 1~45 숫자를 추가한다
		Random r = new Random();
		for(int i=0;i<45;i++) {
		balls.add(i+1);
		}
		//확인: 출력해보기
		System.out.println(balls);
		
		//2.balls 리스트에서 뽑을 인덱스를 난수 0~44 -> 0~43....->0~39범위에서 반복
		int k;
		for(int cnt =0; cnt <6; cnt++) {
			k = r.nextInt(45 - cnt);
			//2-1.k번째 위치의 데이터를 lotto 베열에 저장
			int temp = balls.get(k); //뽑았으니 로또 번호에 담아주기
			lotto.add(temp);
			
			//2-2. 뽑힌 난수 인덱스의 요소는 삭제(제거)한다.
			balls.remove(k); //볼에서 뽑혔으니 제거
			System.out.println("뽑힌숫자 : "+lotto);
			System.out.println("현재 공 값: "+balls);
		}
		
		//3. 최종 lotto 변수가 참조하는 값을 출력
		lotto.sort(null);
		System.out.println("오늘의 번호"+lotto);
		
		//ArrayList의 중요 메소드 : size(). add(), get(), remove()
	}

}

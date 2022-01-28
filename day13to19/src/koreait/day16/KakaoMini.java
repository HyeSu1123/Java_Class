package koreait.day16;

import java.text.DecimalFormat;

public class KakaoMini extends CreditCard {//상속
	//상수 선언
	public final int MAX_LIMIT = 100000;
	//생성자 - 부모클래스의 설계에 따라 정의
	public KakaoMini(String owner) {
		super(owner);
	}
//	추상 메소드 구현
	@Override
	public int upLimit(int plus) {//이용한도 올리기
		if(limit + plus > MAX_LIMIT) {
			return 0;
		}else {
			 limit += plus;
			 return plus;
		}
	}

	@Override
	public int pay(int money) {//금액결제
		if(money + payTotal > limit) {
			return 0;
		}else  {
			payTotal+=money;
			return money;
		}
	}


	@Override //재정의
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,###원");
		return owner+"님"+"이번달 결제 예정 금액"+df.format(payTotal)
				+"입니다.\n"+"[이용한도"+df.format(limit)+"]";
	}

	

}

package koreait.day16;

public abstract class CreditCard {
	//1. 부모클래스는 자식 클래스가 사용하도록 protected 지정

	protected String owner; //소유자
	protected int limit; 	//이용한도
	protected int payTotal; //결제금액
	
	//커스텀 생성자
	public CreditCard(String owner) {
		this.owner=owner;
	}
	
	//getter
	public int getLimit() {
		return limit;
	}
	public String getOwner() {
		return owner;
	}
	public int getPayTotal() {
		return payTotal;
	}
	
	//추상메소드 선언
	public abstract int upLimit(int plus); //이용한도 올리는 메소드
	
	public abstract int pay(int money);//카드 사용하는 메소드 money 금액을 결제
	
	
	
}

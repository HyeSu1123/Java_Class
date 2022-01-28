package koreait.day17;

import java.util.Comparator;

public class MemberAgeDescending implements Comparator<Member>{
	//Member 클래스의 비교기준을 설정한다.
	//기준 : 나이 - 내림차순 (Member의 나이)
	

	@Override
	public int compare(Member o1, Member o2) {
		Integer a = o1.getAge();	//int를 Integer타입으로 참조
		Integer b = o2.getAge();
		return b.compareTo(a);		//comparteTo는 비교메소드 : 래퍼클래스타입만 가능
		
		//a > b : 음수, a==b: 0, a < b : 양수
		
	}
	

}

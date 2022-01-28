package koreait.day17;

import java.util.Comparator;

public class MemberAgeAscending implements Comparator<Member>{
	//Member 클래스의 비교기준을 설정한다. 이름 또는 나이를 결정
	//기준 : 나이 - 오름차순 (Member의 나이)
	

	@Override
	public int compare(Member o1, Member o2) {
		Integer a = o1.getAge();	//int를 Integer타입으로 참조
		Integer b = o2.getAge();
		//나이가 같을때,이름순으로 하고 싶다면?(기본은 데이터 입력순서로) 
		if(a==b) {
			return o1.getName().compareTo(o2.getName());
		}else {
		return a.compareTo(b);		//comparteTo는 비교메소드 : 래퍼클래스타입만 가능
		}
		//a > b : 양수, a==b: 0, a < b : 음수
		
	}
	
	//결론
	//list에 저장된 데이터를 정렬하는 것은 sort 메소드가 한다.
	//sort(정렬) 알고리즘: 비교와 교환
	//기본형 타입 데이터와 String은 이미 비교 기준이 있다.
	//다른 타입 객체들은 비교기준만 알려주면 됩니다. -> Comparetor 인터페이스의 compareTo 메소드이다.
	// -> sort 메소드의 인자로 전달한다.

}

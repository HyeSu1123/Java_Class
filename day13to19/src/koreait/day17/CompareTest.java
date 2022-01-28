package koreait.day17;

import java.util.ArrayList;
import java.util.List;

public class CompareTest {

	public static void main(String[] args) {
		//값의 비교: 기본형 데이터 외에 객체 타입 비교를 인터페이스를 활용해 보자.
		
		List<Integer> list1 = new ArrayList<>();
		
		List<String> list2 = new ArrayList<>();
		
		list1.add(34);
		list1.add(67);
		list1.add(15);
		list1.add(56);
		list1.add(45);
		
		System.out.println("sort 하기 이전: "+list1);
		list1.sort(null);		//정렬은 값의 비교가 가능한 데이터이어야 한다.
		System.out.println("sort를 한 후: "+list1);
		
		list2.add("산하");
		list2.add("라키");
		list2.add("문빈");
		list2.add("은우");
		list2.add("진진");
		list2.add("MJ");
		
		System.out.println("sort 하기 이전:"+list2);
		list2.sort(null);		//사전식 정렬(알파벳 순서, 가나다 순서)
		System.out.println("sort를 한 후:"+list2);
		
		List<Member> list3 = new ArrayList<>();
	
		list3.add(new Member("라키",24));		
		list3.add(new Member("은우",26));
		list3.add(new Member("문빈",26));
		list3.add(new Member("산하",23));
		list3.add(new Member("MJ",29));
		list3.add(new Member("진진",27));
		
		System.out.println("sort 이전:"+list3);
//		list3.sort(null);
		list3.sort(new MemberAgeAscending());
		System.out.println("sort 이후(나이 오름차순): "+list3);
		list3.sort(new MemberAgeDescending());
		System.out.println("sort 이후(나이 내림차순): "+list3);
		list3.sort(new MemberNameAscneding());
		System.out.println("sort 이후(이름 오름차순): "+list3);
		list3.sort(new MemberNameDescending());
		System.out.println("sort 이후(이름 내림차순): "+list3);
	}

}








package koreait.day12;

import java.util.ArrayList;

public class MemberArrayList {
	public static void main(String[] args) {
	Member[] members = new Member[10];// 배열 10개 요소에 Member 객체를 참조시키도록 한다.
	
	
	
	//ArrayList에 클래스 타입 객체 추가하기
	ArrayList<Member> mlist = new ArrayList<>();
	
	Member momo = new Member();	//momo변수는 객체의 주소를 저장
	mlist.add(momo);			// 그 주소를 mlist에 추가한다.
	momo.id=20221234; momo.name="이모모";
	System.out.println("momo ="+momo);				//momo 변수와
	System.out.println("mlist(0)="+mlist.get(0));	//mlist.get(0) 요소에 저장된 주소값은 같다 
	
	mlist.add(new Member(20221111,"사나"));
	mlist.add(new Member(21220111,"미나"));
	mlist.add(new Member(20201234,"지효"));
	
	System.out.println("-----------------------------------------");
	for(int i=0;i<mlist.size();i++) {
		Member temp = mlist.get(i);
		System.out.println("index: "+i+"element: "+temp);
	}
	
	mlist.add(2,new Member(20211111,"나연")); 
	mlist.remove(3);		//인덱스 위치로 삭제
	System.out.println("------------------------------------------");
	for(int i=0;i<mlist.size();i++) {
		System.out.println("index: "+i+"element: "+mlist.get(i));
	}
	
	mlist.remove(momo);		//객체의 참조값을 전달하여 삭제한다.- 인자 타입이 Object일 때
	System.out.println("------------------------------------------");
	for(Member temp : mlist) { 
		//변수 i를 사용 안할때, 빠른(향상된) for문 - for( 요소타입과 변수명 선언 :리스트변수 또는 배열변수명
		System.out.println("element: "+temp);
	}
	
	}//ArrayList 는 요소의 추가/삭제가 쉽다.
}

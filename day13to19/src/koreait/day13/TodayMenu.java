package koreait.day13;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class TodayMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		//value 투표수 카운트하고 저장한다.
		System.out.println(map+"<-아무것도 저장안한 상태로 출력해보기");
		System.out.println("투표하세요");
		String foods = "오늘의 저녁메뉴: 치킨, 떡볶이, 곱창전골,오징어물회, 불고기";

	 
		map.put("치킨", 0);
		map.put("떡볶이", 0);
		map.put("곱창전골", 0);
		map.put("오징어물회", 0);
		map.put("불고기", 0);
		
		while(true) {
			int temp;
			System.out.println(foods);
			System.out.print("선택메뉴 입력하세요.(종료 : end) :");
			String menu = sc.nextLine();
			//문자열 동등비교 메소드 equals
			if(menu.equals("end")){break;} //종료조건
			
			if(map.containsKey(menu)==false) {//키값으로 없는 문자열이 입력된 경우 맨 앞에 !붙여도 거짓이 됨 안붙이면 true
				System.out.println("없는 메뉴를 선택했습니다.메뉴에 추가됩니다");
//				continue;// 없는 메뉴선택해서 다시 돌아갈때
				map.put(menu, 1);
				foods +=","+menu;
			}else {
			//입력한 메뉴가 key값이다. 해당 key의 value 값을 가져와서 +1 증가시키고 그 값을 map에 변경한다.
			temp = map.get(menu); //temp++;
			map.put(menu,++temp); //이미 있는 Key값의 value값을 변경
//			map.put(menu,temp++); //진행순서가 temp값을 put 메소드로 저장 한다음 temp +1증가
			// map.put(menu,temp); temp++;
			
//			map.put(menu,++temp); //진행순서가 temp값을 +1증가 한다음 put메소드로 저장
			// tmep++; map.put(menu,tmep);
			// 결론 : ++또는 -- 연산은 다른 메소드 또는 연산자 또는 출력문..과 같이 쓰일때 위치에 따라 먼저 또는 나중에 실행 
			//		 위치에 따라 앞(전치, prefix) 뒤(후치, postfix) 연산자 용어 기억하기
			}
			System.out.println("현재 투표상황: "+map);
		}
		
		System.out.println("--------투표종료---------");
		System.out.println("최대 득표수: "+Collections.max(map.values()));//value 중에 가장 큰값
		System.out.println("테스트: "+Collections.max(map.keySet()));	//key 값 정렬시 최대값

		//Collections 의 종류 : List(ArrayList), Map(HashMap, TreeMap), Set(HashSet) : 집합, 이터레이터
	}

}

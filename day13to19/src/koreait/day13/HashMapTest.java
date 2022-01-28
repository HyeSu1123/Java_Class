package koreait.day13;

import java.util.HashMap;
import java.util.TreeMap;

//ArrayList : 순차적으로(index로 접근) 데이터를 관리하는 자료구조이다.배열과 유사
//HashMap : 순차적인 구조가 아니다. 인덱스가 없고 Key값을 이용하여 데이터를 접근하며 저장/읽기한다.
//			검색이 많은 알고리즘에 유용하다.
//위의 2개 클래스는 제너릭 타입을<> 기호안에 표시한다. HashMap은 K : Key V : Value 한쌍이다.
//	제너릭 타입은 int, long, double 기본형 타입 대신에 래퍼(wrapper)클래스로 사용
public class HashMapTest {

	public static void main(String[] args) {
		
//		HashMap<String, Integer> map = new HashMap<>();
		//Key: String 타입, value : int 데이터
		
		TreeMap<String, Integer> map = new TreeMap<>(); //key 값으로 오름차순 정렬이 가능한 map이다. 
		
		//1.데이터 저장
		map.put("돼지국밥", 9000);
		map.put("스파게티", 13000);
		map.put("불고기", 15000);
		map.put("곱창전골", 10000);
		map.put("백반", 7000);
		
		System.out.println(map); //toString 재정의되어있다.
		
		//2.데이터 읽어오기
		System.out.println("key: 곱창전골의 가격="+map.get("곱창전골")+"원");
		System.out.println("key: 삼겹살의 가격="+map.get("삼겹살")+"원");
		
		//key 값으로 가져올 값이 없으면 결과(리턴값) null이 나온다.
		String key="백반";
		System.out.println("key: "+key+"의 가격="+map.get(key)+"원");
		
		map.put("돼지국밥", 8000); // 실행결과 : value가 변한다.
		System.out.println(map); // map은 key(모든타입이 될 수있다)가 index(정수) 역할을 한다.
								 // key 값은 유일한 값이다.(중복이 안됨)-변경할 때 put사용
		map.remove("불고기",10000);// 인자, 리턴형식 : Object-> 모든 타입
		//key,value 모두 일치할때 제거가 된다
		System.out.println("삭제결과:"+map);
		
		map.remove("불고기", 15000);
		System.out.println("삭제결과:"+map);
		
		int temp = map.remove("백반");
		System.out.println("remove int 리턴값:"+temp); //삭제된 항목의 value값이 반환
		System.out.println("삭제결과:"+map);
		
		
		
	}

}

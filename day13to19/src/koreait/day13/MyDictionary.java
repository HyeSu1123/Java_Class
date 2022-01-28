package koreait.day13;


import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> map = new TreeMap<String,String>();

		String sel,eng,kor;
		System.out.println("선택기능 1.단어저장 2.단어검색 3.단어장보기 4.프로그램끝내기");
		boolean run =true;
		
		while(run) { //while 반복안에 switch로 종료조건을 동작시킬때 break로 못한다. 그래서 변수 사용 
			System.out.print("번호 선택: ");
			sel = sc.nextLine();
			switch(sel) {
			case "1":
				System.out.println("English :");
				eng = sc.nextLine();
				System.out.println("Korean :");
				kor = sc.nextLine();
				if(map.containsKey(eng)) {
					//존재하는 key값으 value를 ","로 구분하여 연결하면서 저장
					String temp = map.get(eng);
					temp +="/" +kor;
					map.put(eng, temp);
				}
				else{map.put(eng, kor);}
				break;
			case "2":
				System.out.println("검색할단어 English :");
				eng = sc.nextLine();
				System.out.println("단어장 검색했습니다 결과: "+map.get(eng));
				break;
			case "3":
				System.out.println("단어장 전체보기"+map);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("잘못 입력된 선택입니다");
				break;
				
			}
		}//while 끝
		System.out.println("단어장을 종료합니다");
	}

}

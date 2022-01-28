package koreait.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		//예시 : StudentScore 객체가 파일에 저장되어있는데 하나의 문자열로"모모90 88 79"와 같은 형태로 되어있다
		//		저장되어 있는 문자열을 파일에서 읽어와서 다시 StudentScore 객체로 생성한다면
		//		구분기호 공백을 기준으로 데이터를 분리(토큰화)한다. StringToken 클래스 메소드로 사용
		
		String temp = "누구의점수 90 88 79";
		StringTokenizer stk = new StringTokenizer(temp);
		
		System.out.println("::nextToken 메소드 결과 확인::");
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}

		//stk 객체는 hasMoreTokens()로 모든 토큰을 다 읽으면 더 이상 읽을 토큰이 없을때 거짓이 된 상태여서 반복을 종료한다.
		//그래서 아래의 코딩으로 토크나이저를 초기화 하는 것이 필요하다
		stk = new StringTokenizer(temp); //이 코딩이 없으면 위의 코딩에서 거짓이 되어서 빠져나왔는데 그게 다시 참이 될 수는 없으니 초기화를 해주는 것이다.
		System.out.println(":::객체로 만들어 보자:::");
		while(stk.hasMoreTokens()) {
			StudentScore stu = new StudentScore(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),Integer.parseInt(stk.nextToken())
					,Integer.parseInt(stk.nextToken()));
			System.out.println(stu);
		}
		// \t\n\r\f : 공백, 탭, 줄바꿈(줄만), 잘 안쓰는 기호 --> carriage return(커서를 맨앞으로), form feed
		// 공백, 탭, 줄바꿈은 기본적인 구분 기호
		System.out.println("::::객체를 여러개 만드는 예시::::");
		temp = "누구 90 88 79\n누가 92 83 91\t누누 80 87 84";
		stk = new StringTokenizer(temp);
		//ArrayList에 여러 객체를 참조하도록 추가해보자
		List<StudentScore> stus = new ArrayList<>();
		while(stk.hasMoreTokens()) {
//			System.out.println(stk.nextToken());
			StudentScore stu = new StudentScore(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),Integer.parseInt(stk.nextToken())
					,Integer.parseInt(stk.nextToken()));
			stus.add(stu);
//			System.out.println(stu);
		}
		System.out.println("List : "+stus);
		
		
	}

}













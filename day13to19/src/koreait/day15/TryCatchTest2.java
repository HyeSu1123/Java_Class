package koreait.day15;

import java.util.Scanner;

public class TryCatchTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] menu = {"삼겹살","스파게티","곱창전골","불고기","탕수육"};
		int sel;
		boolean isOk = true;
		
		do {
		try {
			for(int i=0;i<menu.length;i++) {
				System.out.println("["+(i+1)+"]"+menu[i]);
			}
			System.out.print("주문할 음식을 선택하세요: ");
			sel = Integer.parseInt(sc.nextLine());
			System.out.println("주문을 완료했습니다. 당신의 주문 음식은"+menu[sel-1]+"입니다");
			isOk = false;
		} catch(NumberFormatException e) {
			System.out.println("메뉴선택은 숫자로만 하세요("+e.getMessage()+")");
			//continue 사용(밑에 아무것도 없으면 생략 가능)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 번호입니다.("+e.getMessage()+")");
		}
		}while(isOk);
	}//반복문으로 catch에 걸렸을때 다시 입력받는 코딩해보기

}

//try catch 활용 : 예를 들면 파일을 열때 없는 파일을 지정한다면 오류가 발생한다.
//자바 클래스들은 꼭 try catch를 하도록 한다.

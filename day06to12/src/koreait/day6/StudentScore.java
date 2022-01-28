package koreait.day6;

import java.util.Scanner;

public class StudentScore {
	int num;
	String name;
	int korean;
	int english;
	int science;
	
	//추가로 키보드 입력을 받는 메소드를 만들면 좋겠습니다.
		void inputData() {
			Scanner sc = new Scanner(System.in);
			//아직 객체가 생성되지 않은 상태이므로 클래스에서 this를 사용합니다. 
			//this는 실행할때 이 메소드를 실행하는 객체가 됩니다. 
			System.out.print("이름 ->  " );  		this.name = sc.nextLine();
			System.out.print("번호 ->  " ); 		this.num= sc.nextInt();
			System.out.print("국어 ->  " ); 		this.korean = sc.nextInt();
			System.out.print("영어 ->  " );		this.english = sc.nextInt();
			System.out.print("과학 ->  " );		this.science = sc.nextInt();
			
		}
	
	
	int sum() {
		return korean + english + science;
	}
	double avg() {
		return (double)(sum())/3;
	}
	void printScore() {
		System.out.println("학생 번호: "+num+"\n학생이름: "+name+"\n국어점수: "+korean+"\n영어점수: "+english+"\n과학점수: "+science);
	}
	
	@Override
	public String toString() {
		return "학생 번호: "+num+"\n학생이름: "+name+"\n국어점수: "+korean+"\n영어점수: "+english+"\n과학점수: "+science;
	}
	
	
	
	
}









package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2 {
//AnimalCommunity 내용을 ArrayList로 바꿔보기
	//작성자 :김혜수
	public static void main(String[] args) {
		//동물 클래스는 고양이객체, 강아지 객체, 토끼객체 등을 참조하도록한다
		//분양 가능한 동물 객체를 생성해서 참조하기
		Scanner sc = new Scanner(System.in);
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Puppy("브라우니","Brown"));
		animals.add(new Cat("냥이","Black"));
		animals.add(new Rabbit("바니","White"));
		animals.add(new Rabbit());
		animals.get(3).setName("버니");
		animals.get(3).setColor("black");
		
		System.out.println("[환영합니다.반려동물들을 보여드릴께요]");
		for(int i=0;i<animals.size();i++) {
			System.out.println(i+":"+animals.get(i));//자식클래스의 toString 재정의 내용으로 실행된다.
		}
		System.out.println("\n동물들이 울고있다");
		for(int i=0;i<animals.size();i++) {
			animals.get(i).sound();//자식 클래스가 구현한 내용으로 실행된다.
		}
		
		ArrayList<Member> members = new ArrayList<>();
		
		Member sanha = new Member("산하",17);
		
		System.out.println("분양을 원하는 아이의 숫자를 선택해주세요");
		int sel = sc.nextInt();
		
		System.out.println("선택하신"+animals.get(sel)+"는");
		if(sanha.isAdopt(animals.get(sel))) {
			System.out.println("분양 가능합니다");
		}else {
			System.out.println("죄송합니다 분양할 수 없는 나이입니다.");
		}
	}

}

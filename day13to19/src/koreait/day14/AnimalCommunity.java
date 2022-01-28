package koreait.day14;

import java.util.Scanner;

public class AnimalCommunity {
//반려동물 커뮤니티에는 무엇이 필요할까 용품 공동구매, 반려동물분양, 회원
	public static void main(String[] args) {
		//동물 클래스는 고양이객체, 강아지 객체, 토끼객체 등을 참조하도록한다
		//분양 가능한 동물 객체를 생성해서 참조하기
		Scanner sc = new Scanner(System.in);
		Animal[] animals = new Animal[5];
		
		animals[0] = new Puppy("브라우니", "Brown");
		animals[1] = new Cat();
		animals[2] = new Rabbit("바니","White");
		animals[1].setName("냥이");
		animals[1].setColor("Black");
		animals[3] = new Puppy();
		
		
		//회원은 반려동물 분양
		System.out.println("[환영합니다 반려동물을 보여드리겠습니다]\n");
		for(int i=0; i<animals.length; i++) {
			if(animals[i]!=null) {
				System.out.println(i+":"+animals[i]); //자식클래스의 toString 재정의 내용으로 실행된다.
			}
		}
		System.out.println("[우리 동물들의 소리를 들려드리겠습니다]");
		for(int i=0;i<animals.length;i++) {
			if(animals[i]!=null) {
				animals[i].sound(); //자식 클래스가 구현한 내용으로 실행된다.
			}
		}
		//분양을 원하면 회원 생성
		Member sana = new Member("사나",15);
//		System.out.println("분양 가능한지 확인: "+sana.isAdopt(animals[0]));
//		System.out.println("분양 가능한지 확인: "+sana.isAdopt(animals[1]));
//		System.out.println("분양 가능한지 확인: "+sana.isAdopt(animals[2]));
//		System.out.println("분양 가능한지 확인: "+sana.isAdopt(animals[3]));
		
		System.out.println("분양을 원하는 아이의 숫자를 선택해주세요:");
		int sel = sc.nextInt();
		
		System.out.println("선택하신"+animals[sel]+"는");
		if(sana.isAdopt(animals[sel])) {
			System.out.print("분양 가능합니다😉");
		}else {
			System.out.print("아쉽지만 분양 하실 수 없는 나이입니다.😭");
			
		}
		System.out.println("\nTYPE 상수필드 확인하기");//static 필드는 속해있는 클래스로 구별한다
		System.out.println(Animal.TYPE);
		System.out.println(Puppy.TYPE);
		System.out.println(Cat.TYPE);
		System.out.println(Rabbit.TYPE);
	}

}

package koreait.day6;

public class ForInForTest {
//중첩된 for문 이해를 위한 연습
	public static void main(String[] args) {
		
		for(int i=0; i<1; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=0; i<2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=0; i<4; i++) {
			System.out.print("*");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}
		System.out.println("\n\n\n");
		
		for(int k=1;k<=5;k++) {
			for(int i=0; i<k; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n\n");
		for(int k=1;k<=5;k++) {
			for(int i=0; i<k; i++) {
				System.out.print(i);
			}
			System.out.println("\t\t\tk="+k);
//			System.out.println("\t\t\t="+i);// 변수 i 는 안쪽 for문에서 선언된 변수 
//											   안쪽 for문이 종료되면 사용못한다.
		}
//		System.out.println("\t\t\t="+k); 	//중괄호를 벗어나서 실행 안됨.
	}

}

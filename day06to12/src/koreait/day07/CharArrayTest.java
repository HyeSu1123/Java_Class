package koreait.day07;

public class CharArrayTest {
//char 타입의 배열을 연습
	
	public static void main(String[] args) {
		//배열의 선언
		char[] carr1 = {'i','a','m','j','a','v','a'};
		char[] carr2 = new char[20];
		
		System.out.println("carr1 배열의 길이 :"+carr1.length);
		System.out.println("carr2 배열의 길이 :"+carr2.length);
		
		System.out.println("carr1 배열 3번째 데이터의 값"+ carr1[2]);//값 m
		System.out.println("carr2 배열 3번째 데이터의 값"+ carr2[2]);//값 ' '
		
		for(int i=0;i<carr1.length;i++) {	
			System.out.println("carr1["+i+"]의 데이터 값: "+carr1[i]);
		}
		//**
		for(int i=0;i<carr1.length;i++) {	
			System.out.print(carr1[i]);
		}
		System.out.println();
		//문자 타입 char의 배열은 문자열과 유사하다
		System.out.println(carr1); //위의 **for문과 동일한 출력
		
		String name = "java";
//		carr2 = "hello hi goodbye"; //char 배열에 바로 문자열을 대입하면 오류난다
		carr2 = "hello hi goodbye".toCharArray();
		System.out.println(carr2); // String 문자열 객체를 char 배열로 변환
		
		carr2 = "hello hi goodbye goodbye goodbye".toCharArray(); //선언된 배열의 크기보다 클 때
		System.out.println("carr2.length : "+ carr2.length); // 배열의 크기가 커진다
		
		
	}
}

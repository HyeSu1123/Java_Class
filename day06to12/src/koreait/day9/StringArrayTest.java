package koreait.day9;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayTest {
//문자열 (클래스)배열을 연습
	public static void main(String[] args) {
		
		String[] strArray = {"continue","break","switch","array","print"}; //초기값 지정하며 배열을 선언
	
		for(int i=0; i<strArray.length;i++) {
			System.out.println("i="+i+"문자열="+strArray[i]);
		}
		//string 클래스의 메소드 실행 : charAt(0), subString(2,5)를 각 배열 요소에 문자열로 실행
		for(int i=0;i<strArray.length;i++) {
			System.out.println("charAt(0) : "+strArray[i].charAt(0) +",subString(2,5) : "
					+strArray[i].substring(2,5));
		}
		
		String[] names = new String[5];	//지정된 문자열이 없으므로 값은 null상태
		for(int i=0;i<names.length;i++) {
			System.out.println("i="+i+",문자열="+names[i]);
		}
//		System.out.println("charAt(0) : "+names[0].charAt(0) +",subString(2,5) : "
//				+names[0].substring(2,5)); //문자열이 null일때 charAt 등 메소드 실행은 오류가 발생한다(NullPointerException)
		
		Scanner sc = new Scanner(System.in); 
		
		for(int i=0;i<names.length;i++) {
			System.out.print("이름을 입력하세요 : ");
			names[i] = sc.nextLine();
			
		}
		//names 배열 출력
		for(int i=0; i<names.length;i++) {
			System.out.println("i="+i+"이름="+names[i]); //String은클래스 문자열은 객체 ->names 배열, names[i] 둘 다 참조(주소)값을 저장
		}
		System.out.println("charAt(0) : "+names[0].charAt(0) +",subString(2,5) : "+names[0].substring(2,5));
		//names 배열의 영문자를 모두 대문자로 변환하여 names 배열 요소로 참조(지정)하도록 한다
		for(int i=0; i<names.length;i++) {
			names[i]= names[i].toUpperCase(); //names 배열 요소들이 참조하던 주소가 변경된다
		}
		System.out.println(Arrays.toString(names));
	}
}

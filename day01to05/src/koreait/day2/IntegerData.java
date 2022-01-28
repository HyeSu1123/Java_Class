package koreait.day2;

public class IntegerData {

	public static void main(String[] args) {
//정수 데이터 형식 연습(byte(1바이트), short(2), integer(4), long(8))
//Byte, Short, Integer, Long 클래스는 정수 데이터 형식을 다룹니다.(Wrapper 클래스종류)
		
		System.out.println("---1바이트에 저장하는 Byte 정수확인---");
		System.out.println("Byte 정수의 메모리의 할당크기: "+ Byte.BYTES);
		System.out.println("Byte 정수의 최소값: "+ Byte.MIN_VALUE);
		System.out.println("Byte 정수의 최대값: "+ Byte.MAX_VALUE);
		
		//Byte 클래스의 필드(특정한 값을 저장) : BYTES, MIN_VALUE, Byte.MAX_VALUE
		//필드는 일반적으로 모두 대문자로 표기한다.
		//필드 중에서 변하지 않는값(샹수)는 일반적으로 모두 대문자로 표기한다.
		//클래스를 구성하는 요소: 메소드(동작),필드(변하지 않는 값(상수))
		System.out.println();
		
		System.out.println("---2바이트에 저장하는 short 정수확인---");
		System.out.println("short 정수의 메모리의 할당크기: "+ Short.BYTES);
		System.out.println("short 정수의 최소값: "+ Short.MIN_VALUE);
		System.out.println("short 정수의 최대값: "+ Short.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("---4바이트에 저장하는 Integer 정수확인---");
		System.out.println("Integer 정수의 메모리의 할당크기: "+ Integer.BYTES);
		System.out.println("Integer 정수의 최소값: "+ Integer.MIN_VALUE);
		System.out.println("Integer 정수의 최대값: "+ Integer.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("---8바이트에 저장하는 Long 정수확인---");
		System.out.println("Long 정수의 메모리의 할당크기: "+ Long.BYTES);
		System.out.println("Long 정수의 최소값: "+ Long.MIN_VALUE);
		System.out.println("Long 정수의 최대값: "+ Long.MAX_VALUE);
	}
}

















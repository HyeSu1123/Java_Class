package koreait.day8;

public class StringMethod1 {
//charAt(), length() 메소드 외의것들
	public static void main(String[] args) {
		
		String msg = "hello, JAVA";
		String temp;
		//1.대소문자 변환 메소드
		temp = msg.toUpperCase();//"HELLO JAVA" 변환된 문자열을 메모리에 저장. 주소값은 temp에 저장
		System.out.println("대문자 변환 결과: "+temp);
		System.out.println("원본 msg = "+ msg);
		
		temp = msg.toLowerCase();
		System.out.println("소문자 변환 결과: "+temp);
		//"hello,java" 변환된 문자열을 메모리에 저장. 주소값은 temp에 저장
		System.out.println("원본 msg = "+ msg);
		
		msg = "   hi~ "; //msg 변수값이 다른 문자열을 참조한다 (새로운 문자열의 주소를 저장)
		System.out.println("원본 msg = "+ msg);
		
		//2. 공백제거
		//예를 들면 아이디 입력할때 공백이 포함되면 공백을 제거하는 용도로 활용할 수 있다
		temp = msg.trim();
		System.out.println("trim 변환 결과: "+temp);
		System.out.println("원본 msg = "+ msg);
		
		//3. 특정문자열 포함 여부
		msg="koreait.2022";
		System.out.println("gmail 포함확인 contains 메소드: "+msg.contains("gmail")); //거짓
		System.out.println("koreait 포함확인 contains 메소드: "+msg.contains("koreait"));//참
		
		//4.전체 문자열이 동일한지 비교 : 내용비교
		msg="momo";
		System.out.println("equals 비교(Momo)"+msg.equals("momo")); //참
		System.out.println("equals 비교(Momo)"+msg.equals("Momo")); //대문자로 인해 거짓
		System.out.println("equals 비교(Momo)"+msg.equals("momo ")); //공백으로 인해 거짓
		
		//5.문자열을 == 로 비교결과 : 주소 비교
		String t1 = "test" ,t2 = "java";
		String t3 = new String("test"); //String 객체를 생성하고 문자열은 "test"
		String t4 = "test";
		
		System.out.println("t1 == t2 :"+(t1 == t2)); //각각 내용이 다른 문지열 비교->주소값이 다름
		System.out.println("t1 == t3 :"+(t1 == t3)); //new연산으로 만들어진 객체를 참조
		System.out.println("t1 == t4 :"+(t1 == t4)); //문자열 내용이 같으면 -> 한번만 메모리에 저장
		
	}

}

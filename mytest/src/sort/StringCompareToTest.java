package sort;

public class StringCompareToTest {
	public static void main(String[] args) {
	
		String[] names = {"boa","momo","nayeon","zun","nana"};
		
		System.out.println("문자열비교1:"+"boa".compareTo("nana"));	//왼 < 오 : -12
		System.out.println("문자열비교1:"+"momo".compareTo("nana"));
		System.out.println("문자열비교2:"+"nana".compareTo("boa"));	//왼 > 오 : 12
		System.out.println("문자열비교2:"+"nana".compareTo("momo"));
		System.out.println("문자열비교2:"+"nana".compareTo("nayeon")); //왼 < 오 : -11
		
		//abcdefghijklmnopqrstuvwxyz
		
		System.out.println("한글 문자열 비교 1:"+"고양이".compareTo("염소"));	//왼 < 오 : -
		System.out.println("한글 문자열 비교 1:"+"고양이".compareTo("고양니"));	//왼 > 오 : +
		System.out.println("한글 문자열 비교 1:"+"다람쥐".compareTo("고양이"));	//왼 > 오 : +
		
		System.out.println("문자열비교3:"+"nana".compareTo("nana"));	// 0
	}
}

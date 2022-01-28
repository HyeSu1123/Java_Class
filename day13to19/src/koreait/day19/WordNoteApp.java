package koreait.day19;

public class WordNoteApp {

	public static void main(String[] args) {
		
//		EnglishKoreanNote eng_kor = new EnglishKoreanNote();
		
		WordNote eng_kor = new EnglishKoreanNote();
		
		eng_kor.start();	//디폴트 메소드를 추가하기 전에는 start가 없기때문에 오류가 났엇다.
							//start 메소드가 WordNote 참조타입 인터페이스에도 있어야 오류가 안생긴다.
				
		
		
	}

}

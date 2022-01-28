package koreait.day19;

import java.util.List;

public class Word {	//객체를 생성하는것이 목적인 클래스(객체는 데이터를 저장하는것이 목적, 메소드실행)

	private String english;
	private List<String> koreans; //영어단어 1개에 여러가지 뜻이 있을때, list에 add하기
	private int level;
	
	public Word(String english) {
		this.english = english;
	}
	public Word(String english, List<String> koreans) {
		this(english);
		this.koreans = koreans; //참조값(주소)를 전달한다.(인자값을 필드값으로 대입)
	}
	
	@Override
	public String toString() { 
		
		return english+":"+koreans;
	}
	
	public List<String> getKoreans() {
		return koreans;
	}
	public String getEnglish() {
		return english;
	}
	public void setKoreans(List<String> koreans) {
		this.koreans = koreans;
	}
	
	
}

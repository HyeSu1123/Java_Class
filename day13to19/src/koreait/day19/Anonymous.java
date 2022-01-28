package koreait.day19;

public class Anonymous {
	//익명(내부)클래스(Anonymous Inner Type) 연습
	
	public static void main(String[] args) {
		
//		RemoteControl rc = new RemoteControl(); //인터페이스
//		Animal animal = new Animal(); //추상클래스
//		오류 : 추상클래스와 인터페이스는 직접 객체를 생성하지 않는다.
		
		RemoteControl rc = new RemoteControl() {	//Anonymous Inner Type - 한번만 사용할 클래스
			//추상메소드 정의
			@Override
			public void turnOnOff() {
				System.out.println("전원 On/Off");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨 up/down:"+volume);
				
			}
		};	//익명클래스 정의 끝날때 ;(세미콜론) 붙여준다.
	
		rc.turnOnOff();
		rc.setVolume(10);
		rc.setMute(false);
		
		Animal animal = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("무요.");
				
			}
		};
		
		animal.sound();
	
	}
}

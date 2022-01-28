package koreait.day17;

public class Day17App1 {

	public static void main(String[] args) {
		//다형성 예시. - 객체의 실체는 1가지이나 여러가지 타입으로 참조할 수 있다.
		// 어떤 메소드의 인자 타입이 RemoteControl 이라면 mac1, mac2,mac3,mac4 모두 인자로 전달할 수 있다.
		
		
		MacBook mac1 = new MacBook();
		SmartMachine mac2 = new MacBook(); //부모타입으로 선언한 경우
		
//		mac1 = mac2;		//down casting(자식 타입으로 참조) - 강제 캐스팅 필요
		mac2 = mac1;		//up casting(부모타입으로 참조)
		
		RemoteControl rc = mac1;	//up casting
//		MacBook mb = rc;			//down casting - 강제 캐스팅 필요
		
		
		mac1.turnOnOff();
		mac1.turnOnOff();
		
		//인터페이스 타입으로 선언한 경우
		RemoteControl mac3 = new MacBook();
		WebSearch mac4 = new MacBook();
		
		mac1.setVolume(13);
		mac1.search("유툽");
		
		mac3.setVolume(19);
//		mac3.search("유튜브"); 	//오류 발생 : mac3의 참조타입인 RemoteControl은 search메소드가 없다
		
//		mac4.setVolume(13);	 	//오류 발생 : mac4의 탐조타입인 WebSearch은 setVolume 메소드가 없다
		
		
		//필요하다면 casting으로 메소드를 실행한다.
		MacBook temp = (MacBook)mac4;	//주소를 전달한다 : temp와 mac4 참조변수가 저장하는 주소는 같다
		temp.setVolume(11);
		
		WebSearch web = temp;	//자동 캐스팅이 된다. temp 변수가 MacBook 타입이므로 자동캐스팅이 된다.
		web = (WebSearch)mac3;
		
		//mac3이 RemoteControl 타입 
		//인터페이스의 static 메소드는 인터페이스로만 사용할 수 있다.
		RemoteControl.changeBattery();
		
		//인터페이스의 인스턴스 메소드 : RemoteControl을 구현한 객체이면서 참조타입이 RemoteControl 그룹중 하나일 때 모두 사용가능하다
		mac1.setMute(false);
		mac2.setMute(false);
		mac3.setMute(false);
//		mac4.setMute없음 			//WebSearch 그룹이라서 안된다. 참조타입이 RemoteControl과 관계없어서오류
		
		mac3.setMute(true);
		
	}

}

package koreait.day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {
//날짜와 시간 형식을 다루는 자바클래스 연습
	//1. java.util.Date 클래스 2.java.util.Calendar 클래스
	//3. java 8버전부터 java.time.LocalDate(날짜), LocalTime(시간), LocalDateTime(날짜와 시간) 클래스 
	
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("날짜확인: "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("시간확인: "+currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("날짜와 시간확인: "+current);
		
		//임의 날짜 또는 시간으로 객체를 생성한다
		LocalDate mybirth = LocalDate.of(1997, 3, 30);
		System.out.println("생일 확인"+mybirth);
		
		LocalTime mybirth_time = LocalTime.of(17, 20);
		System.out.println(" 탄생시간:"+mybirth_time);
		
		//현재 날짜로부터 5일 후를 계산
		int day=5;
		System.out.println("오늘 날짜+"+ day +"일은 "+currentDate.plusDays(day));
		day=30;
		System.out.println("오늘 날짜-"+ day +"일은 "+currentDate.minusDays(day));
		
		//내가 태어난지 몇일이 지났는지(날짜 사이의 간격계산)
		Period betwwn =Period.between(mybirth,currentDate);
		System.out.println("태어난지 "+betwwn.getYears()+"년");
		System.out.println("태어난지 "+betwwn.getMonths()+"달");
		System.out.println("태어난지 "+betwwn.getDays()+"일");
		
		long test = ChronoUnit.DAYS.between(mybirth, currentDate);
		System.out.println("test="+test);
		test = ChronoUnit.YEARS.between(mybirth,currentDate);
		System.out.println("test="+test);
		
		//Duration 클래스 : 시간 간격 계산할 때 사용하는 메소드
		//ChronoUnit : 시,분,초,년,월,주,일 단위로 모두 사용할 메소드가 있다.
	}

}

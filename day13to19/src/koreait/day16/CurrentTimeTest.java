package koreait.day16;

import java.text.DecimalFormat;

public class CurrentTimeTest {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
		long start = System.currentTimeMillis(); //ms: 0.001초, us: 0.000001초, ns: 0.000000001초 
												 //1970년 1월1일 0시 기준. 현재 2022년 1월1일 0시 
		long result = 53L*365L*24L*60L*60L*1000L;
		System.out.println(result); //53년 365일 24시간 60분 60초 1000ms
		
		//1년은 몇 ms 일까?
		
		System.out.println("1일은 "+(24L*60L*60L*1000L)+"ms입니다.");
		System.out.println("1년은 "+(365L*24L*60L*60L*1000L)+"ms입니다.");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		long t1 = 24L*60L*60L*1000L;
		long t2 = 365L*24L*60L*60L*1000L;
		
		System.out.println("1일은 "+df.format(t1)+"ms입니다");
		System.out.println("1년은 "+df.format(t2)+"ms입니다");
	}

}

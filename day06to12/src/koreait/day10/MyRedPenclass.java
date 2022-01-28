package koreait.day10;

import java.util.Random;

public class MyRedPenclass {
	
	int[] wrong;
	
	
	public int makeNumber(int min, int max) {
		Random r= new Random();
		return r.nextInt(max-min+1)+min; 
	}
	
	public MyRedPenclass(int[] wrong) {
		this.wrong=wrong;
	}

	public MyRedPenclass() {
		
	}
	
}

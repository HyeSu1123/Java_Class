package koreait.day17;

import java.util.ArrayList;
import java.util.List;

public class CompareTest2 {
	public static void main(String[] args) {
		//User 객체를 5개 생성하여 list에 담아서 sort해보자
		
		List<User> user = new ArrayList<>();
		//User 타입은 비교가능한 객체이다.
//		user.add(new User("라키",24));		
//		user.add(new User("문빈",25));
//		user.add(new User("은우",26));
		user.add(new User("산하",23));
		user.add(new User("MJ",29));
		user.add(new User("진진",27));

		
		user.sort(null);
		System.out.println(user);
		
	}
}

package koreait.day15;

public class MyFileRWTest {

	public static void main(String[] args) {
		
		MyFileRW.fileRead("/Users/nuwoonu/Desktop/dev/test/자바테스트.txt");
		
		String[] menu = {"삼겹살","스파게티","곱창전골","불고기","탕수육"};
		Member[] members = {new Member("산하",23),new Member("명준",29),null,null,null};
		
//		System.out.println(members.length);
		members[2]=new Member("빈이",25);
		members[3]=new Member("진진",27);
		members[4]=new Member("라키",24);
		
		//위 2개 배열을 파일에 쓰기 해보자
		String filename ="/Users/nuwoonu/Desktop/dev/test/members.txt";
		MyFileRW.fileWrite(filename, menu);
		MyFileRW.fileWrite(filename, members);//같은 파일 일때는 덮어쓰기
	}

}

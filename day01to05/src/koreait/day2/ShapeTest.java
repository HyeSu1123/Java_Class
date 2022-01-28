package koreait.day2;

public class ShapeTest {

	public static void main(String[] args) {
		//작성자: 김혜수
		//사각형
		int width = 23; // 선언하면서 초기값도 동시에 저장하는 방식
		int height = 0;
		int area = 0;
		
		height = 19;
		area = width * height;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로: "+width);
		System.out.println("세로: "+height);
		System.out.println("넓이를 구했습니다:"+area+"㎠\n");
		
		//원 : 결과를 출력할 때 소수점 이하 3자리로 출력하세요
		double redius = 0;
		double round = 0;
		double c_area = 0;
		redius = 23;
		round = 2 * 3.14 * redius;
		c_area = 3.14 * redius * redius;
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.println("반지름: "+redius);
		System.out.printf("둘레를 구했습니다: %.3f㎠\n",round);
		System.out.printf("넓이를 구했습니다: %.3f㎠\n",c_area);
	
		
	}
}

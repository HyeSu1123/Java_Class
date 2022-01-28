package koreait.day6;

public class StudentScoreTest {
//작성자: 김혜수 22.01.05
	public static void main(String[] args) {
		StudentScore std = new StudentScore();
		StudentScore std1 = new StudentScore();
		StudentScore std2 = new StudentScore();
		
		std.num = 1;
		std.name = "홍길동";
		std.korean = 80;
		std.english = 95;
		std.science = 85;

		std1.num = 2;
		std1.name = "가길동";
		std1.korean = 100;
		std1.english = 63;
		std1.science = 72;
		
		std2.num = 3;
		std2.name = "라길동";
		std2.korean = 66;
		std2.english = 90;
		std2.science = 48;
		
		std.printScore();
		System.out.println("학생 점수 합계: "+std.sum());
		System.out.printf("학생 점수 평균:%.2f\n ",std.avg());
		System.out.println("--------------------------");
		std1.printScore();
		System.out.println("학생 점수 합계: "+std1.sum());
		System.out.printf("학생 점수 평균:%.2f\n ",std1.avg());
		System.out.println("--------------------------");
		std2.printScore();
		System.out.println("학생 점수 합계: "+std2.sum());
		System.out.printf("학생 점수 평균:%.2f ",std2.avg());
		
		
	}

}

package koreait.day17test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentScoreTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<StudentScore> stus = new ArrayList<>();
		Random r = new Random();
		int max=100, min=10; //각 과목 점수의 난수 발생범위
		
		System.out.println("입력된 학생 인원수(1~10)만큼 성적 데이터가 난수로 발생됩니다.");
		System.out.print("학생 인원 수를 입력해주세요. -> ");
		//문제 2
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<num;i++) {
			//문제 3
			stus.add(new StudentScore(i+1,r.nextInt(max-min+1)+min, r.nextInt(max-min+1)+min,r.nextInt(max-min+1)+min));
			
			System.out.println("국어, 영어, 과학 점수가 자동으로 입력되었습니다.학생 이름을 입력해주세요.");
			System.out.print("이름-> ");
			stus.get(i).setName(sc.nextLine());
		}
		
		System.out.println(":::::지정된 성적 데이터를 확인하세요:::::");
		DecimalFormat df = new DecimalFormat("###.00");
		for(StudentScore score : stus) {
				
				System.out.print(score+ "  -총점: "+score.sum() + "평균: "+df.format(score.avg())+"\n");
			
		}
		System.out.println(":::::총점 기준 최우수 학생 이름과 점수입니다.:::::");
		int max_sum = stus.get(0).sum();
		//문제 5
		int max_idx =0;
		for(int i=0;i <num;i++) {
			if(max_sum < stus.get(i).sum()) {
				max_sum = stus.get(i).sum();
				max_idx = i;
				
			}
		}
		System.out.println("최우수 학생: "+ stus.get(max_idx).getName()+
				"(총점 :"+stus.get(max_idx).sum()
				+",평균: "+ df.format(stus.get(max_idx).avg())+")");
		
		
	}
	
	
	
	
	

}

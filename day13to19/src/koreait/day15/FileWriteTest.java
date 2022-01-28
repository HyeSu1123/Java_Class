package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteTest {
//System.out : 표준 출력(콘솔/모니터 출력) 
//지금까지의 출력은 표준 출력이었으니 이제는 파일출력을 연습해보자
//파일출력의 기본 : 경로(어디에 있는 파일인지의 위치), 파일명(파일이름)
	public static void main(String[] args) {
		
		String filename = "/Users/nuwoonu/Desktop/dev/test/자바테스트.txt";
		
		//파일 객체를 생성합니다.
		File file = new File(filename);
		
		//file 참조하는 파일 객체를 데이터 출력에 사용하기 위한 클래스는 PrintWriter 이다.
		try { //파일 입력 또는 파일 출력할 때 자바는 꼭 try catch로 처리하도록 한다.
			PrintWriter pw = new PrintWriter(file);
			//파일에 쓰기
			pw.println("산하 90 88 79");
			pw.println("명준 80 98 83");
			
			pw.close(); //파일 작업 종료 : 출력버퍼에서 파일로 전송된다.
			
			System.out.println("파일 출력이 완료되었습니다");
			
		} catch (FileNotFoundException e) { //파일 출력은 파일없으면 자동 생성한다. Exception 안생긴다.
											//그러나 경로지정을 잘못하면 (없는경로) Exception 생긴다.
			System.out.println("없는 파일을 선택했습니다("+e.getMessage()+")");
		}
	}

}

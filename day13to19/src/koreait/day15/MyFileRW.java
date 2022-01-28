package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFileRW {

	static void fileWrite(String filename, Object[] data) { //어떤 자료형이 올지 모르니 오브젝트로 배열을 사용
		File file = new File(filename);
		
		try { // 파일 입력 또는 파일 출력할 때 자바는 꼭 try catch로 처리하도록 한다.
			PrintWriter pw = new PrintWriter(file);
			// 파일에 쓰기
			for (int i = 0; i < data.length; i++)
				pw.println(data[i]);

			pw.close(); // 파일 작업 종료 : 출력버퍼에서 파일로 전송된다.

			System.out.println("파일 출력이 완료되었습니다");

		} catch (FileNotFoundException e) { 
			System.out.println("없는 파일을 선택했습니다(" + e.getMessage() + ")");
		}
	}

	static void fileRead(String filename) {
		File file = new File(filename);
		try {
			Scanner fsc = new Scanner(file);
			while (fsc.hasNext()) {
				System.out.println(fsc.nextLine());
			}
			fsc.close();
		} catch (FileNotFoundException e) {
			System.out.println("경로/파일명 오류:" + e.getMessage());
		}
	}

}

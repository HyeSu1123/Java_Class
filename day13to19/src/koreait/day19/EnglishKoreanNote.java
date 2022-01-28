package koreait.day19;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFrame;
//EnglishKoreanNote 클래스는 WordNote 인터페이스 규칙(추상메소드)을 따르고 그의 그룹이 된다.
public class EnglishKoreanNote implements WordNote { //영한 단어장
	private Scanner sc = new Scanner(System.in);
	private List<Word> mywords = new ArrayList<>(); // 단어들의 목록(단어장)

	//1.인스턴스 메소드였는데 디폴트 메소드를 생성하면서 재정의했다.
	public void start() {
		JFrame f = new JFrame();		//파일 대화상자 사용을 위한 객체 생성
		FileDialog fd;
		
		boolean run = true;
		while (run) {
			System.out.println("선택 기능 👉   1. 단어추가 2. 단어장보기 3. 파일에 저장 4. 파일을 불러오기 5. 프로그램 끝내기");
			System.out.print("선택:");
			String sel = sc.nextLine();
			String filename;	
			
			switch (sel) {
			case "1":
				wordAdd();
				break;
			case "2":
				wordList();
				break;
			case "3":
				fd = new FileDialog(f,"파일저장",FileDialog.SAVE);
				filename = fd.getDirectory() + fd.getFile();
				fd.setVisible(true);
				wordSave(filename);
				break;
			case "4":
				fd = new FileDialog(f,"파일열기",FileDialog.LOAD);
				filename = fd.getDirectory() + fd.getFile();
				fd.setVisible(true);
				wordRead(filename);
				break;
			case "5":
				run = false;
				break;
			default:
				System.out.println(":::::잘못된 선택입니다.:::::");
				break;
			}

		} // while end
		System.out.println("------프로그램을 종료합니다.------");
	}// main end

	//2.WordNote 인터페이스의 추상메소드 4를 구현했습니다.
	public void wordAdd() { // 추상메소드 public이므로 구현 메소드도 public만 가능하다
		System.out.println("[새로운 단어 추가]");
		do {
			System.out.print("English: ");
			String eng = sc.nextLine();
			System.out.print("우리말 뜻: ");
			String kor = sc.nextLine();

			// 입력받은 eng가 mywords 리스트에 있는지 확인, 있다면: 몇번째 인덱스에 있는지 알아내서 그 위치에 kor담기
			// 없다면: kor 추가할 리스트 생성해서 담기
			List<String> koreans;
//			int index=-1;
			boolean flag = false;
			for (int i = 0; i < mywords.size(); i++) {
				Word w = mywords.get(i);
				if(w.getEnglish().equals(eng)) {	//단어장에 있는 단어일때
//					index = i; //index 변수는 for문 밖에서 같은 단어의 인덱스 위치값을 활용할 때 사용하면 된다.
					flag= true;
					koreans = w.getKoreans(); //이미 존재하는 리스트 객체를 가져와서 koreans 변수기 참조
					koreans.add(kor);
					break;
				}
			}
			//index 변수가 -1이라면 단어장에 없는 단어이다. 이때 kor에 추가할 리스트 생성해서 담기-> word 객체 생성해서 mywords 에 추가
			if(!flag){	//if(index == -1) {
				koreans = new ArrayList<>();	//우리말 뜻이 목록으로 생성
				koreans.add(kor);	
				mywords.add(new Word(eng,koreans));
			}
			
			System.out.print("단어추가 계속 하시겠습니까?(y or n):");
		} while (sc.nextLine().equals("y"));
	}

	public void wordList() { // 단어 목록
		for (Word w : mywords) {
			System.out.println(w);
		}
	}

	public void wordSave(String filename) { // 파일에 단어들을 저장하기(저장할 파일 경로와 파일이름을 filename으로 전달)
		File file = new File(filename);
		
		try {
			PrintWriter pw = new PrintWriter(file);
			for( Word w : mywords) {
				pw.println(w);
			}
			pw.close();
			System.out.println("파일이 저장되었습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로 또는 파일입니다");
		} 
	}
	public void wordRead(String filename) { // 파일에 저장된 단어들 읽어오기
		File file = new File(filename);
		
		try {
			Scanner fsc = new Scanner(file);
			while(fsc.hasNext()) {	//파일 읽기 -> mywords 리스트에 저장할 객체로 생성해야 한다...
//				System.out.println(fsc.nextLine());	//테스트 1
				StringTokenizer stk = new StringTokenizer(fsc.nextLine(),":[]"); //구분 기호
				while(stk.hasMoreTokens()) {	//파일에서 1라인씩 읽어오고 그것을 토큰화 하기.-> Word 객체로 생성할 필드값
//					System.out.println(stk.nextToken(":["));
					Word w = new Word(stk.nextToken());	//첫번째 토큰을 english 필드값 저
					List<String> kor = Arrays.asList(stk.nextToken().split(", ")); //split 결과 타입은 배열을 리스트로 변환
					kor = new ArrayList<String>(kor);	//고정리스트를 변경할 수 있는 리스트 객체로 생성하기
					w.setKoreans(kor);	//두번째 토큰을 리스트로 변환해서 koreans 필드값으로 참조
					mywords.add(w);		//words 객체를 mywords 리스트에 추가하기
					//substring 메소드로 "]" 제외: String temp = stk.nextToken(); temp.substring(0,temp-1).split(", ");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로 또는 파일입니다");
		}catch(Exception e) {
			System.out.println("잘못된 파일 형식입니다.기타"+e.getMessage());
		}
	}
}








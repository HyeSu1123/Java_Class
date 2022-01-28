package koreait.day18;

import java.awt.FileDialog;

import javax.swing.JFrame;

public class FileDialogTest {

	public static void main(String[] args) {
		//콘솔에서 입출력으로 실행하는 프로그램: CLI(Command Line Interface) <-> GUI(Graphic User Interface)
		//자바에서도 GUI 를 만들 수 있는 클래스들이 있다. 그 중 하나인 파일 대화상자를 사용한다.
		//Windows OS 프로그램들이 window라는 틀 안에서 만들어지는데 자바에서는 그것을 프레임이라고 한다.
		
		JFrame f = new JFrame();		//파일 대화 상자를 시작할 프레임 객체
		
		FileDialog fdr = new FileDialog(f,"파일열기",FileDialog.LOAD);//	파일 대화상자 객체 생성
		fdr.setVisible(true);				//파일 대화상자 보이기
		
		String filename = fdr.getDirectory() + fdr.getFile();	//선택한 파일의 경로와 파일명 연결
		System.out.println("선택한 경로와 파일:"+filename);
		System.out.println("선택한 경로:"+fdr.getDirectory()+"선택한 파일:"+fdr.getFile());
		
		
		FileDialog fdw = new FileDialog(f,"파일저장",FileDialog.SAVE);
		fdw.setVisible(true);
		System.out.println("저장한 경로와 파일"+fdw.getDirectory()+fdw.getFile());
		
		
		
	}

}

package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {

	//생성자 
	public CommonsDialog() {
		// 위치와 크기를 같이 설정 앞 : 위치 ,뒤 : 크기
		setBounds(1300, 900, 600, 600);
		setTitle("공통 대화 사장");

		// 파일 대화 상자 만들기
		FileDialog fd = new FileDialog(this, "파일 대화상자");
 
		// 디렉토리 설정
		fd.setDirectory("C:\\이우미\\자바_C\\자바");

		// 파일 대화 상자를 화면에 출력
		fd.setVisible(true);

		// 선택한 파일 경로 가져오기
		String filePath = fd.getDirectory() + fd.getFile();
		System.out.println(filePath);
		
		Label lb = new Label(filePath);
		add(lb);
		// 화면 출력
		setVisible(true);
	}
}

package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginWindow extends Frame {

	// 생성자 - 인스턴스를 만들 때 호출하는 메소드
	public LoginWindow() {
		// 크기와 위치 및 타이틀 설정
		// 크기
		setSize(500, 500);
		// 위치 : setLication(가로,세로);
		setLocation(700, 700);
		// 타이틀
		setTitle("로그인");

		// 패널 생성
		Panel panel = new Panel();

		Label label = new Label("아이디");
		// 글자 입력 상자 TextField(글자수를 쓸 수 있는 길이)
		TextField textID = new TextField(10);
		panel.add(label);
		panel.add(textID);

		Label lblPw = new Label("비밀번호");
		TextField textPw = new TextField(20);

		// TextField에 입력한 글자를 *로 바꿔서 보여줌
		textPw.setEchoChar('*');

		panel.add(lblPw);
		panel.add(textPw);

		Button btn = new Button("로그인");

		panel.add(btn);

		TextArea txtarea = new TextArea(10, 30);
		txtarea.setText("글자를 입력하세요.");

		panel.add(txtarea);

		add(panel);

		// 화면 출력
		setVisible(true);
	}
}

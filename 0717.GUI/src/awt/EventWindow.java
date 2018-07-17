package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventWindow extends Frame {

	public EventWindow() {
		// 크기,위치,타이틀
		setSize(700, 700);
		setLocation(500, 500);
		setTitle("이벤트 처리");

		// 버튼생성
		Button btn = new Button("버튼");

		
		// 패널 생성
		Panel panel = new Panel();

		panel.add(btn);

		
		// 버튼을 누를 때 이벤트를 처리하는 ActionListener
		// 인터페이스가 처리합니다.
		ActionListener listener1 = new ActionListener() {

			// 버튼이 눌러지면 호출되는 메소드
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// 프로그램 종료

				System.exit(0);

			}

		};

		// 버튼과 리스너 연결
		// btn1에 ActionEvent가 발생하면
		// listener1의 메소드를 호출하도록 설정
		btn.addActionListener(listener1);

		add(panel);

		// 화면 출력
		setVisible(true);
	}
}

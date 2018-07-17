package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {

	public EventRouting() {
		setBounds(400, 400, 500, 500);
		setTitle("이벤트 라우팅");

		Button btn1 = new Button("한국어");
		Button btn2 = new Button("영어");
		Button btn3 = new Button("종료");

		
		
		Label label = new Label();

		Panel Cpanel = new Panel();

		Cpanel.add(btn1);
		Cpanel.add(btn2);
		Cpanel.add(btn3);

		add("Center", Cpanel);

		add("South", label);

		
		
		/*
		 * // ActionEvent를 처리할 수 있는 인스턴스 만들기 ActionListener listener1 = new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub label.setText("안녕하세요."); } }; // 컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		 * btn1.addActionListener(listener1);
		 * 
		 * // ActionEvent를 처리할 수 있는 인스턴스 만들기 ActionListener listener2 = new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub label.setText("Hello"); } }; // 컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		 * btn2.addActionListener(listener2);
		 * 
		 * // ActionEvent를 처리할 수 있는 인스턴스 만들기 ActionListener listener3 = new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub System.exit(0); } }; // 컴포넌트와 이벤트를 처리할 수 있는 리스너를 연결
		 * btn3.addActionListener(listener3);
		 * 
		 */

		// 이벤트 라우팅 - 하나의 리스너가 여러 컴포넌트의 이벤트를 처리하는 것
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트가 발생한 컴포넌트의 문자열을 가지고 분기
				switch (e.getActionCommand()) {
				case "한국어":
					label.setText("안녕하세요");
					break;
				case "영어":
					label.setText("Hello");
					break;
				case "종료":
					label.setText("종료");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.exit(0);
					break;
				}
			}
		};
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);

		setVisible(true);
	}
}

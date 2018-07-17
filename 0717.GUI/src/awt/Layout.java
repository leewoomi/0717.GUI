package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;



public class Layout extends Frame {

	public Layout() {
		setSize(600,600);
		setLocation(500,500);
		setTitle("Layout");
		
		
		Panel panel = new Panel();
		//panel의 레이아웃을 설정
//		panel.setLayout(new FlowLayout());
//		
//		Button btn =null;
//		//컴포넌트 배치
//		for(int i =0; i<10; i++) {
//			btn = new Button("버튼"+i);
//			panel.add(btn);
//		}
		
		
//		panel.setLayout(new BorderLayout());
//		Button btnWest = new Button("서쪽");
//		panel.add("West", btnWest);
//		Button btnEast =new Button("동쪽");
//		panel.add("East", btnEast);
//		Button btnCenter = new Button("중앙");
//		panel.add("Center", btnCenter);
//		Button btnNorth = new Button("북");
//		panel.add("North", btnNorth);
//		Button btnSouth = new Button("남");
//		panel.add("South", btnSouth);
//		
//		//(행, 열, 세로여백 , 가로여백)
//		panel.setLayout(new GridLayout(2,3,20,30));
//		Button btn =null;
//		//i가 행*열 보다 많으면 알아서 늘어남.
//		for(int i = 0 ; i< 26; i++) {
//			btn = new Button("버튼"+i);
//			panel.add(btn);
//		}
//		
		
		
	panel.setLayout(null);
	Label label = new Label("@");
	label.setBounds(10,50,30,50);
	add(label);
		
		add(panel);
		//화면 크기 조절을 못하도록 설정
		setResizable(false);
		
		setVisible(true);
		
		Thread thread = new Thread() {
			int sign = 10;
			public void run() {
				while(true) {
					try {
						Thread.sleep(100);
						int x = label.getLocation().x;
						int y = label.getLocation().y;
					if(x> 590) {
						sign = -10;
					}
					if(x<10) {
						sign =10;
					}
						label.setLocation(x+sign,y);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
		
	}
}

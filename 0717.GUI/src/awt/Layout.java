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
		//panel�� ���̾ƿ��� ����
//		panel.setLayout(new FlowLayout());
//		
//		Button btn =null;
//		//������Ʈ ��ġ
//		for(int i =0; i<10; i++) {
//			btn = new Button("��ư"+i);
//			panel.add(btn);
//		}
		
		
//		panel.setLayout(new BorderLayout());
//		Button btnWest = new Button("����");
//		panel.add("West", btnWest);
//		Button btnEast =new Button("����");
//		panel.add("East", btnEast);
//		Button btnCenter = new Button("�߾�");
//		panel.add("Center", btnCenter);
//		Button btnNorth = new Button("��");
//		panel.add("North", btnNorth);
//		Button btnSouth = new Button("��");
//		panel.add("South", btnSouth);
//		
//		//(��, ��, ���ο��� , ���ο���)
//		panel.setLayout(new GridLayout(2,3,20,30));
//		Button btn =null;
//		//i�� ��*�� ���� ������ �˾Ƽ� �þ.
//		for(int i = 0 ; i< 26; i++) {
//			btn = new Button("��ư"+i);
//			panel.add(btn);
//		}
//		
		
		
	panel.setLayout(null);
	Label label = new Label("@");
	label.setBounds(10,50,30,50);
	add(label);
		
		add(panel);
		//ȭ�� ũ�� ������ ���ϵ��� ����
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

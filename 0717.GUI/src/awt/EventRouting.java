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
		setTitle("�̺�Ʈ �����");

		Button btn1 = new Button("�ѱ���");
		Button btn2 = new Button("����");
		Button btn3 = new Button("����");

		
		
		Label label = new Label();

		Panel Cpanel = new Panel();

		Cpanel.add(btn1);
		Cpanel.add(btn2);
		Cpanel.add(btn3);

		add("Center", Cpanel);

		add("South", label);

		
		
		/*
		 * // ActionEvent�� ó���� �� �ִ� �ν��Ͻ� ����� ActionListener listener1 = new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub label.setText("�ȳ��ϼ���."); } }; // ������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		 * btn1.addActionListener(listener1);
		 * 
		 * // ActionEvent�� ó���� �� �ִ� �ν��Ͻ� ����� ActionListener listener2 = new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub label.setText("Hello"); } }; // ������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		 * btn2.addActionListener(listener2);
		 * 
		 * // ActionEvent�� ó���� �� �ִ� �ν��Ͻ� ����� ActionListener listener3 = new
		 * ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub System.exit(0); } }; // ������Ʈ�� �̺�Ʈ�� ó���� �� �ִ� �����ʸ� ����
		 * btn3.addActionListener(listener3);
		 * 
		 */

		// �̺�Ʈ ����� - �ϳ��� �����ʰ� ���� ������Ʈ�� �̺�Ʈ�� ó���ϴ� ��
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �̺�Ʈ�� �߻��� ������Ʈ�� ���ڿ��� ������ �б�
				switch (e.getActionCommand()) {
				case "�ѱ���":
					label.setText("�ȳ��ϼ���");
					break;
				case "����":
					label.setText("Hello");
					break;
				case "����":
					label.setText("����");
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

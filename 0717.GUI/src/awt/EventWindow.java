package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventWindow extends Frame {

	public EventWindow() {
		// ũ��,��ġ,Ÿ��Ʋ
		setSize(700, 700);
		setLocation(500, 500);
		setTitle("�̺�Ʈ ó��");

		// ��ư����
		Button btn = new Button("��ư");

		
		// �г� ����
		Panel panel = new Panel();

		panel.add(btn);

		
		// ��ư�� ���� �� �̺�Ʈ�� ó���ϴ� ActionListener
		// �������̽��� ó���մϴ�.
		ActionListener listener1 = new ActionListener() {

			// ��ư�� �������� ȣ��Ǵ� �޼ҵ�
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				// ���α׷� ����

				System.exit(0);

			}

		};

		// ��ư�� ������ ����
		// btn1�� ActionEvent�� �߻��ϸ�
		// listener1�� �޼ҵ带 ȣ���ϵ��� ����
		btn.addActionListener(listener1);

		add(panel);

		// ȭ�� ���
		setVisible(true);
	}
}

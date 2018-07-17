package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginWindow extends Frame {

	// ������ - �ν��Ͻ��� ���� �� ȣ���ϴ� �޼ҵ�
	public LoginWindow() {
		// ũ��� ��ġ �� Ÿ��Ʋ ����
		// ũ��
		setSize(500, 500);
		// ��ġ : setLication(����,����);
		setLocation(700, 700);
		// Ÿ��Ʋ
		setTitle("�α���");

		// �г� ����
		Panel panel = new Panel();

		Label label = new Label("���̵�");
		// ���� �Է� ���� TextField(���ڼ��� �� �� �ִ� ����)
		TextField textID = new TextField(10);
		panel.add(label);
		panel.add(textID);

		Label lblPw = new Label("��й�ȣ");
		TextField textPw = new TextField(20);

		// TextField�� �Է��� ���ڸ� *�� �ٲ㼭 ������
		textPw.setEchoChar('*');

		panel.add(lblPw);
		panel.add(textPw);

		Button btn = new Button("�α���");

		panel.add(btn);

		TextArea txtarea = new TextArea(10, 30);
		txtarea.setText("���ڸ� �Է��ϼ���.");

		panel.add(txtarea);

		add(panel);

		// ȭ�� ���
		setVisible(true);
	}
}

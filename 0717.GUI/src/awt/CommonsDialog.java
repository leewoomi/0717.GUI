package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {

	//������ 
	public CommonsDialog() {
		// ��ġ�� ũ�⸦ ���� ���� �� : ��ġ ,�� : ũ��
		setBounds(1300, 900, 600, 600);
		setTitle("���� ��ȭ ����");

		// ���� ��ȭ ���� �����
		FileDialog fd = new FileDialog(this, "���� ��ȭ����");
 
		// ���丮 ����
		fd.setDirectory("C:\\�̿��\\�ڹ�_C\\�ڹ�");

		// ���� ��ȭ ���ڸ� ȭ�鿡 ���
		fd.setVisible(true);

		// ������ ���� ��� ��������
		String filePath = fd.getDirectory() + fd.getFile();
		System.out.println(filePath);
		
		Label lb = new Label(filePath);
		add(lb);
		// ȭ�� ���
		setVisible(true);
	}
}

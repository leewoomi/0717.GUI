package awt;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class MenuWindow extends Frame {

	public MenuWindow() {
		setSize(600,600);
		setLocation(200, 200);
		setTitle("�޴�");
		
		Panel panel = new Panel();
		
		//�޴� �� �����
		MenuBar menuBar = new MenuBar();
		
		//�޴� �ٸ� �����쿡 ��ġ
		setMenuBar(menuBar);
		
		
		//�޴�����
		Menu file = new Menu("����(F)");
		
		//�޴��� �޴� �ٿ� ����
		menuBar.add(file);
		
		
		MenuItem newFile = new MenuItem("���θ����");
		file.add(newFile);
		MenuItem save = new MenuItem("����");
		file.add(save);
		Menu edit = new Menu("���� >");
		MenuItem copy = new MenuItem("����");
		edit.add(copy);
		file.add(edit);
		
		
		Menu play = new Menu("���");
		
		menuBar.add(play);
		
		Menu stop = new Menu("���� >");
		
		play.add(stop);
		
		MenuItem restart = new MenuItem("�ٽý���");
		
		stop.add(restart);
		
		Menu exit = new Menu("����");
		menuBar.add(exit);
		
		//�г��� �����ӿ� ����
		add(panel);
		
		//ȭ�� ���
		setVisible(true);
	}
}

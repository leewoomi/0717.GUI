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
		setTitle("메뉴");
		
		Panel panel = new Panel();
		
		//메뉴 바 만들기
		MenuBar menuBar = new MenuBar();
		
		//메뉴 바를 윈도우에 배치
		setMenuBar(menuBar);
		
		
		//메뉴생성
		Menu file = new Menu("파일(F)");
		
		//메뉴를 메뉴 바에 부착
		menuBar.add(file);
		
		
		MenuItem newFile = new MenuItem("새로만들기");
		file.add(newFile);
		MenuItem save = new MenuItem("저장");
		file.add(save);
		Menu edit = new Menu("편집 >");
		MenuItem copy = new MenuItem("복사");
		edit.add(copy);
		file.add(edit);
		
		
		Menu play = new Menu("재생");
		
		menuBar.add(play);
		
		Menu stop = new Menu("중지 >");
		
		play.add(stop);
		
		MenuItem restart = new MenuItem("다시시작");
		
		stop.add(restart);
		
		Menu exit = new Menu("종료");
		menuBar.add(exit);
		
		//패널을 프레임에 부착
		add(panel);
		
		//화면 출력
		setVisible(true);
	}
}

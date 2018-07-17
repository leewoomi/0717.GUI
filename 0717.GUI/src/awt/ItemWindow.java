package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemWindow extends Frame {

	public ItemWindow() {
		setBounds(500, 700, 500, 500);
		setTitle("이벤트 핸들링");

		Panel Npanel = new Panel();

		Checkbox cbboolean = new Checkbox("boolean");
		Checkbox cbbyte = new Checkbox("byte");
		Checkbox cbshort = new Checkbox("short");
		Checkbox cbchar = new Checkbox("char");
		Checkbox cbint = new Checkbox("int");
		Checkbox cblong = new Checkbox("long");
		Checkbox cbfloat = new Checkbox("float");
		Checkbox cbdouble = new Checkbox("double");

		Npanel.add(cbboolean);
		Npanel.add(cbbyte);
		Npanel.add(cbshort);
		Npanel.add(cbchar);
		Npanel.add(cbint);
		Npanel.add(cblong);
		Npanel.add(cbfloat);
		Npanel.add(cbdouble);

		add("North", Npanel);

		// 중앙에 TextArea 배치
		TextArea ta = new TextArea(10, 70);
		add("Center", ta);

		// 하단에 ComboBox 2개 배치
		// 콤보박스에 배치할 데이터 만들기
		String[] category = { "Programming", "Database", "IDE", "Framework" };
		String[][] content = { { "Java", "JavaScript", "Swift" }, { "Oracle", "MySQL", "MongoDB" },
				{ "Eclipse", "Adroid Studio", "Xcode" }, { "Spring", "MyBatis", "Hibernate" } };

		Choice cbcategory = new Choice();
		for (String imsi : category) {
			cbcategory.add(imsi);
		}

		Choice cbcontent = new Choice();
		for (String imsi : content[0]) {
			cbcontent.add(imsi);
		}

		Button btnselect = new Button("선택");
		Button btnExit = new Button("종료");

		Panel Spanel = new Panel();
		Spanel.add(cbcategory);
		Spanel.add(cbcontent);
		Spanel.add(btnselect);
		Spanel.add(btnExit);

		ItemListener itemHandler1 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub

				// e.getSource()는 이벤트가 발생한 객체
				// ta.append(e.getSource().toString() + "을 눌렀습니다." + "\n");

				// 이벤트가 발생한 인스턴스를 원래의 자료형인 Checkbox로 변환
				// 이벤트처리 메소드에서
				// e.getSource()는 이벤트가 발생한
				// 인스턴스의 주소를 리턴합니다.
				Checkbox cb = (Checkbox) (e.getSource());
				// 체크 박스에 입력된 텍스트 가져오기
				String label = cb.getLabel();
				// 체크 박스 선택 여부 가져오기
				boolean b = cb.getState();

				if (b == true) {

					ta.append(label + "\n");
				}
			}
		};
		// 체크박스를 눌렀을 때 호출 될 인스턴스 설정
		cbboolean.addItemListener(itemHandler1);
		cbbyte.addItemListener(itemHandler1);
		cbchar.addItemListener(itemHandler1);
		cbshort.addItemListener(itemHandler1);
		cbdouble.addItemListener(itemHandler1);
		cbint.addItemListener(itemHandler1);
		cbfloat.addItemListener(itemHandler1);
		cblong.addItemListener(itemHandler1);

		// 카테고리 콤보 박스의 선택이 변경되었을 때
		// 호출될 메소드를 가진 Listener
		// ItemListener가 처리
		ItemListener itemHandler2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// cbcategory의 선택된 행 번호 가져오기
				int row = cbcategory.getSelectedIndex();
				// cbcontent의 내용을 전부 삭제
				cbcontent.removeAll();
				// 행번호에 해당하는 세부 내용을 cbcontent에 추가
				for (String temp : content[row]) {
					cbcontent.add(temp);
				}

			}
		};

		cbcategory.addItemListener(itemHandler2);
		cbcontent.addItemListener(itemHandler2);

		ActionListener action1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				int caNum = cbcategory.getSelectedIndex();
				int coNum = cbcontent.getSelectedIndex();
				String categoryText = category[caNum];
				String contentText = content[caNum][coNum];
				ta.setText(categoryText + " : " + contentText);
			}
		};

		btnselect.addActionListener(action1);

		// 종료 버튼 누르면 프로그램 종료
		ActionListener action2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		};

		btnExit.addActionListener(action2);

		add("South", Spanel);

		setVisible(true);
	}
}

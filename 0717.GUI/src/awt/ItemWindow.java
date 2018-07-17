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
		setTitle("�̺�Ʈ �ڵ鸵");

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

		// �߾ӿ� TextArea ��ġ
		TextArea ta = new TextArea(10, 70);
		add("Center", ta);

		// �ϴܿ� ComboBox 2�� ��ġ
		// �޺��ڽ��� ��ġ�� ������ �����
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

		Button btnselect = new Button("����");
		Button btnExit = new Button("����");

		Panel Spanel = new Panel();
		Spanel.add(cbcategory);
		Spanel.add(cbcontent);
		Spanel.add(btnselect);
		Spanel.add(btnExit);

		ItemListener itemHandler1 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub

				// e.getSource()�� �̺�Ʈ�� �߻��� ��ü
				// ta.append(e.getSource().toString() + "�� �������ϴ�." + "\n");

				// �̺�Ʈ�� �߻��� �ν��Ͻ��� ������ �ڷ����� Checkbox�� ��ȯ
				// �̺�Ʈó�� �޼ҵ忡��
				// e.getSource()�� �̺�Ʈ�� �߻���
				// �ν��Ͻ��� �ּҸ� �����մϴ�.
				Checkbox cb = (Checkbox) (e.getSource());
				// üũ �ڽ��� �Էµ� �ؽ�Ʈ ��������
				String label = cb.getLabel();
				// üũ �ڽ� ���� ���� ��������
				boolean b = cb.getState();

				if (b == true) {

					ta.append(label + "\n");
				}
			}
		};
		// üũ�ڽ��� ������ �� ȣ�� �� �ν��Ͻ� ����
		cbboolean.addItemListener(itemHandler1);
		cbbyte.addItemListener(itemHandler1);
		cbchar.addItemListener(itemHandler1);
		cbshort.addItemListener(itemHandler1);
		cbdouble.addItemListener(itemHandler1);
		cbint.addItemListener(itemHandler1);
		cbfloat.addItemListener(itemHandler1);
		cblong.addItemListener(itemHandler1);

		// ī�װ� �޺� �ڽ��� ������ ����Ǿ��� ��
		// ȣ��� �޼ҵ带 ���� Listener
		// ItemListener�� ó��
		ItemListener itemHandler2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// cbcategory�� ���õ� �� ��ȣ ��������
				int row = cbcategory.getSelectedIndex();
				// cbcontent�� ������ ���� ����
				cbcontent.removeAll();
				// ���ȣ�� �ش��ϴ� ���� ������ cbcontent�� �߰�
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

		// ���� ��ư ������ ���α׷� ����
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

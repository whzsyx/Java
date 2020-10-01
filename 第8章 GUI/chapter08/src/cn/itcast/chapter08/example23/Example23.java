package cn.itcast.chapter08.example23;

import java.awt.event.*;
import javax.swing.*;

public class Example23 extends JFrame {
	private JPopupMenu popupMenu;

	public Example23() {
		// ����һ��JPopupMenu�˵�
		popupMenu = new JPopupMenu();
		// ��������JMenuItem�˵���
		JMenuItem refreshItem = new JMenuItem("refresh");
		JMenuItem createItem = new JMenuItem("create");
		JMenuItem exitItem = new JMenuItem("exit");
		// ΪexitItem�˵�������¼�������
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		// ��JPopupMenu�˵���Ӳ˵���
		popupMenu.add(refreshItem);
		popupMenu.add(createItem);
		popupMenu.addSeparator();
		popupMenu.add(exitItem);
		// ΪJFrame�������clicked����¼�������
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// ����������������Ҽ�����ʾJPopupMenu�˵�
				if (e.getButton() == e.BUTTON3) {
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Example23();
	}
}

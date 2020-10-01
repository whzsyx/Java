package cn.itcast.chapter08.example22;

import java.awt.event.*;
import javax.swing.*;
/**
 * �˵��Ĵ�����ʹ��
 */
public class Example22 extends JFrame {
	public Example22() {
		JMenuBar menuBar = new JMenuBar(); // �����˵���
		this.setJMenuBar(menuBar); // ���˵�����ӵ�JFrame������
		JMenu menu = new JMenu("����"); // �����˵�
		menuBar.add(menu); // ���˵���ӵ��˵�����
		// ���������˵���
		JMenuItem item1 = new JMenuItem("��������");
		JMenuItem item2 = new JMenuItem("�ر�");
		// Ϊ�˵�������¼�������
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ����һ��JDialog����
				JDialog dialog = new JDialog(Example22.this, true);
				dialog.setTitle("��������");
				dialog.setSize(200, 200);
				dialog.setLocation(50, 50);
				dialog.setVisible(true);
			}
		});
		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(item1); // ���˵�����ӵ��˵���
		menu.addSeparator(); // ���һ���ָ���
		menu.add(item2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Example22();
	}
}

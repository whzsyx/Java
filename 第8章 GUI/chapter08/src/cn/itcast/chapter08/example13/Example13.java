package cn.itcast.chapter08.example13;

import java.awt.*;
import java.awt.event.*;
/**
 * �����¼�
 * @author admin
 *
 */
public class Example13 {
	public static void main(String[] args) {
		Frame f = new Frame("KeyEvent");
		f.setLayout(new FlowLayout());
		f.setSize(400, 300);
		f.setLocation(300, 200);
		TextField tf = new TextField(30); // �����ı������
		f.add(tf); // �ڴ���������ı������
		f.setVisible(true);
		// Ϊ�ı�����Ӽ����¼�������
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int KeyCode = e.getKeyCode(); // ������������Ӧ������ֵ
				String s = KeyEvent.getKeyText(KeyCode); // ���ذ������ַ�������
				System.out.print("���������Ϊ��" + s + ",");
				System.out.println("��Ӧ��KeyCodeΪ��" + KeyCode);
			}
		});
	}
}

package cn.itcast.chapter08.example09;

import java.awt.*;
import java.awt.event.*;

public class Example09 {
	public static void main(String[] args) {
		// �����´���
		Frame f = new Frame("�ҵĴ��壡");
		// ���ô���Ŀ�͸�
		f.setSize(400, 300);
		// ���ô���ĳ��ֵ�λ��
		f.setLocation(300, 200);
		// ���ô���ɼ�
		f.setVisible(true);
		// Ϊ�������ע�������
		f.addWindowListener(new MyWindowListener());
	}
}

// �̳�WindowAdapter�࣬��дwindowClosing()����
class MyWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		Window window = (Window) e.getComponent();
		window.dispose();
	}
}

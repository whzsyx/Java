package cn.itcast.chapter08.example08;
import java.awt.*;
import java.awt.event.*;
public class Example08 {
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
		MyWindowListener mw = new MyWindowListener();
		f.addWindowListener(mw);
	}
}
// ����MyWindowListener��ʵ��WindowListener�ӿ�
class MyWindowListener implements WindowListener {
	// �����������¼�������������
	public void windowClosing(WindowEvent e) {
		Window window = e.getWindow();
		window.setVisible(false);
		// �ͷŴ���
		window.dispose();
	}
	public void windowActivated(WindowEvent e) {
	}
	public void windowClosed(WindowEvent e) {
	}
	public void windowDeactivated(WindowEvent e) {
	}
	public void windowDeiconified(WindowEvent e) {
	}
	public void windowIconified(WindowEvent e) {
	}
	public void windowOpened(WindowEvent e) {
	}
}

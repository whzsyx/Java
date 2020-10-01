package cn.itcast.chapter08.example11;
import java.awt.*;
import java.awt.event.*;
/**
 * �����¼�
 * @author admin
 *
 */
public class Example11 {
	public static void main(String[] args) {
		final Frame f = new Frame("WindowEvent");
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		// ʹ���ڲ��ഴ��WindowListenerʵ�����󣬼��������¼�
		f.addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened---������¼�");
			}
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified---����ͼ�껯�¼�");
			}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified---����ȡ��ͼ�껯�¼�");
			}
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated---����ͣ���¼�");
			}
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing---�������ڹر��¼�");
				((Window) e.getComponent()).dispose();
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed---����ر��¼�");
			}
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated---���弤���¼�");
			}
		});
	}
}

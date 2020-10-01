package cn.itcast.chapter08.example14;

import java.awt.*;
import java.util.Random;
/**
 * AWT��ͼ
 */
public class Example14 {
	public static void main(String[] args) {
		final Frame frame = new Frame("��֤��"); // ����Frame����
		final Panel panel = new MyPanel(); // ����Panel����
		frame.add(panel);
		frame.setSize(200, 100);
		// ��Frame���ھ���
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}

class MyPanel extends Panel {
	public void paint(Graphics g) {
		int width = 160; // ������֤��ͼƬ�Ŀ��
		int height = 40; // ������֤��ͼƬ�ĸ߶�
		g.setColor(Color.LIGHT_GRAY); // ������������ɫ
		g.fillRect(0, 0, width, height); // �����֤�뱳��
		g.setColor(Color.BLACK); // ������������ɫ
		g.drawRect(0, 0, width - 1, height - 1); // ���Ʊ߿�
		// ���Ƹ��ŵ�
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			int x = r.nextInt(width) - 2;
			int y = r.nextInt(height) - 2;
			g.drawOval(x, y, 2, 2);
		}
		g.setFont(new Font("����", Font.BOLD, 30)); // ������֤������
		g.setColor(Color.BLUE); // ������֤����ɫ
		// ���������֤��
		char[] chars = ("0123456789abcdefghijkmnopqrstuvwxyzABCDEFG"
				+ "HIJKLMNPQRSTUVWXYZ").toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			int pos = r.nextInt(chars.length);
			char c = chars[pos];
			sb.append(c + " ");
		}
		g.drawString(sb.toString(), 20, 30); // д����֤��
	}
}

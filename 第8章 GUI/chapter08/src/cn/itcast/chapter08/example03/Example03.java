package cn.itcast.chapter08.example03;
import java.awt.*;
public class Example03 {
	public static void main(String[] args) {
		final Frame f = new Frame("BorderLayout");// ����һ����ΪBorderLayout�Ĵ���
		f.setLayout(new BorderLayout()); // ���ô����еĲ��ֹ�����ΪBorderLayout
		f.setSize(300, 300); // ���ô����С
		f.setLocation(300, 200);// ���ô�����ʾ��λ��
		f.setVisible(true); // ���ô���ɼ�
		// ����Ĵ����Ǵ���5����ť���ֱ��������BorderLayout��5������
		Button but1 = new Button("����"); // �����°�ť
		Button but2 = new Button("����");
		Button but3 = new Button("�ϲ�");
		Button but4 = new Button("����");
		Button but5 = new Button("�в�");
		// ����Ĵ����ǽ������õİ�ť��ӵ������У������ð�ť���ڵ�����
		f.add(but1, BorderLayout.EAST); // ���ð�ť��������
		f.add(but2, BorderLayout.WEST);
		f.add(but3, BorderLayout.SOUTH);
		f.add(but4, BorderLayout.NORTH);
		f.add(but5, BorderLayout.CENTER);
	}
}

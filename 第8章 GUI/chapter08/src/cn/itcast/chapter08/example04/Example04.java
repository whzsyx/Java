package cn.itcast.chapter08.example04;
import java.awt.*;
public class Example04 {
	public static void main(String[] args) {
		Frame f = new Frame("GridLayout");// ����һ����ΪGridLayout�Ĵ���
		f.setLayout(new GridLayout(3, 3));// ���øô���Ϊ3*3������
		f.setSize(300, 300); // ���ô����С
		f.setLocation(400, 300);
		// ����Ĵ�����ѭ�����9����ť��GridLayout��
		for (int i = 1; i <= 9; i++) {
			Button btn = new Button("btn" + i);
			f.add(btn); // ��������Ӱ�ť
		}
		f.setVisible(true);
	}
}

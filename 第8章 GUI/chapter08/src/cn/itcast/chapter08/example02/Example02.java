package cn.itcast.chapter08.example02;
import java.awt.*;
public class Example02 {
	public static void main(String[] args) {
		final Frame f = new Frame("Flowlayout");// ����һ����ΪFlowlayout�Ĵ���
		// ���ô����еĲ��ֹ�����ΪFlowLayout�������������룬ˮƽ���Ϊ20����ֱ���Ϊ30
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
		f.setSize(220, 300); // ���ô����С
		f.setLocation(300, 200); // ���ô�����ʾ��λ��
		f.add(new Button("��1����ť")); // ��"��1����ť"��ӵ�f����
		f.add(new Button("��2����ť"));
		f.add(new Button("��3����ť"));
		f.add(new Button("��4����ť"));
		f.add(new Button("��5����ť"));
		f.add(new Button("��6����ť"));
		f.setVisible(true); // ���ô���ɼ�
	}
}

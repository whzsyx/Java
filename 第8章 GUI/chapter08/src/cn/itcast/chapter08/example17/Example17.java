package cn.itcast.chapter08.example17;

import java.awt.*;
import javax.swing.*;
/**
 * ���м�������Ӱ�ť
 *
 */
public class Example17 extends JFrame {
	public Example17() {
		this.setTitle("PanelDemo");
		// �����������
		JScrollPane scrollPane = new JScrollPane();
		// ����ˮƽ����������--������һֱ��ʾ
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// ���ô�ֱ����������--��������Ҫʱ��ʾ
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// ����һ��JPanel���
		JPanel panel = new JPanel();
		// ��JPanel���������ĸ���ť
		panel.add(new JButton("��ť1"));
		panel.add(new JButton("��ť2"));
		panel.add(new JButton("��ť3"));
		panel.add(new JButton("��ť4"));
		// ����JPanel����ڹ����������ʾ
		scrollPane.setViewportView(panel);
		// �����������ӵ���������CENTER����
		this.add(scrollPane, BorderLayout.CENTER);
		// ��һ����ť��ӵ���������SOUTH����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 250);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Example17();
	}
}

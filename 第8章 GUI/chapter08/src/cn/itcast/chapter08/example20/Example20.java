package cn.itcast.chapter08.example20;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * JRadioButton������÷�
 */
public class Example20 extends JFrame {
	private ButtonGroup group; // ��ѡ��ť�����
	private JPanel panel; // JPanel����������JRadioButton��ť
	private JPanel pallet; // JPanel�����Ϊ��ɫ��

	public Example20() {
		pallet = new JPanel();
		this.add(pallet, BorderLayout.CENTER); // ����ɫ����������CENTER����
		panel = new JPanel();
		group = new ButtonGroup();
		// ����addJRadioButton()����
		addJRadioButton("��");
		addJRadioButton("��");
		addJRadioButton("��");
		this.add(panel, BorderLayout.SOUTH);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/**
	 * JRadioButtion��ť���ı���Ϣ ���ڴ���һ�������ı���Ϣ��JRadioButton��ť
	 * ����ť��ӵ�panel����ButtonGroup��ť���� ����Ӽ�����
	 */
	private void addJRadioButton(final String text) {
		JRadioButton radioButton = new JRadioButton(text);
		group.add(radioButton);
		panel.add(radioButton);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color = null;
				if ("��".equals(text)) {
					color = Color.GRAY;
				} else if ("��".equals(text)) {
					color = Color.PINK;
				} else if ("��".equals(text)) {
					color = Color.YELLOW;
				} else {
					color = Color.WHITE;
				}
				pallet.setBackground(color);
			}
		});
	}

	public static void main(String[] args) {
		new Example20();
	}
}

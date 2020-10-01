package cn.itcast.chapter08.example18;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * �ı����JTextField��JTextArea�����ʹ��
 */
public class Example18 extends JFrame {
	JButton sendBt;
	JTextField inputField;
	JTextArea chatContent;

	public Example18() {
		this.setLayout(new BorderLayout());
		chatContent = new JTextArea(12, 34); // ����һ���ı���
		// ����һ��������壬���ı�����Ϊ����ʾ���
		JScrollPane showPanel = new JScrollPane(chatContent);
		chatContent.setEditable(false); // �����ı��򲻿ɱ༭
		JPanel inputPanel = new JPanel(); // ����һ��JPanel���
		inputField = new JTextField(20); // ����һ���ı���
		sendBt = new JButton("����"); // ����һ�����Ͱ�ť
		// Ϊ��ť����¼�
		sendBt.addActionListener(new ActionListener() { // Ϊ��ť���һ�������¼�
			public void actionPerformed(ActionEvent e) {// ��дactionPerformed����
				String content = inputField.getText(); // ��ȡ������ı���Ϣ
				// �ж��������Ϣ�Ƿ�Ϊ��
				if (content != null && !content.trim().equals("")) {
					// �����Ϊ�գ���������ı�׷�ӵ������촰��
					chatContent.append("����:" + content + "\n");
				} else {
					// ���Ϊ�գ���ʾ������Ϣ����Ϊ��
					chatContent.append("������Ϣ����Ϊ��" + "\n");
				}
				inputField.setText(""); // ��������ı���������Ϊ��
			}
		});
		Label label = new Label("������Ϣ"); // ����һ����ǩ
		inputPanel.add(label); // ����ǩ��ӵ�JPanel���
		inputPanel.add(inputField); // ���ı�����ӵ�JPanel���
		inputPanel.add(sendBt); // ����ť��ӵ�JPanel���
		// ����������JPanel�����ӵ�JFrame����
		this.add(showPanel, BorderLayout.CENTER);
		this.add(inputPanel, BorderLayout.SOUTH);
		this.setTitle("���촰��");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Example18();
	}
}

package cn.itcast.chapter08.example06;
import java.awt.*;
import java.awt.event.*;
//����Cardlayout�̳�Frame�࣬ʵ��ActionListener�ӿ�
class Cardlayout extends Frame implements ActionListener {
	Panel cardPanel = new Panel(); // ����Panel�����ÿ�Ƭ
	Panel controlpaPanel = new Panel(); // ����Panel�����ð�ť
	Button nextbutton, preButton;       //����������ť
	CardLayout cardLayout = new CardLayout();// ���忨Ƭ���ֶ���
	// ���幹�췽�������ÿ�Ƭ���ֹ�����������
	public Cardlayout() { 
		setSize(300, 200);
		setVisible(true);
		// Ϊ������ӹر��¼�������
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Cardlayout.this.dispose();
			}
		});
		cardPanel.setLayout(cardLayout); // ����cardPanel������Ϊ��Ƭ����
		// ��cardPanel�����������3���ı���ǩ
		cardPanel.add(new Label("��һ������", Label.CENTER));
		cardPanel.add(new Label("�ڶ�������", Label.CENTER));
		cardPanel.add(new Label("����������", Label.CENTER));
		// ����������ť����
		nextbutton = new Button("��һ�ſ�Ƭ");
		preButton = new Button("��һ�ſ�Ƭ");
		// Ϊ��ť����ע�������
		nextbutton.addActionListener(this);
		preButton.addActionListener(this);
		// ����ť��ӵ�controlpaPanel��
		controlpaPanel.add(preButton);
		controlpaPanel.add(nextbutton);
		// ��cardPanel�������ڴ��ڱ߽粼�ֵ��м䣬����Ĭ��Ϊ�߽粼��
		this.add(cardPanel, BorderLayout.CENTER);
		// ��controlpaPanel�������ڴ��ڱ߽粼�ֵ�������
		this.add(controlpaPanel, BorderLayout.SOUTH);
	}
	// ����Ĵ���ʵ���˰�ť�ļ������������Դ����¼�������Ӧ�Ĵ���
	public void actionPerformed(ActionEvent e) {
		// ����û�����nextbutton��ִ�е����
		if (e.getSource() == nextbutton) {
			// �л�cardPanel����е�ǰ���֮���һ�����������ǰ���Ϊ���һ�����������ʾ��һ�������
			cardLayout.next(cardPanel);
		}
		if (e.getSource() == preButton) {
			// �л�cardPanel����е�ǰ���֮ǰ��һ�����������ǰ���Ϊ��һ�����������ʾ���һ�������
			cardLayout.previous(cardPanel);
		}
	}
}
public class Example06 {
	public static void main(String[] args) {
		Cardlayout cardlayout = new Cardlayout();
	}
}

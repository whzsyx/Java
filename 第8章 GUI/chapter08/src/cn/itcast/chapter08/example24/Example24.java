package cn.itcast.chapter08.example24;
import javax.swing.*;
/**
 * JTable
 */
public class Example24 {
	//����JFrame����
	JFrame jf = new JFrame("�򵥱��");
	//����JTable���͵ı���table
	JTable table;
	// 1.����һά������Ϊ�б���
	Object[] columnTitle = { "����", "����", "�Ա�" };
	// 2.�����ά������Ϊ����ж�������
	Object[][] tableDate = { 
			new Object[] { "������", 29, "Ů" },
			new Object[] { "�ո�����", 56, "��" }, 
			new Object[] { "���", 35, "��" },
			new Object[] { "Ū��", 18, "Ů" }, 
			new Object[] { "��ͷ", 2, "��" } 
	 };
    // 3.ʹ��JTable���󴴽����
	public void init() {
		// �Զ�ά�����һά����������һ��JTable����
		table = new JTable(tableDate, columnTitle);
		// ��JTable�������JScrollPane�У�������JScrollPane���ڴ�������ʾ����
		jf.add(new JScrollPane(table));
		//��������ӦJFrame�����С
		jf.pack();
		//���õ����رհ�ťʱĬ��Ϊ�˳�
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô���ɼ�
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new Example24().init();
	}
}

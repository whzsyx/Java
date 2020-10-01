package cn.itcast.chapter08.example05;
import java.awt.*;
class Layout extends Frame {
	public Layout(String title) {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(layout);
		c.fill = GridBagConstraints.BOTH; // ����������������������
		c.weightx = 1; // ���ú���Ȩ��Ϊ1
		c.weighty = 1; // ��������Ȩ��Ϊ1
		this.addComponent("btn1", layout, c);
		this.addComponent("btn2", layout, c);
		this.addComponent("btn3", layout, c);
		c.gridwidth = GridBagConstraints.REMAINDER; // ��ӵ�����Ǳ������һ�����
		this.addComponent("btn4", layout, c);
		c.weightx = 0; // ���ú���Ȩ��Ϊ0
		c.weighty = 0; // ��������Ȩ��Ϊ0
		addComponent("btn5", layout, c);
		c.gridwidth = 1; // ���������һ������(Ĭ��ֵ)
		this.addComponent("btn6", layout, c);
		c.gridwidth = GridBagConstraints.REMAINDER; // ��ӵ�����Ǳ������һ�����
		this.addComponent("btn7", layout, c);
		c.gridheight = 2; // ��������������������
		c.gridwidth = 1; // ������������һ������
		c.weightx = 2; // ���ú���Ȩ��Ϊ2
		c.weighty = 2; // ��������Ȩ��Ϊ2
		this.addComponent("btn8", layout, c);
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = 1;
		this.addComponent("btn9", layout, c);
		this.addComponent("btn10", layout, c);
		this.setTitle(title);
		this.pack();
		this.setVisible(true);
	}
	// ��������ķ���
	private void addComponent(String name, GridBagLayout layout,
			GridBagConstraints c) {
		Button bt = new Button(name); // ����һ����Ϊname�İ�ť
		layout.setConstraints(bt, c); // ����GridBagConstraints����Ͱ�ť�Ĺ���
		this.add(bt); // ���Ӱ�ť
	}
}
public class Example05 {
	public static void main(String[] args) {
		new Layout("GridBagLayout");
	}
}

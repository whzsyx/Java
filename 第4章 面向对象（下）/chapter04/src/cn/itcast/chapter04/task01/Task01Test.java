package cn.itcast.chapter04.task01;
//������
class Task01Test {
	public static void main(String[] args) {
		//ʵ�������Զ���
		Computer c = new Computer();
		//������������ꡢ��˷�ͼ����豸
		c.add(new Mouse());
		c.add(new Mic());
		c.add(new KeyBoard());
		c.powerOn();//��������
		System.out.println();
		c.powerOff();//�رյ���
	}
}




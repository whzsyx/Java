package cn.itcast.chapter04.task02;
/*
 * ���ⶨ��һ����Ʒ��ʵ��GPS�ӿڣ�ӵ�ж�λ���ܡ�
 */
class Phone implements GPS{	
	public Phone() { //�ղι���
		super();
	}
    //��λ����
	public String  showCoordinate() {
		String location = "193,485";
		return location;
	}
}

package cn.itcast.chapter03.task01;

public class Person {		// ��
	private String name;	// ����	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Product shopping(Market market, String name) {		// ����, ָ��ȥ�ĸ�����, ��Ʒ��
		return market.sell(name);						// ���ó��е���������, ָ����Ʒ��, �������Ľ������
	}
}

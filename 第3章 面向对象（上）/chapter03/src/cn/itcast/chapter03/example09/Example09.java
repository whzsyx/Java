package cn.itcast.chapter03.example09;
class Person {	
	/*
	 * private�ؼ������εĹ��췽��Person()ֻ����Person���б����ʡ�
	 * Ҳ����˵Person()���췽����˽�еģ������Ա������ã�Ҳ���޷�������ⲿ���������ʵ������
	 * ��ˣ�Ϊ�˷���ʵ�������󣬹��췽��ͨ����ʹ��public������
	 */
	public Person() {// ���幹�췽��
		System.out.println("�����޲εĹ��췽��");
	}
}
public class Example09 {
	public static void main(String[] args) {
		Person p = new Person();
	}
}

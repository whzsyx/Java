package cn.itcast.chapter03.example14;
/**
 * ��̬�����
 */
class Example14 {
	// ��̬�����
	static {
		System.out.println("������ľ�̬�����ִ����");
	}
	public static void main(String[] args) {
		// ����Ĵ��봴��������Person����
		Person p1 = new Person();
		Person p2 = new Person();
	}
}
class Person {
	// ������һ����̬�����
	static {
		System.out.println("Person���еľ�̬�����ִ����");
	}
}

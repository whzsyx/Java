package cn.itcast.chapter03.example02;
/**
 * ��������
 */
class Person {
	void say() { // ����say()���������һ�仰
		System.out.println("����һ����!");
	}
}
class Example02 {
	public static void main(String[] args) {
		Person p2 = new Person(); // ����Person2����
		p2.say(); // ����say()����
		p2 = null; // ��Person������Ϊnull
		p2.say();
	}
}

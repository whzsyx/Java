package cn.itcast.chapter03.example06;
/**
 * �вι���
 */
class Person {
	int age;

	// �����вεĹ��췽��
	public Person(int a) {
		age = a; // Ϊage���Ը�ֵ
	}

	public void speak() {
		System.out.println("�������Ѿ� " + age + "����!");
	}
}

public class Example06 {
	public static void main(String[] args) {
		Person p = new Person(20); // ʵ���� Person ����
		p.speak();
	}
}

package cn.itcast.chapter03.example10;
/**
 * ���췽����ʹ��this
 */
class Person {
	public Person() {
		System.out.println("�޲εĹ��췽����������...");
	}

	public Person(String name) {
		this(); // �����޲εĹ��췽��
		System.out.println("�вεĹ��췽����������...");
	}
}

public class Example10 {
	public static void main(String[] args) {
		Person p = new Person("itcast"); // ʵ���� Person ����
	}
}

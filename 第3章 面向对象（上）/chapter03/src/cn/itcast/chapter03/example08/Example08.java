package cn.itcast.chapter03.example08;
class Person {
	int age;
	/*
	 * �����ж������вεĹ��췽��ʱ������Ҫ����һ���޲εĹ��췽����
	 * ����������޲ι��췽�����ᱨ�����췽��δ����Ĵ���
	 */
	public Person(){} //�޲ι���
	public Person(int x) { //�вι���
		age = x;
	}
}
public class Example08 {
	public static void main(String[] args) {
		Person p = new Person(); // ʵ���� Person����
	}
}

package cn.itcast.chapter03.example13;
/**
 * ��̬������ʹ��
 */
class Person {
	public static void sayHello() { // ���徲̬����
		System.out.println("hello");
	}
}

class Example13 {
	public static void main(String[] args) {
		//1.����.�����ķ�ʽ���þ�̬����
		Person.sayHello();
		//2.ʵ��������ķ�ʽ�����þ�̬����
		Person p = new Person();
		p.sayHello(); 
	}
}

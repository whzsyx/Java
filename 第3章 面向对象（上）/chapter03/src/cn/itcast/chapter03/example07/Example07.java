package cn.itcast.chapter03.example07;
/**
 * ���췽��������
 */
class Person {
	String name;
	int age;

	// �������������Ĺ��췽��
	public Person(String con_name, int con_age) {
		name = con_name; // Ϊname���Ը�ֵ
		age = con_age; // Ϊage���Ը�ֵ
	}

	// ����һ�������Ĺ��췽��
	public Person(String con_name) {
		name = con_name; // Ϊname���Ը�ֵ
	}

	public void speak() {
		// ��ӡname��age��ֵ
		System.out.println("��Һã��ҽ�" + name + ",�ҽ���" + age + "��!");
	}
}

public class Example07 {
	public static void main(String[] args) {
		// �ֱ𴴽��������� ps1 �� ps2
		Person p1 = new Person("��ǿ");
		Person p2 = new Person("��Ӣ", 27);
		// ͨ������ps1 �� ps2 ����speak()����
		p1.speak();
		p2.speak();
	}
}

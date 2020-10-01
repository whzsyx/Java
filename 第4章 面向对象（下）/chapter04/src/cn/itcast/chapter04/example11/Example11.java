package cn.itcast.chapter04.example11;
// ������Animal�ӿ�
interface Animal {
	// ����ȫ�ֳ���,��Ĭ������Ϊpublic static final
	String ANIMAL_BEHAVIOR = "�������Ϊ"; 
	// ������󷽷�breathe()����Ĭ������Ϊpublic abstract
	void breathe(); 
	// ������󷽷�run()
	void run(); 
}
// Dog��ʵ����Animal�ӿ�
class Dog implements Animal {
	// ʵ��breathe()����
	public void breathe() {
		System.out.println(ANIMAL_BEHAVIOR+":"+"���ں���");
	}
	// ʵ��run()����
	public void run() {
		System.out.println(ANIMAL_BEHAVIOR+":"+"���ڱ���");
	}
}
// ���������
public class Example11 {
	public static void main(String args[]) {
		Dog dog = new Dog(); // ����Dog���ʵ������
		//ʹ�ö�����.�������ķ�ʽ����ӿ��еĳ���
		//System.out.println(dog.ANIMAL_BEHAVIOR);
		//ʹ�ýӿ���.�������ķ�ʽ����ӿ��еĳ���
		//System.out.println(Animal.ANIMAL_BEHAVIOR);
		dog.breathe(); // ����Dog���breathe()����
		dog.run(); // ����Dog���run()����
	}
}

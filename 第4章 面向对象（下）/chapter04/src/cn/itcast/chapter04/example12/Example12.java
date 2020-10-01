package cn.itcast.chapter04.example12;
// ������Animal�ӿ�
interface Animal {
	// ����ȫ�ֳ���,��Ĭ������Ϊpublic static final
	String ANIMAL_BEHAVIOR = "�������Ϊ"; 
	// ������󷽷�breathe()����Ĭ������Ϊpublic abstract
	void breathe(); 
	// ������󷽷�run()
	void run(); 
}
//������LandAnimal�ӿ�
interface LandAnimal extends Animal{
	void liveOnLand();
}
// Dog��ʵ����Animal�ӿ�
class Dog implements LandAnimal {
	// ʵ��breathe()����
	public void breathe() {
		System.out.println(ANIMAL_BEHAVIOR+":"+"���ں���");
	}
	// ʵ��run()����
	public void run() {
		System.out.println(ANIMAL_BEHAVIOR+":"+"���ڱ���");
	}
	//ʵ��liveOnLand()����
	public void liveOnLand() {
		System.out.println("����½���ϵĶ������");
	}
}
// ���������
public class Example12 {
	public static void main(String args[]) {
		Dog dog = new Dog(); // ����Dog���ʵ������
		//ʹ�ö�����.�������ķ�ʽ����ӿ��еĳ���
		//System.out.println(dog.ANIMAL_BEHAVIOR);
		//ʹ�ýӿ���.�������ķ�ʽ����ӿ��еĳ���
		//System.out.println(Animal.ANIMAL_BEHAVIOR);
		dog.breathe(); // ����Dog���breathe()����
		dog.run(); // ����Dog���run()����
		dog.liveOnLand();// ����Dog���liveOnLand()����
	}
}

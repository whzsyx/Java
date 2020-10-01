package cn.itcast.chapter04.example15;
// ����Animal�ӿ�
interface Animal {
	void shout(); // ������󷽷�shout()
}
// ����Cat��ʵ��Animal�ӿ�
class Cat implements Animal {
	// ʵ�ֳ��󷽷�shout()
	public void shout() {
		System.out.println("��������");
	}
	// ����sleep()����
	void sleep() {
		System.out.println("è˯������");
	}
}
// ����Dog��ʵ��Animal�ӿ�
class Dog implements Animal {
	// ʵ��shout()����
	public void shout() {
		System.out.println("��������");
	}
}
// ���������
public class Example15 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // ����Dog���ʵ������
		animalShout(dog); // ����animalShout()��������cat��Ϊ��������
	}
	// ���徲̬����animalShout()������һ��Animal���͵Ĳ���
	public static void animalShout(Animal animal) {
       if(animal instanceof Cat){   	   
    	   Cat cat = (Cat) animal;
    	   cat.shout();
    	   cat.sleep();
       }else{
    	   System.out.println("this animal is not a cat");
       }
	}
}

package cn.itcast.chapter04.example19;
// ����Animal�ӿ�
interface Animal {
	void shout(); // ������󷽷�shout()
}
// ���������
public class Example19 {
	public static void main(String[] args) {
		animalShout(new Animal() {
			// ʵ��shout()����
			public void shout() {
				System.out.println("����...");
			}
		});
	}
	// ���徲̬����animalShout()
	public static void animalShout(Animal an) {
		an.shout(); // ���ô������an��shout()����
	}
}

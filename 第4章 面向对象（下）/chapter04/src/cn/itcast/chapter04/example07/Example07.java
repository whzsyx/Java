package cn.itcast.chapter04.example07;
// ����Animal��
class Animal {
	// ʹ��final�ؼ�������shout()���������������д������������������ᱨ��
	//public final void shout() {
	public void shout() {
		// �������
	}
}
// ����Dog��̳�Animal��
class Dog extends Animal {
	// ��дAnimal���shout()����
	public void shout() {
		// �������
	}
}
// ���������
class Example07 {
	public static void main(String[] args) {
		Dog dog = new Dog(); // ����Dog���ʵ������
	}
}

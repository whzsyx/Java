package cn.itcast.chapter03.example01;
/**
 * ���ʶ���ĳ�Ա
 */
class Example01 {
	public static void main(String[] args) {
		Person p1 = new Person(); // ������һ��Person����
		Person p2 = new Person(); // �����ڶ���Person����
		p1.age = 18; // Ϊage���Ը�ֵ
		p1.speak(); // ���ö���ķ���
		p2.speak();
	}
}

package cn.itcast.chapter03.example16;
/*
 * �ⲿ������ڲ���
 */
class Outer {
	private int num = 4; // ������ĳ�Ա����

	// ����Ĵ��붨����һ����Ա�����������з����ڲ���
	public void test() {
		Inner inner = new Inner();
		inner.show();
	}

	// ����Ĵ��붨����һ����Ա�ڲ���
	class Inner {
		void show() {
			// �ڳ�Ա�ڲ���ķ����з����ⲿ��ĳ�Ա����
			System.out.println("num = " + num);
		}
	}
}

public class Example16 {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner(); // �����ڲ������
		inner.show(); // ���� test() ����
	}
}

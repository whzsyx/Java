package cn.itcast.chapter03.example15;
/**
 * ��Ա�ڲ���
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

public class Example15 {
	public static void main(String[] args) {
		Outer outer = new Outer(); // �����ⲿ�����
		outer.test(); // ���� test() ����
	}
}

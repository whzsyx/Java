package cn.itcast.chapter02.example21;
/**
 * ʹ���з���ֵ�ķ�������ε����
 */
public class Example21 {
	public static void main(String[] args) {
		int area = getArea(3, 5); // ���� getArea����
		System.out.println(" The area is " + area);
	}

	// ���涨����һ�����������ķ�����������������������xΪ�ߣ�yΪ��
	public static int getArea(int x, int y) {
		int temp = x * y; // ʹ�ñ���temp��ס������
		return temp; // ������temp��ֵ����
	}
}
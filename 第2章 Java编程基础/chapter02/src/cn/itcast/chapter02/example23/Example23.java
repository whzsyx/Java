package cn.itcast.chapter02.example23;
/**
 * ����������
 */
public class Example23 {
	public static void main(String[] args) {
		// �����������ͷ����ĵ���
		int sum1 = add(1, 2);
		int sum2 = add(1, 2, 3);
		double sum3 = add(1.2, 2.3);
		// ����Ĵ����Ǵ�ӡ��͵Ľ��
		System.out.println("sum1=" + sum1);
		System.out.println("sum2=" + sum2);
		System.out.println("sum3=" + sum3);
	}

	// ����ķ���ʵ���������������
	public static int add(int x, int y) {
		return x + y;
	}

	// ����ķ���ʵ���������������
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	// ����ķ���ʵ��������С�����
	public static double add(double x, double y) {
		return x + y;
	}
}
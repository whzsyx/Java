package cn.itcast.chapter02.example22;
/**
 * ���ò�ͬ����
 */
public class Example22 {
	public static void main(String[] args) {
		// �����������ͷ����ĵ���
		int sum1 = add01(1, 2);
		int sum2 = add02(1, 2, 3);
		double sum3 = add03(1.2, 2.3);
		// ����Ĵ����Ǵ�ӡ��͵Ľ��
		System.out.println("sum1=" + sum1);
		System.out.println("sum2=" + sum2);
		System.out.println("sum3=" + sum3);
	}

	// ����ķ���ʵ���������������
	public static int add01(int x, int y) {
		return x + y;
	}

	// ����ķ���ʵ���������������
	public static int add02(int x, int y, int z) {
		return x + y + z;
	}

	// ����ķ���ʵ��������С�����
	public static double add03(double x, double y) {
		return x + y;
	}
}

package cn.itcast.chapter02.example06;
/**
 * ��&���͡�&&����ʹ��
 */
public class Example06 {
	public static void main(String[] args) {
		int x = 0; // �������x����ʼֵΪ0
		int y = 0; // �������y����ʼֵΪ0
		int z = 0; // �������z����ʼֵΪ0
		boolean a, b; // ����boolean����a��b
		a = x > 0 & y++ > 1; // �߼������&�Ա��ʽ��������
		System.out.println(a);
		System.out.println("y = " + y);
		b = x > 0 && z++ > 1; // �߼������&&�Ա��ʽ��������
		System.out.println(b);
		System.out.println("z = " + z);
	}
}

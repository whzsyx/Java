package cn.itcast.chapter02.example18;
/**
 * continue���
 */
public class Example18 {
	public static void main(String[] args) {
		int sum = 0; // �������sum�����ڼ�ס��
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // i��һ��ż�������ۼ�
				continue; // ��������ѭ��
			}
			sum += i; // ʵ��sum��i���ۼ�
		}
		System.out.println("sum = " + sum);
	}
}
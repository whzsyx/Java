package cn.itcast.chapter02.example15;
/**
 * forѭ��(ʹ��*��ӡֱ��������)
 */
public class Example15 {
	public static void main(String[] args) {
		int i, j; // ��������ѭ������
		for (i = 1; i <= 9; i++) { // ���ѭ��
			for (j = 1; j <= i; j++) { // �ڲ�ѭ��
				System.out.print("*"); // ��ӡ*
			}
			System.out.print("\n"); // ����
		}
	}
}
package cn.itcast.chapter02.example19;
/**
 * ��ʹ�÷���ʱʵ�ִ�ӡ��������ͬ�ľ���
 */
public class Example19 {
	public static void main(String[] args) {
		// �����ѭ����ʹ��*��ӡһ����Ϊ5����Ϊ3�ľ���
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		// �����ѭ����ʹ��*��ӡһ����Ϊ4����Ϊ2�ľ���
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		// �����ѭ����ʹ��*��ӡһ����Ϊ10����Ϊ6�ľ���
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
package cn.itcast.chapter02.example20;
/**
 * ʹ�÷���ʱʵ�ִ�ӡ��������ͬ�ľ���
 */
public class Example20 {
	public static void main(String[] args) {
		printRectangle(3, 5); // ���� printRectangle()����ʵ�ִ�ӡ����
		printRectangle(2, 4);
		printRectangle(6, 10);
	}

	// ���涨����һ����ӡ���εķ�����������������������heightΪ�ߣ�widthΪ��
	public static void printRectangle(int height, int width) {
		// ������ʹ��Ƕ��forѭ��ʵ��*��ӡ����
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
package cn.itcast.chapter02.example04;
/**
 * ������������
 */
public class Example04 {
	public static void main(String[] args) {
		int x = 12; // �����˱���x
		{
			int y = 96; // �����˱���y
			System.out.println("x is " + x); // ���ʱ���x
			System.out.println("y is " + y); // ���ʱ���y
		}
		//y = x; // ���ʱ���x��Ϊ����y��ֵ
		System.out.println("x is " + x); // ���ʱ���x
	}
}

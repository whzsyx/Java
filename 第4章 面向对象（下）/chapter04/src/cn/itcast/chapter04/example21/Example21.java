package cn.itcast.chapter04.example21;

public class Example21 {
	public static void main(String[] args) {
		// ����Ĵ��붨����һ��try��catch������ڲ����쳣
		try {
			int result = divide(4, 0); // ����divide()����
			System.out.println(result);
		} catch (Exception e) { // ���쳣���д���
			System.out.println("������쳣��ϢΪ��" + e.getMessage());
		}
		System.out.println("�����������ִ��...");
	}

	// ����ķ���ʵ���������������
	public static int divide(int x, int y) {
		int result = x / y; // ����һ������result��¼����������Ľ��
		return result; // ���������
	}
}

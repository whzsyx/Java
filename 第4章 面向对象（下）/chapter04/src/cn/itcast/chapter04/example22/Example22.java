package cn.itcast.chapter04.example22;

public class Example22 {
	public static void main(String[] args) {
		// ����Ĵ��붨����һ��try��catch��finally������ڲ����쳣
		try {
			int result = divide(4, 0); // ����divide()����
			System.out.println(result);
		} catch (Exception e) { // �Բ��񵽵��쳣���д���
			System.out.println("������쳣��ϢΪ��" + e.getMessage());
			return; // ���ڽ�����ǰ���
		} finally {
			System.out.println("����finally�����");
		}
		System.out.println("�����������ִ�С�");
	}

	// ����ķ���ʵ���������������
	public static int divide(int x, int y) {
		int result = x / y; // ����һ������result��¼����������Ľ��
		return result; // ���������
	}
}

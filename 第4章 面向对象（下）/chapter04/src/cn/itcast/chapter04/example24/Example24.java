package cn.itcast.chapter04.example24;
public class Example24 {
	public static void main(String[] args) {
		// ����Ĵ��붨����һ��try��catch������ڲ����쳣
		try {
			int result = divide(4, 2); // ����divide()����
			System.out.println(result);
		} catch (Exception e) { // �Բ��񵽵��쳣���д���
			e.printStackTrace(); // ��ӡ������쳣��Ϣ
		}
	}
	// ����ķ���ʵ�������������������ʹ��throws�ؼ��������׳��쳣
	public static int divide(int x, int y) throws Exception {
		int result = x / y; // ����һ������result��¼����������Ľ��
		return result; // ���������
	}
}

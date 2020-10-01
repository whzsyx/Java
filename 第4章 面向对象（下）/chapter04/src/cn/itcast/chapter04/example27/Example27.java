package cn.itcast.chapter04.example27;
public class Example27 {
	public static void main(String[] args) {
		// ����Ĵ��붨����һ��try��catch������ڲ����쳣
		try {
			int result = divide(4, -2); // ����divide()����������һ��������Ϊ������
			System.out.println(result);
		} catch (DivideByMinusException e) { // �Բ��񵽵��쳣���д���
			System.out.println(e.getMessage()); // ��ӡ������쳣��Ϣ
		}
	}
	// ����ķ���ʵ�������������������ʹ��throws�ؼ��������׳��Զ����쳣
	public static int divide(int x, int y) throws DivideByMinusException {
		if (y < 0) {
			throw new DivideByMinusException("�����Ǹ���");// ʹ��throw�ؼ��������쳣����
		}
		int result = x / y; // ����һ������result��¼����������Ľ��
		return result; // ���������
	}
}

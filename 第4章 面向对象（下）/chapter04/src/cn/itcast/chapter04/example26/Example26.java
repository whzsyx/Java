package cn.itcast.chapter04.example26;
public class Example26 {
	public static void main(String[] args) {
		int result = divide(4, -2); // ����divide()����������һ��������Ϊ������
		System.out.println(result);
	}
	// ����ķ���ʵ�����������������
	public static int divide(int x, int y) {
		if (y < 0) {
			//throw new DivideByMinusException("�����Ǹ���");// ʹ��throw�ؼ��������쳣����
		}
		int result = x / y; // ����һ������result��¼����������Ľ��
		return result; // ���������
	}
}

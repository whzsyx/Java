package cn.itcast.chapter04.example23;
public class Example23 {
	public static void main(String[] args) {		
//		int result = divide(4, 2); // ����divide()����
//		System.out.println(result);
	}
	// ����ķ���ʵ�������������������ʹ��throws�ؼ��������׳��쳣
	public static int divide(int x, int y) throws Exception {
		int result = x / y; // ����һ������result��¼����������Ľ��
		return result; // ���������
	}
}
package cn.itcast.chapter02.example02;
/**
 * ���ݾ��ȶ�ʧ
 */
public class Example02 {
	public static void main(String[] args) {
		byte a; // ����byte���͵ı���a
		int b = 298; // ����int���͵ı���b
		a = (byte) b;
		System.out.println("b=" + b);
		System.out.println("a=" + a);
	}
}
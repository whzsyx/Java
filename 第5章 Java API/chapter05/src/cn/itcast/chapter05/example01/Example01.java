package cn.itcast.chapter05.example01;
/**
 * String�๹�췽����ʹ��
 */
public class Example01 {
	public static void main(String[] args) throws Exception {
		// ����һ���յ��ַ���
		String str1 = new String();
		// ����һ������Ϊabcd���ַ���
		String str2 = new String("abcd");
		// ����һ������Ϊ�ַ�������ַ���
		char[] charArray = new char[] { 'D', 'E', 'F' };
		String str3 = new String(charArray);
		System.out.println("a" + str1 + "b");
		System.out.println(str2);
		System.out.println(str3);
	}
}

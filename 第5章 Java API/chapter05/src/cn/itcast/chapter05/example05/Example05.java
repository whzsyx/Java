package cn.itcast.chapter05.example05;
/**
 * �ַ����жϷ���
 */
public class Example05 {
	public static void main(String[] args) {
		String s1 = "String"; // ����һ���ַ���
		String s2 = "Str";
		System.out.println("�ж��Ƿ����ַ���Str��ͷ:" + s1.startsWith("Str"));
		System.out.println("�ж��Ƿ����ַ���ng��β:" + s1.endsWith("ng"));
		System.out.println("�ж��Ƿ�����ַ���tri:" + s1.contains("tri"));
		System.out.println("�ж��ַ����Ƿ�Ϊ��:" + s1.isEmpty());
		System.out.println("�ж������ַ����Ƿ����" + s1.equals(s2));
	}
}

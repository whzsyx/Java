package cn.itcast.chapter05.example04;
/**
 * replace()��trim()������ʹ��
 */
public class Example04 {
	public static void main(String[] args) {
		String s = "itcast";
		// �ַ����滻����
		System.out.println("��it�滻��cn.it�Ľ��:" + s.replace("it", "cn.it"));
		// �ַ���ȥ���ո����
		String s1 = "     i t c a s t     ";
		System.out.println("ȥ���ַ������˿ո��Ľ��:" + s1.trim());
		System.out.println("ȥ���ַ��������пո��Ľ��:" + s1.replace(" ", ""));
	}
}
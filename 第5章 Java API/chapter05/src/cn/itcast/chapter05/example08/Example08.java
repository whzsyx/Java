package cn.itcast.chapter05.example08;
/*
 * StringBuffer�ĳ��÷���
 */
public class Example08 {
	public static void main(String[] args) {
		System.out.println("1�����------------------------");
		add();
		System.out.println("2��ɾ��------------------------");
		remove();
		System.out.println("3���޸�------------------------");
		alter();
	}
	public static void add() {
		StringBuffer sb = new StringBuffer(); // ����һ���ַ���������
		sb.append("abcdefg"); // ��ĩβ����ַ���
		System.out.println("append��ӽ����" + sb);
		sb.insert(2, "123"); // ��ָ��λ�ò����ַ���
		System.out.println("insert��ӽ����" + sb);
	}
	public static void remove() {
		StringBuffer sb = new StringBuffer("abcdefg");
		sb.delete(1, 5); // ָ����Χɾ��
		System.out.println("ɾ��ָ��λ�ý����" + sb);
		sb.deleteCharAt(2); // ָ��λ��ɾ��
		System.out.println("ɾ��ָ��λ�ý����" + sb);
		sb.delete(0, sb.length()); // ��ջ�����
		System.out.println("��ջ����������" + sb);
	}
	public static void alter() {
		StringBuffer sb = new StringBuffer("abcdef");
		sb.setCharAt(1, 'p'); // �޸�ָ��λ���ַ�
		System.out.println("�޸�ָ��λ���ַ������" + sb);
		sb.replace(1, 3, "qq"); // �滻ָ��λ���ַ������ַ�
		System.out.println("�滻ָ��λ���ַ������������" + sb);
		System.out.println("�ַ�����ת�����" + sb.reverse());
	}
}
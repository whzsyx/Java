package cn.itcast.chapter05.example15;
/**
 * Math���бȽϳ����ķ���
 */
public class Example15 {
	public static void main(String[] args) {
		System.out.println("�������ֵ�Ľ��: " + Math.abs(-1));
		System.out.println("����ڲ�������С����: " + Math.ceil(5.6));
		System.out.println("��С�ڲ������������: " + Math.floor(-4.2));
		System.out.println("��С���������������Ľ��: " + Math.round(-4.6));
		System.out.println("���������Ľϴ�ֵ: " + Math.max(2.1, -2.1));
		System.out.println("���������Ľ�Сֵ: " + Math.min(2.1, -2.1));
		System.out.println("����һ�����ڵ���0.0С��1.0���ֵ: " + Math.random());
	}
}

package cn.itcast.chapter05.example10;
/**
 * ��������ڽ�����Ͳ���ʱ�����ĵ�ʱ��
 */
public class Example10 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();// ѭ����ʼʱ�ĵ�ǰʱ��
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();// ѭ��������ĵ�ǰʱ��
		System.out.println("�������е�ʱ��Ϊ��" + (endTime - startTime) + "����");
	}
}
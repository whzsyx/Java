package cn.itcast.chapter02.example11;
/**
 * switch����ʹ��(���case���������ִ�������һ�������)
 */
public class Example11 {
	public static void main(String[] args) {
		int week = 2;
		switch (week) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			// �� week ����ֵ 1��2��3��4��5 ������һ��ʱ������ʽ��ͬ
			System.out.println("�����ǹ�����");
			break;
		case 6:
		case 7:
			// �� week ����ֵ 6��7 ������һ��ʱ������ʽ��ͬ
			System.out.println("��������Ϣ��");
			break;
		}
	}
}
package cn.itcast.chapter02.task02;
import java.util.Random;
import java.util.Scanner;
/**
 * ��������Ϸ
 */
public class GuessNumber {
	public static void main(String[] args) {
		// 1.ͨ��Random���е�nextInt(int n) ����������һ��0-9֮��������
		int randomNumber = new Random().nextInt(10);
		System.out.println("����������ɣ�");
		// 2.����µ�����
		System.out.println("----���������µ����֣�----");
		Scanner sc = new Scanner(System.in);
		int enterNumber = sc.nextInt();
		// 3.ͨ��whileѭ�������в����ֶԴ��ж�
		// �¶ԣ�����ѭ������Ϸ����
		while (enterNumber != randomNumber) {
			// �´��ˣ����ݽ����������ʾ�����Ų����֣���Ϸ����
			if (enterNumber > randomNumber) {
				// ����´��ˣ���ӡsorry�����´���!������һ��ѭ��
				System.out.println("sorry�����´���!");
			} else {
				// �����С�ˣ���ӡsorry������С��!������һ��ѭ��
				System.out.println("sorry������С��!");
			}
			// ����µ�����
			System.out.println("----���������µ����֣�----");
			enterNumber = sc.nextInt();
		}
		System.out.println("��ϲ��������ˣ�");
	}
}
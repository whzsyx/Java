package cn.itcast.chapter05.example16;
import java.util.Random;
/**
 * ʹ�ù��췽��Random()���������
 */
public class Example16 {
	public static void main(String args[]) {
		Random r = new Random(); // ����������
		// �������10��[0,100)֮�������
		for (int x = 0; x < 10; x++) {
			System.out.println(r.nextInt(100));
		}
	}
}
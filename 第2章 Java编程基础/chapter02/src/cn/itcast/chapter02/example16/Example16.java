package cn.itcast.chapter02.example16;
/**
 * break���
 */
public class Example16 {
	public static void main(String[] args) {
		int x = 1; // �������x����ʼֵΪ1
		while (x <= 4) { // ѭ������
			System.out.println("x = " + x); // ������������ӡx��ֵ
			if (x == 3) {
				break;
			}
			x++; // x��������
		}
	}
}
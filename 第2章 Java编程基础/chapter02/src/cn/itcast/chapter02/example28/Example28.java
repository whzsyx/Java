package cn.itcast.chapter02.example28;
/**
 * ��ָ���쳣
 */
public class Example28 {
	public static void main(String[] args) {
		int[] arr = new int[3]; // ����һ������Ϊ3������
		arr[0] = 5; // Ϊ����ĵ�һ��Ԫ�ظ�ֵ
		System.out.println("arr[0]=" + arr[0]); // ���������Ԫ��
		arr = null; // ������arr��Ϊnull
		System.out.println("arr[0]=" + arr[0]); // ���������Ԫ��
	}
}
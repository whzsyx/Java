package cn.itcast.chapter02.example30;
/**
 * ��ȡ������Ԫ�ص����ֵ
 */
public class Example30 {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 6, 3, 9, 8 }; // ����һ������
		int max = getMax(arr); // ���û�ȡԪ�����ֵ�ķ���
		System.out.println("max=" + max); // ��ӡ���ֵ
	}

	static int getMax(int[] arr) {
		int max = arr[0]; // �������max���ڼ�ס����������ȼ����һ��Ԫ��Ϊ���ֵ
		// ����ͨ��һ��forѭ�����������е�Ԫ��
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) { // �Ƚ� arr[x]��ֵ�Ƿ����max
				max = arr[x]; // ������������arr[x]��ֵ����max
			}
		}
		return max; // �������ֵmax
	}
}
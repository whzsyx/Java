package cn.itcast.chapter02.example32;
/**
 * ��ά�����ʹ��
 */
public class Example32 {
	public static void main(String[] args) {
		int[][] arr = new int[3][]; // ����һ������Ϊ3�Ķ�ά����
		arr[0] = new int[] { 11, 12 }; // Ϊ�����Ԫ�ظ�ֵ
		arr[1] = new int[] { 21, 22, 23 };
		arr[2] = new int[] { 31, 32, 33, 34 };
		int sum = 0; // ���������¼�����۶�
		for (int i = 0; i < arr.length; i++) { // ��������Ԫ��
			int groupSum = 0; // ���������¼С�������ܶ�
			for (int j = 0; j < arr[i].length; j++) { // ����С����ÿ���˵����۶�
				groupSum = groupSum + arr[i][j];
			}
			sum = sum + groupSum; // �ۼ�С�����۶�
			System.out.println("��" + (i + 1) + "С�����۶�Ϊ��" + groupSum + " ��Ԫ��");
		}
		System.out.println("�����۶�Ϊ: " + sum + " ��Ԫ��");
	}
}
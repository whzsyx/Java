package cn.itcast.chapter02.example31;
/**
 * ð������
 */
public class Example31 {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 3, 5, 2 };
		System.out.print("ð������ǰ  ��");
		printArray(arr); // ��ӡ����Ԫ��
		bubbleSort(arr); // �������򷽷�
		System.out.print("ð�������  ��");
		printArray(arr); // ��ӡ����Ԫ��
	}

	// �����ӡ����Ԫ�صķ���
	public static void printArray(int[] arr) {
		// ѭ�����������Ԫ��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // ��ӡԪ�غͿո�
		}
		System.out.print("\n");
	}

	// �������������ķ���
	public static void bubbleSort(int[] arr) {
		// �������ѭ��
		for (int i = 0; i < arr.length - 1; i++) {
			// �����ڲ�ѭ��
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) { // �Ƚ�����Ԫ��
					// ��������д������ڽ�������Ԫ��
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("��" + (i + 1) + "�������");
			printArray(arr); // ÿ�ֱȽϽ�����ӡ����Ԫ��
		}
	}
}
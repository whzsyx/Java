package cn.itcast.chapter05.example06;
/**
 * �ַ����Ľ�ȡ�ͷָ����
 */
public class Example06 {
	public static void main(String[] args) {
		String str = "��ë��-����-ƹ����";
		// �������ַ�����ȡ����
		System.out.println("�ӵ�5���ַ���ȡ��ĩβ�Ľ����" + str.substring(4));
		System.out.println("�ӵ�5���ַ���ȡ����6���ַ��Ľ����" + str.substring(4, 6));
		// �������ַ����ָ����
		System.out.print("�ָ����ַ��������е�Ԫ������Ϊ:");
		String[] strArray = str.split("-"); // ���ַ���ת��Ϊ�ַ�������
		for (int i = 0; i < strArray.length; i++) {
			if (i != strArray.length - 1) {
				// ���������������һ��Ԫ��,��Ԫ�غ���Ӷ���
				System.out.print(strArray[i] + ",");
			} else {
				// ��������һ��Ԫ�غ��治�Ӷ���
				System.out.println(strArray[i]);
			}
		}
	}
}
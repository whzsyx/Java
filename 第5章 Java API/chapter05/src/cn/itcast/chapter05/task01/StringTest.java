package cn.itcast.chapter05.task01;
public class StringTest {
	public static void main(String[] args) {
		String str = "nbaernbatnbaynbauinbaopnba";// ����
		String key = "nba";// �Ӵ�
		int count = getKeyStringCount(str, key);
		System.out.println("count=" + count);
	}
	/**
	 * ��ȡ�Ӵ��������г��ֵĴ���
	 */
	public static int getKeyStringCount(String str, String key) {
		// ���������,��¼���ֵĴ���
		int count = 0;
		// ��������в������Ӵ�����ֱ�ӷ���count
		if (!str.contains(key)) {
			return count;
		}
		// ���������¼key���ֵ�λ��
		int index = 0;
		while ((index = str.indexOf(key)) != -1) {
			str = str.substring(index + key.length());
			count++;
		}
		return count;
	}
}
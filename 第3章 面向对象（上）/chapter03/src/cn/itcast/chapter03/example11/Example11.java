package cn.itcast.chapter03.example11;
/**
 * ��������
 */
class Person {
	// ���涨���finalize����������������ǰ������
	public void finalize() {
		System.out.println("���󽫱���Ϊ��������...");
	}
}

public class Example11 {
	public static void main(String[] args) {
		// �����Ǵ���������Person����
		Person p1 = new Person();
		Person p2 = new Person();
		// ���潫������Ϊnull���ö����Ϊ����
		p1 = null;
		p2 = null;
		// ���÷���������������
		System.gc();
		for (int i = 0; i < 1000000; i++) {
			// Ϊ���ӳ��������е�ʱ��
		}
	}
}

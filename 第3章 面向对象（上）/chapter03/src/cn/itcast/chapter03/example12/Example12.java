package cn.itcast.chapter03.example12;
/*
 * ��̬����
 */
class Student {
	static String schoolName; // ���徲̬����schoolName
}

public class Example12 {
	public static void main(String[] args) {
		Student stu1 = new Student(); // ����ѧ������
		Student stu2 = new Student();
		Student.schoolName = "���ǲ���"; // Ϊ��̬������ֵ
		System.out.println("�ҵ�ѧУ��" + stu1.schoolName); // ��ӡ��һ��ѧ�������ѧУ
		System.out.println("�ҵ�ѧУ��" + stu2.schoolName); // ��ӡ�ڶ���ѧ�������ѧУ
	}
}

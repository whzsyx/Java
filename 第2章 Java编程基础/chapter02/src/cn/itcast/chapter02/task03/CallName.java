package cn.itcast.chapter02.task03;
import java.util.Random;
import java.util.Scanner;
/**
 * ���������
 */
public class CallName {
	/**
	 * 1.�洢ȫ��ͬѧ���� ����һ���洢���ͬѧ���������������飩 ��������ÿ��ͬѧ���������洢�������У����飩
	 */
	public static void addStudentName(String[] students) {
		// ����������ͬѧ�����洢��������
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("�洢��" + (i + 1) + "��������");
			// ���տ���̨¼��������ַ���
			students[i] = sc.next();
		}
	}

	/**
	 * 2.����ȫ��ͬѧ����
	 */
	public static void printStudentName(String[] students) {
		// �������飬�õ�ÿ��ͬѧ����
		for (int i = 0; i < students.length; i++) {
			String name = students[i];
			// ��ӡͬѧ����
			System.out.println("��" + (i + 1) + "��ѧ��������" + name);
		}
	}

	/**
	 * 3.�����������һ��
	 */
	public static String randomStudentName(String[] students) {
		// �������鳤�ȣ���ȡ�������
		int index = new Random().nextInt(students.length);
		// ͨ����������������л�ȡ����
		String name = students[index];
		// ��������㵽������
		return name;
	}

	public static void main(String[] args) {
		System.out.println("--------���������--------");
		// ����һ�����Դ洢���ͬѧ���������������飩
		String[] students = new String[3];
		/*
		 * 1.�洢ȫ��ͬѧ����
		 */
		addStudentName(students);
		/*
		 * 2.����ȫ��ͬѧ����
		 */
		printStudentName(students);
		/*
		 * 3.�����������һ��
		 */
		String randomName = randomStudentName(students);
		System.out.println("���㵽����ͬѧ�� :" + randomName);
	}
}
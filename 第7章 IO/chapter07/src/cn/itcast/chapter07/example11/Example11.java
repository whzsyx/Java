package cn.itcast.chapter07.example11;
import java.io.*;
/**
 * File��ĳ��÷���
 */
public class Example11 {
	public static void main(String[] args) {
		File file = new File("example.txt"); // ����File�ļ�����,��ʾһ���ļ�
		// ��ȡ�ļ�����
		System.out.println("�ļ�����:" + file.getName());
		// ��ȡ�ļ������·��
		System.out.println("�ļ������·��:" + file.getPath());
		// ��ȡ�ļ��ľ���·��
		System.out.println("�ļ��ľ���·��:" + file.getAbsolutePath());
		// ��ȡ�ļ��ĸ�·��
		System.out.println("�ļ��ĸ�·��:" + file.getParent());
		// �ж��ļ��Ƿ�ɶ�
		System.out.println(file.canRead() ? "�ļ��ɶ�" : "�ļ����ɶ�");
		// �ж��ļ��Ƿ��д
		System.out.println(file.canWrite() ? "�ļ���д" : "�ļ�����д");
		// �ж��Ƿ���һ���ļ�
		System.out.println(file.isFile() ? "��һ���ļ�" : "����һ���ļ�");
		// �ж��Ƿ���һ��Ŀ¼
		System.out.println(file.isDirectory() ? "��һ��Ŀ¼" : "����һ��Ŀ¼");
		// �ж��Ƿ���һ������·��
		System.out.println(file.isAbsolute() ? "�Ǿ���·��" : "���Ǿ���·��");
		// �õ��ļ�����޸�ʱ��
		System.out.println("����޸�ʱ��Ϊ:" + file.lastModified());
		// �õ��ļ��Ĵ�С
		System.out.println("�ļ���СΪ:" + file.length() + " bytes");
		// �Ƿ�ɹ�ɾ���ļ�
		System.out.println("�Ƿ�ɹ�ɾ���ļ�" + file.delete());
	}
}
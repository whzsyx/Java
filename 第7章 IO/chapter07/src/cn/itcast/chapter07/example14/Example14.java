package cn.itcast.chapter07.example14;
import java.io.*;
/**
 * ����ָ��Ŀ¼�µİ�����Ŀ¼�µ������ļ�
 */
public class Example14 {
	public static void main(String[] args) {
		File file = new File("D:\\eclipseWorkspace\\JavaBasicWorkspace\\chapter07"); // ����һ������Ŀ¼��File����
		fileDir(file); // ����FileDir����
	}

	public static void fileDir(File dir) {
		File[] files = dir.listFiles(); // ��ñ�ʾĿ¼�������ļ�������
		for (File file : files) { // �������е���Ŀ¼���ļ�
			if (file.isDirectory()) {
				fileDir(file); // �����Ŀ¼���ݹ����fileDir()
			}
			System.out.println(file.getAbsolutePath()); // ����ļ��ľ���·��
		}
	}
}
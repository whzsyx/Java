package cn.itcast.chapter07.example12;
import java.io.*;
/**
 * list()�������÷�
 */
public class Example12 {
	public static void main(String[] args) throws Exception {
		File file = new File("D:\\eclipseWorkspace\\JavaBasicWorkspace\\chapter07"); // ����File����
		if (file.isDirectory()) { // �ж�File�����Ӧ��Ŀ¼�Ƿ����
			String[] names = file.list(); // ���Ŀ¼�µ������ļ����ļ���
			for (String name : names) {
				System.out.println(name); // ����ļ���
			}
		}
	}
}
package cn.itcast.chapter07.example08;
import java.io.*;
/**
 * ʹ��FileWriter���ַ�д���ļ�
 */
public class Example08 {
	public static void main(String[] args) throws Exception {
		// ����һ��FileWriter�����������ļ���д������
		FileWriter writer = new FileWriter("writer.txt");
		String str = "��ã����ǲ���";
		writer.write(str); // ���ַ�����д�뵽�ı��ļ���
		writer.write("\r\n"); // �������任��
		writer.close(); // �ر�д�������ͷ���Դ
	}
}
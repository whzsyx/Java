package cn.itcast.chapter07.example02;
import java.io.*;
/**
 * ʹ��FileOutputStream������д���ļ�
 */
public class Example02 {
	public static void main(String[] args) throws Exception {
		// ����һ���ļ��ֽ������
		FileOutputStream out = new FileOutputStream("example.txt");
		String str = "���ǲ���";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}
}
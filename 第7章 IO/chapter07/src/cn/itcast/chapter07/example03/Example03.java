package cn.itcast.chapter07.example03;
import java.io.*;
/**
 * ʹ��FileOutputStream������׷�ӵ��ļ�ĩβ
 */
public class Example03 {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("example.txt ", true);
		String str = "��ӭ��!";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}
}
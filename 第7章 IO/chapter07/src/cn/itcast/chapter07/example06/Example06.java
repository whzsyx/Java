package cn.itcast.chapter07.example06;
import java.io.*;
/**
 * BufferedInputStream��BufferedOutputStream �����������÷�
 */
public class Example06 {
	public static void main(String[] args) throws Exception {
		// ����һ������������������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"src.txt"));
		// ����һ�����������������
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("des.txt"));
		int len;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		bis.close();
		bos.close();
	}
}
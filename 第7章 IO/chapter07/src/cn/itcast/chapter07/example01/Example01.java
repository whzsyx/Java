package cn.itcast.chapter07.example01;
import java.io.*;
/**
 * �ֽ������ļ����ݵĶ�ȡ
 */
public class Example01 {
	public static void main(String[] args) throws Exception {
		// ����һ���ļ��ֽ�������
		FileInputStream in = new FileInputStream("test.txt");
		int b = 0; // ����һ��int���͵ı���b����סÿ�ζ�ȡ��һ���ֽ�
		while (true) {
			b = in.read(); // ����b��ס��ȡ��һ���ֽ�
			if (b == -1) { // �����ȡ���ֽ�Ϊ-1������whileѭ��
				break;
			}
			System.out.println(b); // ����bд��
		}
		in.close();
	}
}
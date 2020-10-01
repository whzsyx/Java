package cn.itcast.chapter07.example05;
import java.io.*;
/**
 * �ļ��Ŀ�����ʹ�û����������ļ���
 */
public class Example05 {
	public static void main(String[] args) throws Exception {
		// ����һ���ֽ������������ڶ�ȡ��ǰĿ¼��source�ļ����е�mp3�ļ�
		InputStream in = new FileInputStream("source\\�廷֮��.mp3");
		// ����һ���ļ��ֽ�����������ڽ���ȡ������д�뵱ǰĿ¼��target�ļ���
		OutputStream out = new FileOutputStream("target\\�廷֮��.mp3");
		// �������û�������д�ļ�
		byte[] buff = new byte[1024]; // ����һ���ֽ����飬��Ϊ������
		// ����һ��int���͵ı���len��ס��ȡ���뻺�������ֽ���
		int len;
		long begintime = System.currentTimeMillis();
		while ((len = in.read(buff)) != -1) { // �ж��Ƿ�����ļ�ĩβ
			out.write(buff, 0, len); // �ӵ�һ���ֽڿ�ʼ�����ļ�д��len���ֽ�
		}
		long endtime = System.currentTimeMillis();
		System.out.println("�����ļ������ĵ�ʱ���ǣ�" + (endtime - begintime) + "����");
		in.close();
		out.close();
	}
}
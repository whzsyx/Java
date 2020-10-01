package cn.itcast.chapter07.example04;
import java.io.*;
/**
 * �ļ��Ŀ���
 */
public class Example04 {
	public static void main(String[] args) throws Exception {
		// ����һ���ֽ������������ڶ�ȡ��ǰĿ¼��source�ļ����е�mp3�ļ�
		InputStream in = new FileInputStream("source\\�廷֮��.mp3");
		// ����һ���ļ��ֽ�����������ڽ���ȡ������д��targetĿ¼�µ��ļ���
		OutputStream out = new FileOutputStream("target\\�廷֮��.mp3");
		int len; // ����һ��int���͵ı���len����סÿ�ζ�ȡ��һ���ֽ�
		long begintime = System.currentTimeMillis(); // ��ȡ�����ļ�ǰ��ϵͳʱ��
		while ((len = in.read()) != -1) { // ��ȡһ���ֽڲ��ж��Ƿ�����ļ�ĩβ
			out.write(len); // ���������ֽ�д���ļ�
		}
		long endtime = System.currentTimeMillis(); // ��ȡ�ļ���������ʱ��ϵͳʱ��
		System.out.println("�����ļ������ĵ�ʱ���ǣ�" + (endtime - begintime) + "����");
		in.close();
		out.close();
	}
}
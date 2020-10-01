package cn.itcast.chapter11.task02;
import java.io.*;
import java.net.*;
/**
 * �ͻ���
 */
public class FileClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1", 10001); // �����ͻ���Socket
		OutputStream out = socket.getOutputStream(); // ��ȡSocket�����������
		// ����FileInputStream����
		FileInputStream fis = new FileInputStream("F:\\1.jpg");
		byte[] buf = new byte[1024]; // ����һ���ֽ�����
		int len; // ����һ��int���͵ı���len
		while ((len = fis.read(buf)) != -1) { // ѭ����ȡ����
			out.write(buf, 0, len);
		}
		socket.shutdownOutput(); // �رտͻ��������
		InputStream in = socket.getInputStream(); // ��ȡSocket������������
		byte[] bufMsg = new byte[1024]; // ����һ���ֽ�����
		int num = in.read(bufMsg); // ���շ���˵���Ϣ
		String Msg = new String(bufMsg, 0, num);
		System.out.println(Msg);
		fis.close(); // �ؼ�����������
		socket.close(); // �ر�Socket����
	}
}

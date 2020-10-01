package cn.itcast.chapter11.example03;
import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[] args) throws Exception {
		new TCPServer().listen(); // ����TCPServer���󣬲�����listen()����
	}
}
// TCP�����
class TCPServer {
	private static final int PORT = 7788; // ����һ���˿ں�
	public void listen() throws Exception { // ����һ��listen()�������׳�һ���쳣
		ServerSocket serverSocket = new ServerSocket(PORT); // ����ServerSocket����
		Socket client = serverSocket.accept(); // ����ServerSocket��accept()������������
		OutputStream os = client.getOutputStream();// ��ȡ�ͻ��˵������
		System.out.println("��ʼ��ͻ��˽�������");
		os.write(("���ǲ��ͻ�ӭ�㣡").getBytes()); // ���ͻ������ӵ������ʱ����ͻ����������
		Thread.sleep(5000); // ģ��ִ����������ռ�õ�ʱ��
		System.out.println("������ͻ��˽�������");
		os.close();
		client.close();
	}
}

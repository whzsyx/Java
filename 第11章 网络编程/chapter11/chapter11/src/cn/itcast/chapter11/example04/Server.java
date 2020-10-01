package cn.itcast.chapter11.example04;
 import java.io.*;
 import java.net.*;
 public class Server {
 	public static void main(String[] args) throws Exception {
 		new TCPServer().listen();   // ����TCPServer���󣬲�����listen()����
 	}
 }
 // TCP�����
 class TCPServer {
 	private static final int PORT = 7788; // ����һ����̬������Ϊ�˿ں�
 	public void listen() throws Exception {
           // ����ServerSocket���󣬼���ָ���Ķ˿�
 		ServerSocket serverSocket = new ServerSocket(PORT); 
          // ʹ��whileѭ����ͣ�Ľ��տͻ��˷��͵�����
 		while (true) {
               // ����ServerSocket��accept()������ͻ��˽�������
 			final Socket client = serverSocket.accept();
               // ����Ĵ�����������һ���µ��߳�
 			new Thread() {              
 				public void run() {
 					OutputStream os;  // ����һ�����������
 					try {
 						os = client.getOutputStream();  // ��ȡ�ͻ��˵������
 						System.out.println("��ʼ��ͻ��˽�������");
 						os.write(("���ǲ��ͻ�ӭ�㣡").getBytes());
 						Thread.sleep(5000);               // ʹ�߳�����5000����
 						System.out.println("������ͻ��˽�������");
 						os.close();                        // �ر������
 						client.close();                   // �ر�Socket����
 					} catch (Exception e) {
 						e.printStackTrace();
 					}
 				};
 			}.start();
 		}
 	}
 }
package cn.itcast.chapter11.example02;
import java.net.*;
/**
 * ���Ͷ�
 */
public class Sender {
	public static void main(String[] args) throws Exception {		
		// ����һ��DatagramSocket����
		DatagramSocket ds = new DatagramSocket(3000);
		String str = "hello world"; // Ҫ���͵�����
		byte[] arr = str.getBytes();        // ��������ַ���תΪ�ֽ�����
		/*
		 * ����һ��Ҫ���͵����ݰ������ݰ��������͵����ݣ����ݵĳ��ȣ����ն˵�IP��ַ�Լ��˿ں�
		 */
		DatagramPacket dp = new DatagramPacket(arr, arr.length,
				InetAddress.getByName("localhost"), 8954);
		System.out.println("������Ϣ");
		ds.send(dp); // ��������
		ds.close(); // �ͷ���Դ
	}
}
package cn.itcast.chapter11.example01;
import java.net.InetAddress;
/*
 * InetAddress�ĳ��÷���
 */
public class Example01 {
	public static void main(String[] args) throws Exception {
		InetAddress localAddress = InetAddress.getLocalHost();
		InetAddress remoteAddress = InetAddress.getByName("www.itcast.cn");
		System.out.println("������IP��ַ��" + localAddress.getHostAddress());
		System.out.println("itcast��IP��ַ��" + remoteAddress.getHostAddress());
		System.out.println("3���Ƿ�ɴ" + remoteAddress.isReachable(3000));
		System.out.println("itcast��������Ϊ��" + remoteAddress.getHostName());
	}
}
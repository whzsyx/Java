package cn.itcast.chapter11.task01;
import java.util.Scanner;
/**
 * ������
 */
public class CharRoom {
	public static void main(String[] args) {
		System.out.println("��ӭ������������!");
		Scanner sc = new Scanner(System.in);
		System.out.print("�����뱾�����Ͷ˶˿ںţ�");
		int sendPort = sc.nextInt();
		System.out.print("�����뱾������ն˶˿ںţ�");
		int receivePort = sc.nextInt();
		System.out.println("����ϵͳ��������");		
		new Thread(new SendTask(sendPort), "���Ͷ�����").start(); //���Ͳ���
		new Thread(new ReceiveTask(receivePort), "���ն�����").start();//���ղ���
	}
}
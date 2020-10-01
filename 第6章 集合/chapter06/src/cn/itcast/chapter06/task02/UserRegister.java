package cn.itcast.chapter06.task02;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
/**
 * �û�ע��
 */
public class UserRegister {
	public static HashSet<User> USER_DATA = new HashSet<User>(); // �û�����
	public static void main(String[] args) {
		initData();// ��ʼ����Ա��Ϣ
		Scanner scan = new Scanner(System.in);
		System.out.print("�������û�����");
		String userName = scan.nextLine();// ��ȡ�û���
		System.out.print("���������룺");
		String password = scan.nextLine();// ��ȡ����
		System.out.print("���ظ����룺");
		String repassword = scan.nextLine();// ��ȡ�ظ�����
		System.out.print("�������ڣ�");
		String birthday = scan.nextLine();// ��ȡ��������
		System.out.print("�ֻ����룺");
		String telNumber = scan.nextLine();// ��ȡ�ֻ�����
		System.out.print("�������䣺");
		String email = scan.nextLine();// ��ȡ��������
		// У���û���Ϣ,���ص�¼״̬��Ϣ
		CheckInfo checkInfo = new CheckInfo(USER_DATA);
		String result = checkInfo.checkAction(userName, password, repassword, 
				birthday, telNumber, email);
		System.out.println("ע����:" + result);
	}
	// ��ʼ�����ݣ����������Ѵ��ڵ��û���Ϣ
	private static void initData() {
		User user = new User("����", "zz,123", new Date(), 
				"18810319240", "zhangzheng@itcast.cn");
		User user2 = new User("����", "zq,123", new Date(), 
				"18618121193", "zhouqi@itcast.cn");
		USER_DATA.add(user);
		USER_DATA.add(user2);
	}
}
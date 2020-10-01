package cn.itcast.chapter07.task02;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * ģ����±�����
 */
public class Notepad {
	private static String filePath;
	private static String message = "";
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("--1:�½��ļ� 2:���ļ�  3:�޸��ļ�  4:���� 5:�˳�--");
		while (true) {
			System.out.print("���������ָ�");
			int command = sc.nextInt();
			switch (command) {
			case 1:
				createFile();// 1:�½��ļ�
				break;
			case 2:
				openFile();// 2:���ļ�
				break;
			case 3:
				editFile();// 3:�޸��ļ�
				break;
			case 4:
				saveFile();// 4:����
				break;
			case 5:
				exit();// 5:�˳�
				break;
			default:
				System.out.println("�������ָ�����");
				break;
			}
		}
	}
	/**
	 * �½��ļ� �ӿ���̨��ȡ����
	 */
	private static void createFile() {
		message = "";// �½��ļ�ʱ���ݴ��ļ��������
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ݣ�ֹͣ��д������\"stop\":");// ��ʾ
		StringBuffer stb = new StringBuffer();// ���ں����������ݵ�ƴ��
		String inputMessage = "";
		while (!inputMessage.equals("stop")) {// �����롰stop��ʱ��ֹͣ����
			if (stb.length() > 0) {
				stb.append("\r\n");// ׷�ӻ��з�
			}
			stb.append(inputMessage);// ƴ��������Ϣ
			inputMessage = sc.nextLine();// ��ȡ������Ϣ
		}
		message = stb.toString();// �����������ݴ�
	}
	/**
	 * ���ļ�
	 */
	private static void openFile() throws Exception {
		message = "";// ���ļ�ʱ�����ݴ��������
		Scanner sc = new Scanner(System.in);
		System.out.print("��������ļ���λ�ã�");
		filePath = sc.next();// ��ȡ���ļ���·��
		// ����ֻ������txt��ʽ���ļ�·��
		if (filePath != null && !filePath.endsWith(".txt")) {
			System.out.print("��ѡ���ı��ļ���");
			return;
		}
		FileReader in = new FileReader(filePath);// ʵ����һ��FileReader����
		char[] charArray = new char[1024];// ��������
		int len = 0;
		StringBuffer sb = new StringBuffer();
		// ѭ����ȡ��һ�ζ�ȡһ���ַ�����
		while ((len = in.read(charArray)) != -1) {
			sb.append(charArray);
		}
		message = sb.toString();// �����ļ������ݴ�
		System.out.println("���ļ����ݣ�" + "\r\n" + message);
		in.close();// �ͷ���Դ
	}
	/**
	 * �޸��ļ����� ͨ���ַ����滻����ʽ
	 */
	private static void editFile() {
		if (message == "" && filePath == null) {
			System.out.println("�����½��ļ����ߴ��ļ�");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ����ݣ��� \"�޸ĵ�Ŀ������:�޸�֮�������\" ��ʽ��,"
				+ "ֹͣ�޸�������\"stop\":");
		String inputMessage = "";
		while (!inputMessage.equals("stop")) {// ������stopʱ,ֹͣ�޸�
			inputMessage = sc.nextLine();
			if (inputMessage != null && inputMessage.length() > 0) {
				// ����������ָ��ݡ�������ֳ�����
				String[] editMessage = inputMessage.split(":");
				if (editMessage != null && editMessage.length > 1) {
					// �����������Ϣ���ļ��������滻
					message = message.replace(editMessage[0], editMessage[1]);
				}
			}
		}
		System.out.println("�޸ĺ������:" + "\r\n" + message);
	}
	/**
	 * ���� �½��ļ������û������·�� �򿪵��ļ���ԭ�ļ�����
	 */
	private static void saveFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		FileWriter out = null;
		if (filePath != null) {// �ļ����ɡ��򿪡������
			out = new FileWriter(filePath);// ��ԭ�ļ�����
		} else {// �½����ļ�
			System.out.print("�������ļ�����ľ���·����");
			String path = sc.next();// ��ȡ�ļ������·��
			filePath = path;
			// ������·���д�д��ĸ�滻��Сд��ĸ���ж��ǲ����ı���ʽ
			if (!filePath.toLowerCase().endsWith(".txt")) {
				filePath += ".txt";
			}
			out = new FileWriter(filePath);// ���������
		}
		out.write(message);// д���ݴ������
		out.close();// �ر������
		message = "";// �޸��ļ�ǰ�ֽ�д�������ÿ�
		filePath = null;// ���ļ�·����null
	}
	/**
	 * �˳�
	 */
	private static void exit() {
		System.out.println("�����˳�ϵͳ��ллʹ�ã�");
		System.exit(0);
	}
}
package cn.itcast.chapter11.task02;
import java.io.*;
import java.net.*;
/**
 * �ļ�������
 */
public class FileServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(10001); // ����ServerSocket����
		while (true) {
			// ����accept()�������տͻ������󣬵õ�Socket����
			Socket s = serverSocket.accept();
			// ÿ���Ϳͻ��˽���Socket���Ӻ󣬵�������һ���̴߳���Ϳͻ��˵Ľ���
			new Thread(new ServerThread(s)).start();
		}
	}
}

class ServerThread implements Runnable {
	private Socket socket; // ����һ��Socket���͵�����

	public ServerThread(Socket socket) { // ���췽���а�Socket������Ϊʵ�δ���
		this.socket = socket;
	}

	public void run() {
		String ip = socket.getInetAddress().getHostAddress(); // ��ȡ�ͻ��˵�IP��ַ
		int count = 1; // �ϴ�ͼƬ����
		try {
			InputStream in = socket.getInputStream();
			File parentFile = new File("F:\\upload\\"); // �����ϴ�ͼƬĿ¼��File����
			if (!parentFile.exists()) { // ��������ڣ��ʹ������Ŀ¼
				parentFile.mkdir();
			}
			// �ѿͻ��˵�IP��ַ��Ϊ�ϴ��ļ����ļ���
			File file = new File(parentFile, ip + "(" + count + ").jpg");
			while (file.exists()) {
				// ����ļ������ڣ����count++
				file = new File(parentFile, ip + "(" + (count++) + ").jpg");
			}
			// ����FileOutputStream����
			FileOutputStream fos = new FileOutputStream(file);
			byte[] buf = new byte[1024]; // ����һ���ֽ�����
			int len = 0; // ����һ��int���͵ı���len����ʼֵΪ0
			while ((len = in.read(buf)) != -1) { // ѭ����ȡ����
				fos.write(buf, 0, len);
			}
			OutputStream out = socket.getOutputStream();// ��ȡ����˵������
			out.write("�ϴ��ɹ�".getBytes()); // �ϴ��ɹ�����ͻ���д�����ϴ��ɹ���
			fos.close(); // �ر����������
			socket.close(); // �ر�Socket����
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

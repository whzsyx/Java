package cn.itcast.chapter07.example10;
import java.io.*;
/**
 * ���ֽ���תΪ�ַ���
 */
public class Example10 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("src.txt");// �����ֽ�������
		InputStreamReader isr = new InputStreamReader(in); // ���ֽ�������ת�����ַ�������
		BufferedReader br = new BufferedReader(isr); // �����ַ������󻺳���
		FileOutputStream out = new FileOutputStream("des.txt");
		// ���ֽ������ת�����ַ������
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw); // �����ַ���������󻺳���
		String line;
		while ((line = br.readLine()) != null) { // �ж��Ƿ�����ļ�ĩβ
			bw.write(line); // �����ȡ�����ļ�
		}
		br.close();
		bw.close();
	}
}
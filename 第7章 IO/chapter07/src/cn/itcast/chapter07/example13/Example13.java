package cn.itcast.chapter07.example13;
import java.io.*;
/**
 * ����ָ��Ŀ¼��������չ��Ϊ.txt���ļ�
 */
public class Example13 {
	public static void main(String[] args) throws Exception {
		// ����File����
		File file = new File("D:\\eclipseWorkspace\\JavaBasicWorkspace\\chapter07");
		// ��������������
		FilenameFilter filter = new FilenameFilter() {
			// ʵ��accept()����
			public boolean accept(File dir, String name) {
				File currFile = new File(dir, name);
				// ����ļ�����.txt��β����true�����򷵻�false
				if (currFile.isFile() && name.endsWith(".txt")) {
					return true;
				} else {
					return false;
				}
			}
		};
		if (file.exists()) { // �ж�File�����Ӧ��Ŀ¼�Ƿ����
			String[] lists = file.list(filter); // ��ù��˺�������ļ�������
			for (String name : lists) {
				System.out.println(name);
			}
		}
	}
}
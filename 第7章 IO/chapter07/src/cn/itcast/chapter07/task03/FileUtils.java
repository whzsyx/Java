package cn.itcast.chapter07.task03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class FileUtils {
	/**
	 * ָ���ؼ��ּ����ļ�
	 * @param file   File����
	 * @param key    �ؼ���
	 * @return �����ؼ��ֵ��ļ�·��
	 */
	public static ArrayList<String> listFiles(File file, final String key) {
		FilenameFilter filter = new FilenameFilter() { // ��������������
			public boolean accept(File dir, String name) {// ʵ��accept()����
				File currFile = new File(dir, name);
				// ����ļ��������ؼ��ַ���true�����򷵻�false
				if (currFile.isFile() && name.contains(key)) {
					return true;
				}
				return false;
			}
		};
		// �ݹ鷽ʽ��ȡ�涨��·��
		ArrayList<String> arraylist = fileDir(file, filter);
		return arraylist;
	}

	/**
	 * ָ����׺�������ļ�
	 * @param file   File����
	 * @param suffixArray   ��׺������
	 * @return ָ����׺�����ļ�·��
	 */
	public static ArrayList<String> listFiles(File file,
			final String[] suffixArray) {
		FilenameFilter filter = new FilenameFilter() { // ��������������
			public boolean accept(File dir, String name) {// ʵ��accept()����
				File currFile = new File(dir, name);
				if (currFile.isFile()) {// ����ļ�����ָ����׺����β����true�����򷵻�false
					for (String suffix : suffixArray) {
						if (name.endsWith("." + suffix)) {
							return true;
						}
					}
				}
				return false;
			}
		};
		// �ݹ鷽ʽ��ȡ�涨��·��
		ArrayList<String> arraylist = fileDir(file, filter);
		return arraylist;
	}

	/**
	 * �ݹ鷽ʽ��ȡ�涨��·��
	 * @param dir   File����
	 * @param filter   ������
	 * @return ���������˺���ļ�·��
	 */
	public static ArrayList<String> fileDir(File dir, FilenameFilter filter) {
		ArrayList<String> arraylist = new ArrayList<String>();
		File[] lists = dir.listFiles(filter); // ��ù��˺�������ļ�����
		for (File list : lists) {
			// ���ļ��ľ���·���ŵ�������
			arraylist.add(list.getAbsolutePath());
		}
		File[] files = dir.listFiles(); // ��õ�ǰĿ¼�������ļ�������
		for (File file : files) { // �������е���Ŀ¼���ļ�
			if (file.isDirectory()) {
				// �����Ŀ¼���ݹ����fileDir()
				ArrayList<String> every = fileDir(file, filter);
				arraylist.addAll(every);// ���ļ����µ��ļ�·����ӵ�������
			}
		}// ��ʱ�ļ������е�ǰĿ¼�µ��ļ�·�����͵�ǰĿ¼����Ŀ¼�µ��ļ�·��
		return arraylist;
	}

	/**
	 * �����ļ�/Ŀ¼
	 * @param srcFile   ԴĿ¼
	 * @param destFile  Ŀ��Ŀ¼
	 */
	public static void copySrcPathToDestPath(File srcDir, File destDir)
			throws Exception {
		File[] files = srcDir.listFiles();// ���ļ�Ŀ¼
		for (int i = 0; i < files.length; i++) {
			File copiedFile = new File(destDir, files[i].getName());// ����ָ��Ŀ¼���ļ�
			if (files[i].isDirectory()) {// �����Ŀ¼
				if (!copiedFile.mkdirs()) {// �����ļ���
					System.out.println("�޷�������" + copiedFile);
					return;
				}
				// ���õݹ飬��ȡ���ļ����µ��ļ�·��
				copySrcPathToDestPath(files[i], copiedFile);
			} else {// �����ļ�
				FileInputStream input = new FileInputStream(files[i]);// ��ȡ������
				FileOutputStream output = new FileOutputStream(copiedFile);// ��ȡ�����
				byte[] buffer = new byte[1024];// ����������
				int n = 0;
				// ѭ����ȡ�ֽ�
				while ((n = input.read(buffer)) != -1) {
					output.write(buffer, 0, n);
				}
				input.close();// �ر�������
				output.close();// �ر������
			}
		}
	}
}
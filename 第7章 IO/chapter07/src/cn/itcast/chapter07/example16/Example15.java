package cn.itcast.chapter07.example16;
import java.io.*;
/**
 * ɾ��ָ��Ŀ¼
 */
public class Example15 {
	public static void main(String[] args) {
		File file = new File("D:\\test"); // ����һ������Ŀ¼��File����
		if (file.exists()) {
			System.out.println(file.delete());
		}
	}
}
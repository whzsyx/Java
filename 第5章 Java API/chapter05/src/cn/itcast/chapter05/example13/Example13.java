package cn.itcast.chapter05.example13;
import java.io.IOException;
/**
 * ʹ��exec()�����򿪼��±�
 */
public class Example13 {
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime(); // ����Runtimeʵ������
		rt.exec("notepad.exe"); // ����exec()����
	}
}
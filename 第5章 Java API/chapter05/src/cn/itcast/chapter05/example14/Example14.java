package cn.itcast.chapter05.example14;
/**
 * �򿪵ļ��±�����3����Զ��ر�
 */
public class Example14 {
	public static void main(String[] args) throws Exception {
		Runtime rt = Runtime.getRuntime(); // ����һ��Runtimeʵ������
		Process process = rt.exec("notepad.exe");// �õ���ʾ���̵�Process����
		Thread.sleep(3000); // ��������3��
		process.destroy(); // ɱ������
	}
}
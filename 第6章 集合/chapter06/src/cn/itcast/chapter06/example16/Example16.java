package cn.itcast.chapter06.example16;
import java.util.*;
/**
 * ǿ������ת������
 */
public class Example16 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ����ArrayList����
		//ArrayList<String> list = new ArrayList<String>();// �������϶���ָ������ΪString
		list.add("String"); // ����ַ�������
		list.add("Collection");
		list.add(1); // ���Integer����
		for (Object obj : list) { // ��������
			String str = (String) obj; // ǿ��ת����String����
		}
	}
}
package cn.itcast.chapter06.example03;
import java.util.*;
/**
 * ʹ��Iterator���������е�Ԫ��
 */
public class Example03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ����ArrayList����
		list.add("data_1"); // ��ü���������ַ���
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		Iterator it = list.iterator(); // ��ȡIterator����
		while (it.hasNext()) { // �ж�ArrayList�������Ƿ������һ��Ԫ��
			Object obj = it.next(); // ȡ��ArrayList�����е�Ԫ��
			System.out.println(obj);
		}
	}
}
package cn.itcast.chapter06.example04;
import java.util.*;
/**
 * foreachѭ��
 */
public class Example04 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ����ArrayList����
		list.add("Jack"); // ��ArrayList����������ַ���Ԫ��
		list.add("Rose");
		list.add("Tom");
		for (Object obj : list) { // ʹ��foreachѭ������ArrayList����
			System.out.println(obj); // ȡ������ӡArrayList�����е�Ԫ��
		}
	}
}
package cn.itcast.chapter06.example17;
import java.util.*;
/**
 * ���͵�ʹ��
 */
public class Example17 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// ����ArrayList���ϣ�ʹ�÷���
		list.add("String");             // ����ַ�������
		list.add("Collection");
		for (String str : list) {     // ��������
			System.out.println(str); 
		}
	}
}
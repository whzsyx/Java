package cn.itcast.chapter06.example07;
import java.util.*;
/**
 * HashSet���ϵ��÷�
 */
public class Example07 {
	public static void main(String[] args) {
		HashSet set = new HashSet();   // ����HashSet����
		set.add("Jack");                 // ���Set����������ַ���
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");                 // ���Set����������ظ�Ԫ��
		Iterator it = set.iterator(); // ��ȡIterator����
		while (it.hasNext()) {         // ͨ��whileѭ�����жϼ������Ƿ���Ԫ��
			Object obj = it.next();   // �����Ԫ�أ���ͨ����������next()������ȡԪ��
			System.out.println(obj);
		}
	}
}
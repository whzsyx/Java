package cn.itcast.chapter06.example11;
import java.util.*;
/**
 * HashMap���÷�
 * ���������е�Ԫ�أ�ͨ����ֵ����
 */
public class Example11 {
	public static void main(String[] args) {
		Map map = new HashMap();            // ����Map����
		map.put("1", "Jack");               // �洢����ֵ
		map.put("2", "Rose");
		map.put("3", "Lucy");
		Set keySet = map.keySet();         // ��ȡ���ļ���
		Iterator it = keySet.iterator();  // �������ļ���
		while (it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key);  // ��ȡÿ��������Ӧ��ֵ
			System.out.println(key + ":" + value);
		}
	}
}
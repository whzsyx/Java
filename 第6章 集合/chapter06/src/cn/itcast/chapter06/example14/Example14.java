package cn.itcast.chapter06.example14;
import java.util.*;
/**
 * Map���÷�
 * LinkedHashMap���÷�
 */
public class Example14 {
	public static void main(String[] args) {
		Map map = new LinkedHashMap();	  // ����Map����
		map.put("1", "Jack");              // �洢����ֵ
		map.put("2", "Rose");
		map.put("3", "Lucy");
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key); // ��ȡÿ��������Ӧ��ֵ
			System.out.println(key + ":" + value);
		}
	}
}

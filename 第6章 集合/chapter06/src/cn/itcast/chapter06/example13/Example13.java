package cn.itcast.chapter06.example13;
import java.util.*;
/**
 * Map���÷�
 * values()������ʹ��
 */
public class Example13 {
	public static void main(String[] args) {
		Map map = new HashMap(); // ����Map����
		map.put("1", "Jack");     // �洢����ֵ
		map.put("2", "Rose");
		map.put("3", "Lucy");
		Collection values = map.values();
		Iterator it = values.iterator();
		while (it.hasNext()) {
			Object value = it.next();
			System.out.println(value);
		}
	}
}
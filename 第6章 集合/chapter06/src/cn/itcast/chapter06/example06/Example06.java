package cn.itcast.chapter06.example06;
import java.util.*;
/**
 * Iterator������ɾ��������Ԫ�ص����ַ�ʽ
 */
public class Example06 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ����ArrayList����
		list.add("Jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator it = list.iterator(); // ���Iterator����
		while (it.hasNext()) {         // �жϸü����Ƿ�����һ��Ԫ��
			Object obj = it.next();    // ��ȡ�ü����е�Ԫ��
			if ("Annie".equals(obj)) { // �жϸü����е�Ԫ���Ƿ�ΪAnnie
				//list.remove(obj);      // ɾ���ü����е�Ԫ��
				//break;               //1.ɾ�����������ѭ�����ٵ���
				it.remove();           //2.ʹ�õ�����������Ƴ�����
			}
		}
		System.out.println(list);
	}
}
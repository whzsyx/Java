package cn.itcast.chapter06.example02;
import java.util.*;
/**
 * LinkedList���ϵ�ʹ��
 */
public class Example02 {
	public static void main(String[] args) {
		LinkedList link = new LinkedList(); // ����LinkedList����
		link.add("stu1");
		link.add("stu2");
		link.add("stu3");
		link.add("stu4");
		System.out.println(link.toString()); // ȡ������ӡ�ü����е�Ԫ��
		link.add(3, "Student"); // ��ü�����ָ��λ�ò���Ԫ��
		link.addFirst("First"); // ��ü��ϵ�һ��λ�ò���Ԫ��
		System.out.println(link);
		System.out.println(link.getFirst()); // ȡ���ü����е�һ��Ԫ��
		link.remove(3); // �Ƴ��ü�����ָ��λ�õ�Ԫ��
		link.removeFirst(); // �Ƴ��ü����е�һ��Ԫ��
		System.out.println(link);
	}
}
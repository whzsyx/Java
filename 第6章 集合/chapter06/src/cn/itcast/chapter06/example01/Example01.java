package cn.itcast.chapter06.example01;
import java.util.ArrayList;
/**
 * ArrayList���ϴ�ȡԪ��
 */
public class Example01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // ����ArrayList����
		list.add("stu1"); // �򼯺������Ԫ��
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("���ϵĳ��ȣ�" + list.size()); // ��ȡ������Ԫ�صĸ���
		System.out.println("��2��Ԫ���ǣ�" + list.get(1)); // ȡ������ӡָ��λ�õ�Ԫ��
	}
}
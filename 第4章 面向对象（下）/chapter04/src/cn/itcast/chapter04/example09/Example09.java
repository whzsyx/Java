package cn.itcast.chapter04.example09;
// ����Student��
class Student {
	//final String name; // ʹ��final�ؼ�������name����
	final String name = "��ǿ"; // Ϊ��Ա���������ʼֵ
	// ����introduce()��������ӡѧ����Ϣ
	public void introduce() {
		System.out.println("�ҽ�" + name+"���Ǵ��ǲ��͵�ѧ��");
	}
}
// ���������
public class Example09 {
	public static void main(String[] args) {
		Student stu = new Student(); // ����Student���ʵ������
		stu.introduce(); // ����Student��introduce()����
	}
}
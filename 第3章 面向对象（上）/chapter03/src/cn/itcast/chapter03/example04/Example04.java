package cn.itcast.chapter03.example04;
/**
 * ʵ����ķ�װ
 */
class Student {
	private String name; // ��name����˽�л�
	private int age; // ��age����˽�л�

	// �����ǹ��е� getXxx �� setXxx ����
	public String getName() {
		return name;
	}

	public void setName(String stuName) {
		name = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int stuAge) {
		// �����ǶԴ���Ĳ������м��
		if (stuAge <= 0) {
			System.out.println("�Բ�������������䲻�Ϸ�...");
		} else {
			age = stuAge; // �����Ը�ֵ
		}
	}

	public void introduce() {
		System.out.println("��Һã��ҽ�" + name + ",�ҽ���" + age + "��!");
	}
}

public class Example04 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(-30);
		stu.setName("��ǿ");
		stu.introduce();
	}
}

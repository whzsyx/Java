package cn.itcast.chapter07.task01;
/**
 * ͼ����
 */
public class Books {
	int id;
	String name;// ͼ������
	double price;// ͼ�鵥��
	int number;// ͼ������
	double money;// �ܼ�
	String Publish;// ������

	public Books(int id, String name, double price, int number, double money,
			String Publish) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
		this.money = money;
		this.Publish = Publish;
	}

	@Override
	public String toString() {
		String message = "ͼ���ţ�" + id + "  ͼ�����ƣ�" + name + " �����磺" + Publish
				+ " ���ۣ�" + price + " ���������" + number;
		return message;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}

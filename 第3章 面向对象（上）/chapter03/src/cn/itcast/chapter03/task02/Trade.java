package cn.itcast.chapter03.task02;
public class Trade {
	public static void main(String[] args) {
		//����һ������   ����̬�������������ƣ���ֵ������ֱ��ʹ����������
		Bank.bankName = "��������";
		//���д�ӡ��ӭ���   ���þ�̬����
		Bank.welcome();
		//��������    ͨ�����췽�����п�������
		Bank bank = new Bank("С��", "654321", 100.0);
		//���д�����
		bank.deposit(500.00);
		//ȡ��ʱ�����������,ȡ��ʧ��
		bank.withdrawal("123456",200.0);
		//ȡ��ʱ����ʱ��ȡ��ʧ��
		bank.withdrawal("654321", 1000.0);
		//ȡ��ʱ������ȷ�������㣬ȡ��ɹ�
		bank.withdrawal("654321", 200.0);
		//���д�ӡ�������  ���þ�̬����
		Bank.welcomeNext();
	}
}


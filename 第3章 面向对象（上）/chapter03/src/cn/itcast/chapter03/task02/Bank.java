package cn.itcast.chapter03.task02;
public class Bank {
	static String bankName; // ���徲̬������������
	private String name ;//��������
	private String password ;//����
	private double balance ;//�˻����
	private double turnover ;//���׶�
	//��̬��������ӡ�����л�ӭ���
	static void welcome(){
		System.out.println("��ӭ����"+bankName+"-------------");
	}
	//���췽��  ����
	public Bank(String name,String password,double turnover){
			//��������ֵ����Ա����
			this.name = name;
			this.password = password;
			this.turnover = turnover;
			this.balance = turnover - 10;
			System.out.println(name+" �����ɹ����˻���� "+balance);	
	}
	//���
	public void deposit(double turnover){
		balance = balance + turnover;
		System.out.println(name+"���ã������˻� �Ѵ���"+turnover+"Ԫ��"
				+ "��ǰ��� "+balance+" Ԫ");
	} 
	//ȡ��
	public void withdrawal( String password,double turnover){
		//���ݴ���ı������Ա�����ȶԣ��ж������Ƿ���ȷ
		if(this.password != password){
			System.out.println("��������������");
			return;
		}
		//�ж�����Ƿ����
		if(balance - turnover >  0){
			balance = balance - turnover;
			System.out.println(name+"���ã������˻� ��ȡ��"+turnover+"Ԫ��"
					+ "��ǰ��� "+balance+" Ԫ");
		}else{
			System.out.println("�Բ����˻����㣡");
		}
	}
	//��̬��������ӡ�����л�ӭ�´ι������
	static void welcomeNext(){
		System.out.println("��Я������������ӭ�´ι���"+bankName+"-------------");
	}
}
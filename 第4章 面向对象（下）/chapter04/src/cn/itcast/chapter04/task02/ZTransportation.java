package cn.itcast.chapter04.task02;
/*
 * ר�����䳵��
 */
public class ZTransportation extends Transportation implements Careable{
	//�޲ι���
	public ZTransportation() {
		super();
	}
    //�вι��죺������š��ͺš�������
	public ZTransportation(String number, String model, String admin) {
		super(number, model, admin);
	}
	// ���䷽��
	public void transport() {
		System.out.println("��������С�����");
	}	
	// ��д������������
	public void  upKeep() {
		System.out.println("�������䳵���������!");
	}
}

package cn.itcast.chapter04.task02;
/*
 * ���������
 */
public class SendTask {
	private String number; // ��ݵ���
	private double goodsWeight; // ��������	
	public SendTask() {
		super(); //��ʡ��
	}
	public SendTask(String number, double goodsWeight) {
		this.number = number;
		this.goodsWeight = goodsWeight;
	}
	//��ǰ׼��
	public void sendBefore () {		
		System.out.println("������ʼ�����ֿ�����С�����");
		System.out.println("����������"+this.getGoodsWeight()+"kg");
		System.out.println("����������!");
		System.out.println("������װ���!");
		System.out.println("�˻�����֪ͨ!");		
		System.out.println("��ݵ��ţ�"+this.getNumber());
	}	
	//���ͻ���
	public void send(Transportation t,GPS tool) {		
		System.out.println("�˻���"+t.getAdmin()
				          +"���ڼ�ʻ���Ϊ"+t.getNumber()
				          +"��"+t.getModel()+"���ͻ��");
		t. transport();
		String showCoordinate = tool.showCoordinate();
		System.out.println("���ﵱǰ������Ϊ��"+showCoordinate);
	}
	//�ͺ����
	public void sendAfter(Transportation t) {		
		System.out.println("����������������ɣ�");
		System.out.println("�˻���"+t.getAdmin()
				          +"����ʻ�ı��Ϊ"+t.getNumber()
				          +"��"+t.getModel()+"�ѹ黹��");
	}	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getGoodsWeight() {
		return goodsWeight;
	}
	public void setGoodsWeight(double goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
}

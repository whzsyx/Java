package cn.itcast.chapter04.task02;
/*
 * ��ͨ������
 */
public abstract class Transportation {	
	private String number; 	// ���
	private String model; 	// �ͺ�
	private String admin; 	// �˻�������
	public Transportation() {
		super();//��ʡ��
	}	
	public Transportation(String number, String model, String admin) {
		this.number = number;
		this.model = model;
		this.admin = admin;
	}
	// ���䷽��
	public abstract void transport();
	// ���
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	// �ͺ�
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	// ������
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getAdmin() {
		return admin;
	}
}

package cn.itcast.chapter03.task01;

public class Market {// ����
	private String marketName;// ������
	private Product[] productArr;// ���еĲֿ�, ������������Ʒ		
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}	
	public Product[] getProductArr() {
		return productArr;
	}
	public void setProductArr(Product[] productArr) {		
		this.productArr = productArr;
	}
	Product sell(String name) {		// ����, ָ����Ʒ��
		for (int i = 0; i < productArr.length; i++)		// ѭ�������ֿ���ÿһ����Ʒ
			if (productArr[i].getProName() == name)		// ����ҵ����ֺ�Ҫ�����Ʒ����һ������Ʒ
				return productArr[i];					// ������Ʒ����
		return null;									// ѭ��������û�ҵ���Ʒ, ����null����û��
	}
}

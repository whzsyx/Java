package cn.itcast.chapter02.task01;
/**
 * �̳ǿ���嵥����
 */
public class StoreList {
	public static void main(String[] args) {
		// ƻ���ʼǱ�����
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 6988.88;
		String macConfig = "i5������4GB�ڴ�128G��̬Ӳ��";
		int macCount = 5;

		// ����Thinkpad�ʼǱ�����
		String thinkpadBrand = "ThinkpadT450";
		double thinkpadSize = 14.0;
		double thinkpadPrice = 5999.99;
		String thinkpadConfig = "i5������4GB�ڴ�500GӲ��";
		int thinkpadCount = 10;

		// ��˶ASUS�ʼǱ�����
		String ASUSBrand = "ASUS-FL5800";
		double ASUSSize = 15.6;
		double ASUSPrice = 4999.50;
		String ASUSConfig = "i7������4GB�ڴ�128G��̬Ӳ��";
		int ASUSCount = 18;

		// �б���
		System.out.println("------------------------------�̳ǿ���嵥"
				+ "-----------------------------");
		System.out.println("Ʒ���ͺ�		�ߴ�	�۸�		����		�����");

		// �б��в�
		System.out.println(macBrand + "	" + macSize + "	" + macPrice + "	"
				+ macConfig + "	" + macCount);
		System.out.println(thinkpadBrand + "	" + thinkpadSize + "	"
				+ thinkpadPrice + "	" + thinkpadConfig + "	" + thinkpadCount);
		System.out.println(ASUSBrand + "	" + ASUSSize + "	" + ASUSPrice + "	"
				+ ASUSConfig + "	" + ASUSCount);

		// ͳ���ܿ����������ܽ��
		int totalCount = macCount + thinkpadCount + ASUSCount;
		double totalMoney = (macCount * macPrice)
				+ (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);

		// �б�ײ�
		System.out.println("--------------------"
				+ "-----------------------------------------------");
		System.out.println("�ܿ������" + totalCount);
		System.out.println("�����Ʒ�ܽ�" + totalMoney);

	}
}
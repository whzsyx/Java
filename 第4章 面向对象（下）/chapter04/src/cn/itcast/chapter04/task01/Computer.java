package cn.itcast.chapter04.task01;
//����
public class Computer { 
	// �����ϵ�USB���
	private USB[] usbArr = new USB[4];
	// �����������һ��USB�豸
	public void add(USB usb) {
		// ѭ���������в��
		for (int i = 0; i < usbArr.length; i++) {
			// �������һ���յ�
			if (usbArr[i] == null) {
				// ��usb�豸��������������
				usbArr[i] = usb;
				// ������֮�����ѭ��
				break; 
			}
		}
	}
	// ���ԵĿ�������
	public void powerOn() {
		// ѭ���������в��
		for (int i = 0; i < usbArr.length; i++) {
			// ����������豸
			if (usbArr[i] != null) {
				// ��USB�豸����
				usbArr[i].turnOn(); 
			}
		}
		System.out.println("���Կ����ɹ�");
	}
    //���Թػ�����
	public void powerOff() {
		for (int i = 0; i < usbArr.length; i++) {
			if (usbArr[i] != null) {
				usbArr[i].turnOff();
			}
		}
		System.out.println("���Թػ��ɹ�");
	}
}

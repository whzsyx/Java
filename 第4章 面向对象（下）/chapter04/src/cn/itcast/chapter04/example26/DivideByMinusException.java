package cn.itcast.chapter04.example26;

// ����Ĵ������Զ���һ���쳣��̳���Exception
public class DivideByMinusException extends Exception {
	public DivideByMinusException() {
		super(); // ����Exception�޲εĹ��췽��
	}

	public DivideByMinusException(String message) {
		super(message); // ����Exception�вεĹ��췽��
	}
}

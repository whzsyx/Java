package cn.itcast.chapter05.example22;
/**
 * switch����String���͵�֧��
 */
public class Example22 {
	public static void main(String[] args) {
		String week = "Friday";
		switch (week) {
		case "Monday":
			System.out.println("����һ");
			break;
		case "Tuesday":
			System.out.println("���ڶ�");
			break;
		case "Wednesday":
			System.out.println("������");
			break;
		case "Thursday":
			System.out.println("������");
			break;
		case "Friday":
			System.out.println("������");
			break;
		case "Saturday":
			System.out.println("������");
			break;
		case "Sunday":
			System.out.println("������");
			break;
		default:
			System.out.println("����������...");
		}
	}
}


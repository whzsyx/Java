package cn.itcast.chapter05.example18;
import java.util.Random;
/**
 * Random���еĳ��÷���
 */
public class Example18 {
	public static void main(String[] args) {
		Random r1 = new Random(); // ����Randomʵ������
		System.out.println("����float���������: " + r1.nextFloat());
		System.out.println("����0~100֮��int���͵������:" + r1.nextInt(100));
		System.out.println("����double���͵������:" + r1.nextDouble());
	}
}

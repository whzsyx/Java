package cn.itcast.chapter04.example17;
// ����Animal��
class Animal {
   //��дObject���toString()����
   public String toString(){
	return "����һ���������";	   
   }
}
// ���������
public class Example17 {
	public static void main(String[] args) {
		Animal animal = new Animal(); // ����Animal�����
		System.out.println(animal.toString()); // ����toString()��������ӡ
	}
}

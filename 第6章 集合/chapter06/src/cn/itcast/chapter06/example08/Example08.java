package cn.itcast.chapter06.example08;
import java.util.*;
class Student {
	String id;
	String name;		    		 
	public Student(String id,String name) {	     // �������췽��
		this.id=id;
		this.name = name;
	}
	public String toString() {			              // ��дtoString()����
		return id+":"+name;
	}
}
/**
 * HashSet���ϵ��÷�
 */
public class Example08 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();		              // ����HashSet����
		Student stu1 = new Student("1", "Jack");   // ����Student����
		Student stu2 = new Student("2", "Rose");
		Student stu3 = new Student("2", "Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}
}

package cn.itcast.chapter07.task01;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordBooksOrder {
	static ArrayList<Books> booksList = new ArrayList<Books>();// �������
	public static void main(String[] args) {
		init();// ��ʼ�����
		// �����������ͼ����Ϣ��ӡ����
		for (int i = 0; i < booksList.size(); i++) {
			System.out.println(booksList.get(i));
		}
		while (true) {
			// ��ȡ����̨�������Ϣ
			Scanner scan = new Scanner(System.in);
			System.out.print("������ͼ���ţ�");
			int bookId = scan.nextInt();
			Books stockBooks = getBooksById(bookId);// ���������ͼ���Ż�ȡͼ����Ϣ
			if (stockBooks != null) {// �ж��Ƿ���ڴ�ͼ��
				System.out.println("��ǰͼ����Ϣ" + stockBooks);
				System.out.print("�����빺��������");
				int bookNumber = scan.nextInt();
				if (bookNumber <= stockBooks.number) {// �жϿ���Ƿ��㹻
					// ��������Ϣ��װ��Books����
					Books books = new Books(stockBooks.id, stockBooks.name,
							stockBooks.price, bookNumber, stockBooks.price
									* bookNumber, stockBooks.Publish);
					FileUtil.saveBooks(books);// ���������ݱ����������ļ�
					// �޸Ŀ��
					stockBooks.setNumber(stockBooks.number - bookNumber);
				} else {
					System.out.println("��治�㣡");
				}
			} else {
				System.out.println("ͼ�����������");
			}
		}
	}
	/**
	 * ��ʼ�������ͼ�����Ϣ ��ͼ��ŵ������
	 */
	private static void init() {
		Books goods1 = new Books(101, "Java��������", 44.50, 100, 4450.00,
				"�廪��ѧ������");
		Books goods2 = new Books(102, "Java���˼��", 108.00, 50, 5400.00,
				"��е��ҵ������");
		Books goods3 = new Books(103, "���Java����", 99.00, 100, 9900.00,
				"���ӹ�ҵ������");
		booksList.add(goods1);
		booksList.add(goods2);
		booksList.add(goods3);
	}
	/**
	 * ���������ͼ���Ų���ͼ����Ϣ ѭ�����������ͼ����Ϣ���ҵ�ͼ������ȵ�ȡ��
	 */
	private static Books getBooksById(int bookId) {
		for (int i = 0; i < booksList.size(); i++) {
			Books thisBooks = booksList.get(i);
			if (bookId == thisBooks.id) {
				return thisBooks;
			}
		}
		return null;
	}
}